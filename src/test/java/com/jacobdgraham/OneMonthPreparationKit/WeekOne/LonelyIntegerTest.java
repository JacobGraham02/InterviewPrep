package com.jacobdgraham.OneMonthPreparationKit.WeekOne;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LonelyIntegerTest {
    
    private static LonelyInteger lonelyInteger;

    @BeforeAll
    static void setUp() {
        lonelyInteger = new LonelyInteger();
    }

    @Test
    public void testSingleLonely() {
        List<Integer> input = Arrays.asList(1, 2, 2);
        assertEquals(1, lonelyInteger.lonelyInteger(input),
                     "Test failed for input where 1 is lonely.");
    }

    @Test
    public void testMultipleDuplicatesLonelyAtEnd() {
        List<Integer> input = Arrays.asList(2, 3, 2, 3, 4);
        assertEquals(4, lonelyInteger.lonelyInteger(input),
                     "Test failed for input where the lonely integer is at the end.");
    }

    @Test
    public void testMultipleDuplicatesLonelyAtStart() {
        List<Integer> input = Arrays.asList(5, 3, 4, 3, 4);
        assertEquals(5, lonelyInteger.lonelyInteger(input),
                     "Test failed for input where the lonely integer is at the start.");
    }

    @Test
    public void testAllDuplicatesNoLonely() {
        List<Integer> input = Arrays.asList(1, 1, 2, 2);
        assertEquals(0, lonelyInteger.lonelyInteger(input),
                     "Test failed for input with all duplicates and no lonely integer.");
    }

    @Test
    public void testSingleElement() {
        List<Integer> input = Arrays.asList(42);
        assertEquals(42, lonelyInteger.lonelyInteger(input),
                     "Test failed for input with a single element.");
    }

    @Test
    public void testEmptyList() {
        List<Integer> input = Arrays.asList();
        assertEquals(0, lonelyInteger.lonelyInteger(input),
                     "Test failed for empty list input.");
    }

    @AfterAll
    static void tearDown() {
        lonelyInteger = null;
    }
}
