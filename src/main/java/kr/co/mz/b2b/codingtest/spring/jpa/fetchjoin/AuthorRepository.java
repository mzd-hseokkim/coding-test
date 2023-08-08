package kr.co.mz.b2b.codingtest.spring.jpa.fetchjoin;

import jakarta.annotation.Nonnull;
import kr.co.mz.b2b.codingtest.spring.jpa.onetomany.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * N+1 문제를 없애기 위해 Fetch Join을 이용해 Author와 그의 모든 Book을 가져오는 findById 메소드를 완성하세요.
 * <p>
 * 제한시간: 5분
 */
public interface AuthorRepository extends JpaRepository<Author, Long> {
    // TODO 완성하세요.
    Optional<Author> findByIdWithBook(@Nonnull @Param("authorId") Long authorId);
}
