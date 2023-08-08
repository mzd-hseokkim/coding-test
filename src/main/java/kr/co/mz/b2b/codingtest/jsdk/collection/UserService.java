package kr.co.mz.b2b.codingtest.jsdk.collection;

import java.util.List;
import java.util.Map;


/**
 * User 클래스는 아래와 같이 정의되어 있습니다.
 *
 * <p>
 * 제한시간: 15분
 */
public class UserService {
    /**
     * 주어진 List<User>에서 User의 도시(city)를 키로, 해당 도시에 속하는 User 객체들의 리스트를 값으로 하는 Map을 반환하는 메소드를 작성하세요.
     * 반드시 Stream API를 이용하세요.
     *
     * @param users User 목록
     * @return city 기준으로 그룹핑된 map
     */
    public Map<String, List<User>> groupUsersByCity(List<User> users) {
        // TODO: 여기에 코드를 작성하세요.
        return null; // TODO 리턴 값을 변경하세요.
    }

    /**
     * 해당 맵을 이용하여 주어진 도시의 사용자들의 나이 평균을 계산하는 메소드를 작성하세요.
     * 반드시 Stream API를 이용하세요.
     *
     * @param groupedUsers city 기준으로 그룹핑된 map
     * @param city         조회 대상 도시
     * @return 대상 도시 사람들의 평균 나이
     */
    public double calculateAverageAgeForCity(Map<String, List<User>> groupedUsers, String city) {
        // TODO: 여기에 코드를 작성하세요.
        return 0; // TODO 리턴값을 변경하세요.
    }
}


record User(
        String name,
        int age,
        String city
) {
}