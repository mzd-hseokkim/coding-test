package kr.co.mz.b2b.codingtest.jsdk.collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumBelowThresholdTest {
    @Test
    public void testSumBelowThreshold() {
        SumBelowThreshold calculator = new SumBelowThreshold();

        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 5, 8, 10, 3, 7));
        int result = calculator.sumBelowThreshold(numbers, 6);

        int expected = 9;  // 1 + 5 + 3 = 9
        assertEquals(expected, result);
    }
}
