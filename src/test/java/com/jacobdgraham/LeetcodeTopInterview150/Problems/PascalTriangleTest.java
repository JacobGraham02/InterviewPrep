package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleTest {

    PascalTriangle pascalTriangle;

    @BeforeEach
    void setUp() {
        pascalTriangle = new PascalTriangle();
    }

    @AfterEach
    void tearDown() {
        pascalTriangle = null;
    }

    @Test
    void testSingleRow() {
        int numRows = 1;
        List<List<Integer>> expected = List.of(List.of(1));
        List<List<Integer>> result = pascalTriangle.generate(numRows);

        assertEquals(expected, result);
    }

    @Test
    void testTwoRows() {
        int numRows = 2;
        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(1, 1)
        );
        List<List<Integer>> result = pascalTriangle.generate(numRows);

        assertEquals(expected, result);
    }

    @Test
    void testFiveRows() {
        int numRows = 5;
        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1),
                List.of(1, 4, 6, 4, 1)
        );
        List<List<Integer>> result = pascalTriangle.generate(numRows);

        assertEquals(expected, result);
    }

    @Test
    void testEdgeCaseMaximumRows() {
        int numRows = 30;
        List<List<Integer>> result = pascalTriangle.generate(numRows);

        assertEquals(30, result.size());
        assertEquals(List.of(1), result.get(0)); // First row
        assertEquals(List.of(1, 1), result.get(1)); // Second row
        assertEquals(30, result.get(29).size()); // Last row has 30 elements
    }

    @Test
    void testRowValuesAreCorrect() {
        int numRows = 7;
        List<List<Integer>> result = pascalTriangle.generate(numRows);

        List<Integer> row5 = result.get(4); // Row 5 (0-indexed)
        assertEquals(List.of(1, 4, 6, 4, 1), row5);

        List<Integer> row6 = result.get(5); // Row 6 (0-indexed)
        assertEquals(List.of(1, 5, 10, 10, 5, 1), row6);
    }
}