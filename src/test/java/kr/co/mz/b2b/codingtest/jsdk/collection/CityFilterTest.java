package kr.co.mz.b2b.codingtest.jsdk.collection;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CityFilterTest {
    @Test
    public void testFilterCitiesByPopulation() {
        CityFilter filter = new CityFilter();

        HashMap<String, Integer> cities = new HashMap<>();
        cities.put("Seoul", 9700000);
        cities.put("Busan", 3400000);
        cities.put("Daegu", 2400000);
        cities.put("Incheon", 2900000);

        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("Seoul", 9700000);
        expected.put("Busan", 3400000);

        HashMap<String, Integer> result = filter.filterCitiesByPopulation(cities, 3000000);

        assertEquals(expected, result);
    }
}
