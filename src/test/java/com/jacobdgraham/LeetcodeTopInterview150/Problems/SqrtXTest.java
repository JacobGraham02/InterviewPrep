package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtXTest {

    SqrtX sqrtX;

    @BeforeEach
    void setUp() {
        sqrtX = new SqrtX();
    }

    @AfterEach
    void tearDown() {
        sqrtX = null;
    }

    @Test
    void testExample1() {
        int x = 4;
        int expected = 2;

        int result = sqrtX.mySqrt(x);

        assertEquals(expected, result);
    }

    @Test
    void testExample2() {
        int x = 8;
        int expected = 2;

        int result = sqrtX.mySqrt(x);

        assertEquals(expected, result);
    }

    @Test
    void testZeroInput() {
        int x = 0;
        int expected = 0;

        int result = sqrtX.mySqrt(x);

        assertEquals(expected, result);
    }

    @Test
    void testSmallNonPerfectSquare() {
        int x = 3;
        int expected = 1;

        int result = sqrtX.mySqrt(x);

        assertEquals(expected, result);
    }

    @Test
    void testLargePerfectSquare() {
        int x = 16;
        int expected = 4;

        int result = sqrtX.mySqrt(x);

        assertEquals(expected, result);
    }

    @Test
    void testLargeNonPerfectSquare() {
        int x = 18;
        int expected = 4;

        int result = sqrtX.mySqrt(x);

        assertEquals(expected, result);
    }

    @Test
    void testMaximumInput() {
        int x = Integer.MAX_VALUE;
        int expected = 46340; // sqrt(2^31 - 1) rounded down

        int result = sqrtX.mySqrt(x);

        assertEquals(expected, result);
    }

    @Test
    void testPerfectSquareInLargeRange() {
        int x = 2147395600; // Perfect square of 46340
        int expected = 46340;

        int result = sqrtX.mySqrt(x);

        assertEquals(expected, result);
    }
}