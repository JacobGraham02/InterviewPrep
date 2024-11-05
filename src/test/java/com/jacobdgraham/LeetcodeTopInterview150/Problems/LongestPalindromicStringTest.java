package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LongestPalindromicStringTest {

    private LongestPalindromicString longestPalindromicString;

    @BeforeEach
    void setUp() {
        longestPalindromicString = new LongestPalindromicString();
    }

    @AfterEach
    void tearDown() {
        longestPalindromicString = null;
    }

    @Test
    void testExample1() {
        String input = "babad";
        String result = longestPalindromicString.longestPalindrome(input);
        assertTrue(result.equals("bab") || result.equals("aba"));  // Both "bab" and "aba" are valid outputs
    }

    @Test
    void testExample2() {
        String input = "cbbd";
        String expected = "bb";
        assertEquals(expected, longestPalindromicString.longestPalindrome(input));
    }

    @Test
    void testSingleCharacterString() {
        String input = "a";
        String expected = "a";
        assertEquals(expected, longestPalindromicString.longestPalindrome(input));
    }

    @Test
    void testAllCharactersSame() {
        String input = "aaaa";
        String expected = "aaaa";
        assertEquals(expected, longestPalindromicString.longestPalindrome(input));
    }

    @Test
    void testEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, longestPalindromicString.longestPalindrome(input));
    }

    @Test
    void testTwoCharacterStringWithPalindrome() {
        String input = "bb";
        String expected = "bb";
        assertEquals(expected, longestPalindromicString.longestPalindrome(input));
    }

    @Test
    void testNoPalindromeLongerThanOne() {
        String input = "abcde";
        String expected = "a";  // Any single character is valid
        String result = longestPalindromicString.longestPalindrome(input);
        assertEquals(1, result.length()); // Ensure that the length of the palindrome is 1
    }

    @Test
    void testLongerPalindromeInMiddle() {
        String input = "forgeeksskeegfor";
        String expected = "geeksskeeg";
        assertEquals(expected, longestPalindromicString.longestPalindrome(input));
    }
}
