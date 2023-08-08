package kr.co.mz.b2b.codingtest.spring.jpa.onetomany;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // TODO: Author 와 Book 간의 1:N 관계 설정

    public void addBook(Book book) {
        // TODO 구현하세요.
    }

    public List<Book> getBooks() {
        // TODO 구현하세요.
        return null;
    }
}