package kr.co.mz.b2b.codingtest.jsdk.controlflow;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommonNumberPrinterTest {

    @Test
    public void testPrintCommonNumbers() {
        CommonNumberPrinter printer = new CommonNumberPrinter();
        int[] sample1 = {1, 2, 3, 4, 5};
        int[] sample2 = {4, 5, 6, 7, 8, 1};

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        printer.printCommonNumbers(sample1, sample2);

        String outputStr = output.toString().trim();
        assertTrue(outputStr.contains("1"));
        assertTrue(outputStr.contains("4"));
        assertTrue(outputStr.contains("5"));
    }
}

