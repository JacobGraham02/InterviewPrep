package com.jacobdgraham.LeetcodeTopInterview150.TwoPointers;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {
    
    private ValidPalindrome validPalindrome;

    @BeforeEach
    void setUp() {
        validPalindrome = new ValidPalindrome();
    }

    @AfterEach
    void tearDown() {
        validPalindrome = null;
    }

        @Test
    void testValidPalindrome_withValidPalindrome() {
        String input = "A man, a plan, a canal: Panama";
        assertTrue(validPalindrome.isPalindrome(input), "Expected palindrome for input: " + input);
    }

    @Test
    void testValidPalindrome_withNonPalindrome() {
        String input = "race a car";
        assertFalse(validPalindrome.isPalindrome(input), "Expected non-palindrome for input: " + input);
    }

    @Test
    void testValidPalindrome_withEmptyString() {
        String input = "";
        assertTrue(validPalindrome.isPalindrome(input), "Expected palindrome for an empty string.");
    }

    @Test
    void testValidPalindrome_withOnlySpaces() {
        String input = "     ";
        assertTrue(validPalindrome.isPalindrome(input), "Expected palindrome for string with only spaces.");
    }

    @Test
    void testValidPalindrome_withSingleCharacter() {
        String input = "a";
        assertTrue(validPalindrome.isPalindrome(input), "Expected palindrome for single character string.");
    }
}
