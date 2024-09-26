package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {
    
    LongestCommonPrefix longestCommonPrefix;

    @BeforeEach
    void setUp() {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    void testEmptyArray() {
        String[] strings = {};
        String result = longestCommonPrefix.longestCommonPrefix(strings);
        assertEquals("", result, "Expected empty string for empty array input.");
    }

    @Test
    void testSingleString() {
        String[] strings = {"alone"};
        String result = longestCommonPrefix.longestCommonPrefix(strings);
        assertEquals("alone", result, "Expected the string itself when only one string is in the array.");
    }

    @Test
    void testCommonPrefixExists() {
        String[] strings = {"flower", "flow", "flight"};
        String result = longestCommonPrefix.longestCommonPrefix(strings);
        assertEquals("fl", result, "Expected 'fl' as the longest common prefix.");
    }

    @Test
    void testNoCommonPrefix() {
        String[] strings = {"dog", "racecar", "car"};
        String result = longestCommonPrefix.longestCommonPrefix(strings);
        assertEquals("", result, "Expected empty string when there is no common prefix.");
    }

    @Test
    void testAllStringsIdentical() {
        String[] strings = {"test", "test", "test"};
        String result = longestCommonPrefix.longestCommonPrefix(strings);
        assertEquals("test", result, "Expected the string itself when all strings are identical.");
    }

    @Test
    void testPrefixIsEntireShortestString() {
        String[] strings = {"java", "javascript", "javanese", "javafx"};
        String result = longestCommonPrefix.longestCommonPrefix(strings);
        assertEquals("java", result, "Expected 'java' as the longest common prefix.");
    }

    @Test
    void testArrayWithEmptyString() {
        String[] strings = {"", "empty", "nothing"};
        String result = longestCommonPrefix.longestCommonPrefix(strings);
        assertEquals("", result, "Expected empty string when one of the strings is empty.");
    }

    @Test
    void testAllStringsEmpty() {
        String[] strings = {"", "", ""};
        String result = longestCommonPrefix.longestCommonPrefix(strings);
        assertEquals("", result, "Expected empty string when all strings are empty.");
    }

    @AfterEach
    void tearDown() {
        longestCommonPrefix = null;
    }
}
