package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ClimbingStairsTest {

    ClimbingStairs climbingStairs;

    @BeforeEach
    void setUp() {
        climbingStairs = new ClimbingStairs();
    }

    @AfterEach
    void tearDown() {
        climbingStairs = null;
    }

    @Test
    void testExample1() {
        int n = 2;
        int expected = 2;

        int result = climbingStairs.climbStairs(n);

        assertEquals(expected, result);
    }

    @Test
    void testExample2() {
        int n = 3;
        int expected = 3;

        int result = climbingStairs.climbStairs(n);

        assertEquals(expected, result);
    }

    @Test
    void testMinimumInput() {
        int n = 1;
        int expected = 1;

        int result = climbingStairs.climbStairs(n);

        assertEquals(expected, result);
    }

    @Test
    void testSmallInput() {
        int n = 5;
        int expected = 8; // Fibonacci sequence: 1, 2, 3, 5, 8, ...

        int result = climbingStairs.climbStairs(n);

        assertEquals(expected, result);
    }

    @Test
    void testMediumInput() {
        int n = 10;
        int expected = 89; // Fibonacci sequence: ... 34, 55, 89, ...

        int result = climbingStairs.climbStairs(n);

        assertEquals(expected, result);
    }

    @Test
    void testLargeInput() {
        int n = 45;
        int expected = 1836311903; // Fibonacci value for n=45

        int result = climbingStairs.climbStairs(n);

        assertEquals(expected, result);
    }
}