package kr.co.mz.b2b.codingtest.jsdk.controlflow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberTransformerTest {

    @Test
    public void testTransformTo1() {
        NumberTransformer transformer = new NumberTransformer();

        int sample = 6;
        int result = transformer.transformTo1(sample);

        assertEquals(8, result);
    }
}