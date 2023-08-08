package kr.co.mz.b2b.codingtest.spring.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WebMvcConfigurationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testValidUser() {
        User validUser = new User("a-user", "a@google.com");
        ResponseEntity<String> response = restTemplate.postForEntity("/users", validUser, String.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    public void testInvalidUsername() {
        User invalidUser = new User("ex", "user@example.com");
        ResponseEntity<String> response = restTemplate.postForEntity("/users", invalidUser, String.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
        assertThat(response.getBody()).contains("name");
    }

    @Test
    public void testInvalidEmail() {
        User invalidUser = new User("exampleUser", "userexample");
        ResponseEntity<String> response = restTemplate.postForEntity("/users", invalidUser, String.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
        assertThat(response.getBody()).contains("email");
    }

    @Test
    public void testUserNotFoundException() {
        User notFoundUser = new User("exampleUser", "userexample@google.com");
        ResponseEntity<String> response = restTemplate.postForEntity("/users", notFoundUser, String.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
        assertThat(response.getBody()).contains("User not found");
    }

    // 다른 예외들에 대한 테스트 코드도 추가 가능...
}
