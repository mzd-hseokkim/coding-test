package kr.co.mz.b2b.codingtest.jsdk.collection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberListTest {
    @Test
    public void testNumbersListFunctions() {
        NumberList numbers = new NumberList();

        numbers.addNumber(5);
        numbers.addNumber(10);
        numbers.addNumber(15);
        numbers.addNumber(10);

        assertEquals(10.0, numbers.getAverage(), 0.001);

        numbers.removeNumber(10);

        assertEquals(10.0, numbers.getAverage(), 0.001);
    }
}
