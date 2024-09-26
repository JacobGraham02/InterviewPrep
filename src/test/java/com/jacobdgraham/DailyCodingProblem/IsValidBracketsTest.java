package com.jacobdgraham.DailyCodingProblem;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IsValidBracketsTest {
    
     private IsValidBrackets isValidBrackets;

    @BeforeEach
    void setUp() {
        isValidBrackets = new IsValidBrackets();
    }

    @AfterEach
    void tearDown() {
        isValidBrackets = null;
    }

    @Test
    void testValidBrackets_1() {
        String input = "([])[]({})";
        assertTrue(isValidBrackets.isValid(input));
    }

    @Test
    void testValidBrackets_2() {
        String input = "()[]{}";
        assertTrue(isValidBrackets.isValid(input));
    }

    @Test
    void testInvalidBrackets_1() {
        String input = "([)]";
        assertFalse(isValidBrackets.isValid(input));
    }

    @Test
    void testInvalidBrackets_2() {
        String input = "((()";
        assertFalse(isValidBrackets.isValid(input));
    }

    @Test
    void testEmptyString() {
        String input = "";
        assertTrue(isValidBrackets.isValid(input));
    }

    @Test
    void testSingleOpeningBracket() {
        String input = "[";
        assertFalse(isValidBrackets.isValid(input));
    }

    @Test
    void testSingleClosingBracket() {
        String input = ")";
        assertFalse(isValidBrackets.isValid(input));
    }

    @Test
    void testOnlyBrackets() {
        String input = "{}[]()";
        assertTrue(isValidBrackets.isValid(input));
    }
}
