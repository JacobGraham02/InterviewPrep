package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {

    LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters;

    @BeforeEach
    void setUp() {
        longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
    }

    @AfterEach
    void tearDown() {
        longestSubstringWithoutRepeatingCharacters = null;
    }

    @Test
    void testExample1() {
        String input = "abcabcbb";
        int expected = 3;
        assertEquals(expected, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input));
    }

    @Test
    void testExample2() {
        String input = "bbbbb";
        int expected = 1;
        assertEquals(expected, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input));
    }

    @Test
    void testExample3() {
        String input = "pwwkew";
        int expected = 3;
        assertEquals(expected, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input));
    }

    @Test
    void testEmptyString() {
        String input = "";
        int expected = 0;
        assertEquals(expected, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input));
    }

    @Test
    void testSingleCharacterString() {
        String input = "a";
        int expected = 1;
        assertEquals(expected, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input));
    }

    @Test
    void testAllUniqueCharacters() {
        String input = "abcdef";
        int expected = 6;
        assertEquals(expected, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input));
    }

    @Test
    void testMixedCharacters() {
        String input = "dvdf";
        int expected = 3; // "vdf" is the longest substring without repeating characters
        assertEquals(expected, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input));
    }

    @Test
    void testStringWithSpaces() {
        String input = "abc abcbb";
        int expected = 4; // "abc " (with a space) is the longest substring without repeating characters
        assertEquals(expected, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input));
    }
}
