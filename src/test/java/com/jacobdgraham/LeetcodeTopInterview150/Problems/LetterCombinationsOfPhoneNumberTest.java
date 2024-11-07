package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LetterCombinationsOfPhoneNumberTest {
    private LetterCombinationsOfPhoneNumber letterCombinationsOfPhoneNumber;

    @BeforeEach
    void setUp() {
        letterCombinationsOfPhoneNumber = new LetterCombinationsOfPhoneNumber();
    }

    @AfterEach
    void tearDown() {
        letterCombinationsOfPhoneNumber = null;
    }

    @Test
    void testExample1() {
        String input = "23";
        List<String> expected = List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        List<String> result = letterCombinationsOfPhoneNumber.letterCombinations(input);

        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    void testExample2EmptyInput() {
        String input = "";
        List<String> result = letterCombinationsOfPhoneNumber.letterCombinations(input);

        assertTrue(result.isEmpty());
    }

    @Test
    void testExample3SingleDigit() {
        String input = "2";
        List<String> expected = List.of("a", "b", "c");
        List<String> result = letterCombinationsOfPhoneNumber.letterCombinations(input);

        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    void testTwoDigits() {
        String input = "56";
        List<String> expected = List.of("jm", "jn", "jo", "km", "kn", "ko", "lm", "ln", "lo");
        List<String> result = letterCombinationsOfPhoneNumber.letterCombinations(input);

        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    void testMaximumInputLength() {
        String input = "2345";
        List<String> result = letterCombinationsOfPhoneNumber.letterCombinations(input);

        // We check that the number of combinations equals 3^4 (since each digit maps to 3 letters).
        assertEquals(81, result.size());
    }

    @Test
    void testAllDigits() {
        String input = "79";
        List<String> expected = List.of("pw", "px", "py", "pz", "qw", "qx", "qy", "qz", "rw", "rx", "ry", "rz", "sw", "sx", "sy", "sz");
        List<String> result = letterCombinationsOfPhoneNumber.letterCombinations(input);

        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

}
