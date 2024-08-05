package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class hIndexTest {
    
    private static HIndex hIndex;

    @BeforeAll
    static void setUp() {
        hIndex = new HIndex();
    }

    @AfterAll
    static void tearDown() {
        hIndex = null;
    }

    @Test
    public void testExample1() {
        int[] citations = {3, 0, 6, 1, 5};
        int expected = 3;
        int actual = hIndex.hIndex(citations);
        assertEquals(expected, actual, "Test Example 1 Failed");
    }

    @Test
    public void testExample2() {
        int[] citations = {1, 2, 3, 4, 5};
        int expected = 3;
        int actual = hIndex.hIndex(citations);
        assertEquals(expected, actual, "Test Example 2 Failed");
    }

    @Test
    public void testExample3() {
        int[] citations = {7, 6, 4, 3, 1};
        int expected = 3;
        int actual = hIndex.hIndex(citations);
        assertEquals(expected, actual, "Test Example 3 Failed");
    }

    @Test
    public void testSingleElement() {
        int[] citations = {5};
        int expected = 1;
        int actual = hIndex.hIndex(citations);
        assertEquals(expected, actual, "Test Single Element Failed");
    }

    @Test
    public void testEmptyArray() {
        int[] citations = {};
        int expected = 0;
        int actual = hIndex.hIndex(citations);
        assertEquals(expected, actual, "Test Empty Array Failed");
    }

    @Test
    public void testAllSameValues() {
        int[] citations = {4, 4, 4, 4};
        int expected = 4;
        int actual = hIndex.hIndex(citations);
        assertEquals(expected, actual, "Test All Same Values Failed");
    }

    @Test
    public void testDescendingOrder() {
        int[] citations = {10, 8, 5, 4, 3};
        int expected = 4;
        int actual = hIndex.hIndex(citations);
        assertEquals(expected, actual, "Test Descending Order Failed");
    }

    @Test
    public void testZeros() {
        int[] citations = {0, 0, 0, 0};
        int expected = 0;
        int actual = hIndex.hIndex(citations);
        assertEquals(expected, actual, "Test Zeros Failed");
    }

    @Test
    public void testIncreasingOrder() {
        int[] citations = {0, 1, 3, 5, 6};
        int expected = 3;
        int actual = hIndex.hIndex(citations);
        assertEquals(expected, actual, "Test Increasing Order Failed");
    }
}
