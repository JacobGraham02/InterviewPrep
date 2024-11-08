package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GenerateParenthesisTest {
    GenerateParenthesis generateParenthesis;

    @BeforeEach
    void setUp() {
        generateParenthesis = new GenerateParenthesis();
    }

    @AfterEach
    void tearDown() {
        generateParenthesis = null;
    }

    @Test
    void testExample1() {
        int n = 3;
        List<String> expected = List.of("((()))", "(()())", "(())()", "()(())", "()()()");
        List<String> result = generateParenthesis.generateParenthesis(n);

        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    void testExample2() {
        int n = 1;
        List<String> expected = List.of("()");
        List<String> result = generateParenthesis.generateParenthesis(n);

        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    void testTwoPairs() {
        int n = 2;
        List<String> expected = List.of("(())", "()()");
        List<String> result = generateParenthesis.generateParenthesis(n);

        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    void testFourPairs() {
        int n = 4;
        List<String> result = generateParenthesis.generateParenthesis(n);

        // There are 14 unique combinations of 4 pairs of well-formed parentheses.
        assertEquals(14, result.size());
    }

    @Test
    void testFivePairs() {
        int n = 5;
        List<String> result = generateParenthesis.generateParenthesis(n);

        // There are 42 unique combinations of 5 pairs of well-formed parentheses.
        assertEquals(42, result.size());
    }

    @Test
    void testEdgeCaseSinglePair() {
        int n = 1;
        List<String> result = generateParenthesis.generateParenthesis(n);

        assertEquals(1, result.size());
        assertTrue(result.contains("()"));
    }
}
