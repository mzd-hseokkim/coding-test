package kr.co.mz.b2b.codingtest.spring.core;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class LibraryServiceTest {

    @Autowired
    private LibraryService libraryService;

    @Test
    public void testAddBook() {
        Book book = new Book("Effective Java", "Joshua Bloch");
        libraryService.addBook(new Book("Spring in Action", "Craig Walls"));
        libraryService.addBook(new Book("Java Basics", "John Doe"));
        libraryService.addBook(book);

        assertTrue(libraryService.getAllBooks().contains(book));
    }

    @Test
    public void testGetAllBooks() {
        List<Book> books = libraryService.getAllBooks();

        assertNotNull(books);
        assertEquals(3, books.size());  // 2 books from setUp and 1 from testAddBook
    }

    @Test
    public void testFindBookByTitle() {
        Optional<Book> bookOpt = libraryService.findBookByTitle("Java Basics");

        assertTrue(bookOpt.isPresent());
        assertEquals("Java Basics", bookOpt.get().title());
        assertEquals("John Doe", bookOpt.get().author());
    }

    @Test
    public void testFindBookByTitleNotFound() {
        Optional<Book> bookOpt = libraryService.findBookByTitle("Non-Existent Title");
        assertFalse(bookOpt.isPresent());

        Optional<Book> bookOpt2 = libraryService.findBookByTitle("Non-Existent Title2");
        assertFalse(bookOpt2.isPresent());
    }
}

