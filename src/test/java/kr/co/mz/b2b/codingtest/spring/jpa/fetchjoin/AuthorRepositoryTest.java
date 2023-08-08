package kr.co.mz.b2b.codingtest.spring.jpa.fetchjoin;

import jakarta.persistence.EntityManager;
import kr.co.mz.b2b.codingtest.spring.jpa.onetomany.Author;
import kr.co.mz.b2b.codingtest.spring.jpa.onetomany.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Transactional
@SpringBootTest
public class AuthorRepositoryTest {
    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    EntityManager entityManager;

    @Test
    public void testFindById() {
        // Given: 위의 테스트에서와 마찬가지로 Author와 Book 데이터를 준비하고 저장합니다.
        Author author = new Author();
        author.setName("J.K. Rowling");

        Book book1 = new Book();
        book1.setTitle("Harry Potter and the Philosopher's Stone");

        Book book2 = new Book();
        book2.setTitle("Harry Potter and the Chamber of Secrets");

        author.addBook(book1);
        author.addBook(book2);

        Author savedAuthor = authorRepository.save(author);

        // Clear persistence context to force actual SQL on next query
        entityManager.clear();

        // When: Fetch Join을 사용하여 Author와 그의 모든 Book을 가져옵니다.
        Author foundAuthor = authorRepository.findByIdWithBook(savedAuthor.getId()).orElse(null);

        // Then:
        assertNotNull(foundAuthor);
        assertEquals(2, foundAuthor.getBooks().size());

        // Ensure no additional SQL queries are fired
        foundAuthor.getBooks().forEach(book -> assertNotNull(book.getTitle()));
    }
}
