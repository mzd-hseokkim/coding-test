package kr.co.mz.b2b.codingtest.spring.web;

import jakarta.validation.Valid;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 아래 조건에 부합하는 코드를 작성하세요.
 * <p>
 * 당신은 사용자로부터 입력을 받는 User 객체와 해당 객체를 처리하는 UserController를 작성하고 있습니다.
 * <p>
 * 제한시간 25분
 */
@Configuration
public class WebMvcConfiguration {
}

/**
 * User Record 클래스
 * 아래 코드에 Validation annotation을 추가하세요.
 *
 * @param email 이메일 email은 유효한 이메일 형식을 가져야 합니다.
 * @param name  이름 name은 5~15자 사이여야 하며, null이거나 빈 문자열이면 안 됩니다.
 */
record User(
        String name,
        String email) {
}

@RestController
@RequestMapping("/users")
class UserController {
    // TODO 구현하세요.
    @PostMapping
    public String getUser(@Valid @RequestBody User user) {
        // TODO name='a-user', email='a@google.com' 사용자만 존재합니다.
        //      그렇지 않은 경우 UserNotFoundException이 throw 되어야하고 최종적으로 "User Not Found"라는 메시지가 클라이언트로 전달되어야 합니다.

        if (!user.name().equals("a-user") || !user.email().equals("a@google.com")) {
            // TODO 구현하세요.
            return null;
        }

        // 그대로 두세요.
        return user.name();
    }
}

@RestControllerAdvice
class GlobalExceptionHandler {
    // TODO 구현하세요.
    //      UserNotFoundexception이 throw된 경우 404 Not Found로 처리되어야 합니다. 그리고 body로는 "User not found"가 출력되어야 합니다.
    //      MethodArgumentNotValidException이 throw된 경우 400 BAD REQUEST로 처리되어야 합니다. e.message를 body로 사용하세요.
    //      그 외의 Exception을 500 INTERNAL SERVER ERROR로 처리되어야 합니다. e.message를 body로 사용하세요. - 예제로 만들어 둠

    /**
     * 예제 Exception Handling 메소드
     *
     * @param e exception
     * @return ResponseEntity
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }
}

class UserNotFoundException extends RuntimeException {
    // TODO 구현하세요.
}