package com.jacobdgraham.LeetcodeTopInterview150.TwoPointers;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IsSubsequenceTest {
    
    private IsSubsequence isSubsequence;

    @BeforeEach
    void setUp() {
        isSubsequence = new IsSubsequence();
    }

    @AfterEach
    void tearDown() {
        isSubsequence = null;
    }

        @Test
    void testIsSubsequenceExample1() {
        // Test case from example 1
        String s = "abc";
        String t = "ahbgdc";
        assertTrue(isSubsequence.isSubsequence(s, t));
    }

    @Test
    void testIsSubsequenceExample2() {
        // Test case from example 2
        String s = "axc";
        String t = "ahbgdc";
        assertFalse(isSubsequence.isSubsequence(s, t));
    }

    @Test
    void testEmptySubsequence() {
        // Edge case where s is an empty string
        String s = "";
        String t = "ahbgdc";
        assertTrue(isSubsequence.isSubsequence(s, t));
    }

    @Test
    void testEmptyTString() {
        // Edge case where t is an empty string
        String s = "abc";
        String t = "";
        assertFalse(isSubsequence.isSubsequence(s, t));
    }

    @Test
    void testBothEmptyStrings() {
        // Edge case where both s and t are empty strings
        String s = "";
        String t = "";
        assertTrue(isSubsequence.isSubsequence(s, t));
    }

    @Test
    void testNonSubsequence() {
        // Edge case where s is not a subsequence of t
        String s = "abcdef";
        String t = "ab";
        assertFalse(isSubsequence.isSubsequence(s, t));
    }

    @Test
    void testSubsequenceWithDuplicateCharacters() {
        // Test case where s contains duplicate characters
        String s = "aaa";
        String t = "aaaaaa";
        assertTrue(isSubsequence.isSubsequence(s, t));
    }
}
