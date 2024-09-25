package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanToIntegerTest {
    
    private RomanToInteger romanToInteger;

    @BeforeEach
    void setUp() {
        romanToInteger = new RomanToInteger();
    }

    @AfterEach
    void tearDown() {
        romanToInteger = null;
    }

     @Test
    void testExample1() {
        assertEquals(3, romanToInteger.romanToInt("III"));
    }

    @Test
    void testExample2() {
        assertEquals(58, romanToInteger.romanToInt("LVIII"));
    }

    @Test
    void testExample3() {
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }

    @Test
    void testSingleSymbols() {
        assertEquals(1, romanToInteger.romanToInt("I"));
        assertEquals(5, romanToInteger.romanToInt("V"));
        assertEquals(10, romanToInteger.romanToInt("X"));
        assertEquals(50, romanToInteger.romanToInt("L"));
        assertEquals(100, romanToInteger.romanToInt("C"));
        assertEquals(500, romanToInteger.romanToInt("D"));
        assertEquals(1000, romanToInteger.romanToInt("M"));
    }

    @Test
    void testSubtractiveNotation() {
        assertEquals(4, romanToInteger.romanToInt("IV"));
        assertEquals(9, romanToInteger.romanToInt("IX"));
        assertEquals(40, romanToInteger.romanToInt("XL"));
        assertEquals(90, romanToInteger.romanToInt("XC"));
        assertEquals(400, romanToInteger.romanToInt("CD"));
        assertEquals(900, romanToInteger.romanToInt("CM"));
    }

    @Test
    void testComplexNumbers() {
        assertEquals(14, romanToInteger.romanToInt("XIV"));
        assertEquals(27, romanToInteger.romanToInt("XXVII"));
        assertEquals(44, romanToInteger.romanToInt("XLIV"));
        assertEquals(68, romanToInteger.romanToInt("LXVIII"));
        assertEquals(83, romanToInteger.romanToInt("LXXXIII"));
        assertEquals(99, romanToInteger.romanToInt("XCIX"));
        assertEquals(141, romanToInteger.romanToInt("CXLI"));
        assertEquals(3999, romanToInteger.romanToInt("MMMCMXCIX"));
    }
}
