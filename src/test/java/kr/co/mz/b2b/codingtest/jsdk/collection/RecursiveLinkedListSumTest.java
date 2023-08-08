package kr.co.mz.b2b.codingtest.jsdk.collection;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursiveLinkedListSumTest {
    @Test
    public void testRecursiveSum() {
        RecursiveLinkedListSum calculator = new RecursiveLinkedListSum();

        LinkedList<Integer> numbers = new LinkedList<>(List.of(1, 5, 8, 10, 3, 7));
        int expected = 34;
        int result = calculator.recursiveSum(numbers);

        assertEquals(expected, result);
    }
}
