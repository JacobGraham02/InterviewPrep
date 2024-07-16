package com.jacobdgraham.OneMonthPreparationKit.WeekOne;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SparseArraysTest {
    
    private static SparseArrays sparseArrays;

    @BeforeAll
    static void setUp() {
        sparseArrays = new SparseArrays();
    }

        @Test
    public void testMatchingStrings_AllPresent() {
        List<String> strings = Arrays.asList("aba", "baba", "aba", "xzxb");
        List<String> queries = Arrays.asList("aba", "baba", "xzxb");
        List<Integer> expectedResults = Arrays.asList(2, 1, 1);
        assertEquals(expectedResults, sparseArrays.matchingStrings(strings, queries));
    }

    @Test
    public void testMatchingStrings_SomeAbsent() {
        List<String> strings = Arrays.asList("aba", "baba", "aba", "xzxb");
        List<String> queries = Arrays.asList("aba", "baba", "notpresent");
        List<Integer> expectedResults = Arrays.asList(2, 1, 0);
        assertEquals(expectedResults, sparseArrays.matchingStrings(strings, queries));
    }

    @Test
    public void testMatchingStrings_EmptyStrings() {
        List<String> strings = Arrays.asList();
        List<String> queries = Arrays.asList("aba", "baba");
        List<Integer> expectedResults = Arrays.asList(0, 0);
        assertEquals(expectedResults, sparseArrays.matchingStrings(strings, queries));
    }

    @Test
    public void testMatchingStrings_EmptyQueries() {
        List<String> strings = Arrays.asList("aba", "baba", "aba", "xzxb");
        List<String> queries = Arrays.asList();
        List<Integer> expectedResults = Arrays.asList();
        assertEquals(expectedResults, sparseArrays.matchingStrings(strings, queries));
    }

    @Test
    public void testMatchingStrings_BothEmpty() {
        List<String> strings = Arrays.asList();
        List<String> queries = Arrays.asList();
        List<Integer> expectedResults = Arrays.asList();
        assertEquals(expectedResults, sparseArrays.matchingStrings(strings, queries));
    }

    @AfterAll
    static void tearDown() {
        sparseArrays = null;
    }
}
