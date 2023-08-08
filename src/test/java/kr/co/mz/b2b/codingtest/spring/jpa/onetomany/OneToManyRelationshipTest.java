package kr.co.mz.b2b.codingtest.spring.jpa.onetomany;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
public class OneToManyRelationshipTest {
    @Autowired
    private EntityManager entityManager;

    @Test
    void testOneToOneRelationship() {
        Author author = new Author();
        author.setName("George Orwell");

        Book book1 = new Book();
        book1.setTitle("1984");

        Book book2 = new Book();
        book2.setTitle("Animal Farm");

        author.addBook(book1);
        author.addBook(book2);

        // TODO: 관계 설정

        entityManager.persist(author);

        entityManager.flush();
        entityManager.clear();

        Author foundAuthor = entityManager.find(Author.class, author.getId());
        assertEquals("George Orwell", foundAuthor.getName());
        assertEquals(2, foundAuthor.getBooks().size());
    }
}
