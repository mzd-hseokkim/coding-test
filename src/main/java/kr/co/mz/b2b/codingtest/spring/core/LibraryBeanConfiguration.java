package kr.co.mz.b2b.codingtest.spring.core;

import jakarta.annotation.Nonnull;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 당신은 도서관 관리 시스템을 개발 중입니다. 시스템에는 Book 클래스와 LibraryService 서비스 클래스가 있습니다.
 * LibraryService는 도서 추가, 삭제, 조회 등의 기능을 제공하며, 내부적으로 Book 리스트에 의존합니다.
 * <p></p>
 * 1. Book 클래스는 title과 author 두 개의 필드를 가지고 있습니다.
 * 2. LibraryService 클래스는 Book 리스트에 의존합니다. 이 의존성을 Constructor Injection을 통해 주입받도록 구현하세요.
 * 3. LibraryService에 addBook(Book book) 메소드를 구현하세요. 이 메소드는 새로운 책을 리스트에 추가합니다.
 * 4. LibraryService에  List<Book> getAllBooks() 메소드를 구현하세요. 이 메소드는 모든 책을 반환합니다.
 * 5. LibraryService에 Optional<Book> findBookByTitle(String title) 메소드를 구현하세요. 이 메소드는 제목으로 책을 찾아 옵셔널로 반환합니다.
 * <p>
 * 제한시간: 15분
 */
@Configuration
public class LibraryBeanConfiguration {
    @Bean
    public LibraryService libraryService() {
        return new LibraryService(new ArrayList<>());
    }
}

/**
 * Book 클래스
 */
record Book(String title, String author) {
}

/**
 * LibraryService를 구현하세요.
 * 위에서 설명한 대로 LibraryService는 Book 리스트에 의존합니다.
 */
class LibraryService {
    public LibraryService(@Nonnull List<Book> books) {
        // TODO 구현하세요.
    }

    public void addBook(@Nonnull Book book) {
        // TODO 구현하세요.
    }

    public List<Book> getAllBooks() {
        // TODO 구현하세요.
        return null;
    }

    public Optional<Book> findBookByTitle(@Nonnull String title) {
        // TODO 구현하세요.
        return Optional.empty();
    }
}

