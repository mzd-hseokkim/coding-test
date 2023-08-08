package kr.co.mz.b2b.codingtest.jsdk.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class UserServiceTest {
    @Test
    public void testGroupingAndAverageCalculation() {
        // Given
        User user1 = new User("Alice", 25, "Seoul");
        User user2 = new User("Bob", 30, "Seoul");
        User user3 = new User("Charlie", 40, "Busan");
        List<User> users = Arrays.asList(user1, user2, user3);

        UserService userService = new UserService();

        // When
        Map<String, List<User>> groupedUsers = userService.groupUsersByCity(users);
        double avgAgeForSeoul = userService.calculateAverageAgeForCity(groupedUsers, "Seoul");

        // Then
        assertThat(groupedUsers).isNotNull();
        assertThat(groupedUsers.get("Seoul").size()).isEqualTo(2);
        assertThat(avgAgeForSeoul).isEqualTo(27.5);
    }
}
