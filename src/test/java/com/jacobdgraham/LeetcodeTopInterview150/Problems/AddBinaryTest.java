package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

    AddBinary addBinary;

    @BeforeEach
    void setUp() {
        addBinary = new AddBinary();
    }

    @AfterEach
    void tearDown() {
        addBinary = null;
    }

    @Test
    void testExample1() {
        String a = "11";
        String b = "1";
        String expected = "100";

        String result = addBinary.addBinary(a, b);

        assertEquals(expected, result);
    }

    @Test
    void testExample2() {
        String a = "1010";
        String b = "1011";
        String expected = "10101";

        String result = addBinary.addBinary(a, b);

        assertEquals(expected, result);
    }

    @Test
    void testUnequalLengths() {
        String a = "1";
        String b = "111";
        String expected = "1000";

        String result = addBinary.addBinary(a, b);

        assertEquals(expected, result);
    }

    @Test
    void testBothZeros() {
        String a = "0";
        String b = "0";
        String expected = "0";

        String result = addBinary.addBinary(a, b);

        assertEquals(expected, result);
    }

    @Test
    void testOneEmptyString() {
        String a = "";
        String b = "101";
        String expected = "101";

        String result = addBinary.addBinary(a, b);

        assertEquals(expected, result);
    }

    @Test
    void testCarryOver() {
        String a = "111";
        String b = "111";
        String expected = "1110";

        String result = addBinary.addBinary(a, b);

        assertEquals(expected, result);
    }

    @Test
    void testLargeInputs() {
        String a = "11111111111111111111";
        String b = "1";
        String expected = "100000000000000000000";

        String result = addBinary.addBinary(a, b);

        assertEquals(expected, result);
    }
}