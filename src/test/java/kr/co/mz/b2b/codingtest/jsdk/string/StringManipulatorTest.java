package kr.co.mz.b2b.codingtest.jsdk.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManipulatorTest {
    @Test
    public void testTransformString() {
        StringManipulator manipulator = new StringManipulator();

        String input = "Hello World!";
        String result = manipulator.transformString(input);

        assertEquals("HELLOWORLD!", result);
    }

    @Test
    public void testCapitalizeEachWord() {
        StringManipulator manipulator = new StringManipulator();

        String input = "java is FUN";
        String result = manipulator.capitalizeEachWord(input);

        assertEquals("Java Is Fun", result);
    }
}
