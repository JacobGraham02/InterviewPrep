package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexOfFirstOccurrenceInStringTest {

    IndexOfFirstOccurrenceInString indexOfFirstOccurrenceInString;

    @BeforeEach
    void setUp() {
        indexOfFirstOccurrenceInString = new IndexOfFirstOccurrenceInString();
    }

    @AfterEach
    void tearDown() {
        indexOfFirstOccurrenceInString = null;
    }

    @Test
    void testNeedleExistsAtStart() {
        String haystack = "sadbutsad";
        String needle = "sad";
        int expected = 0;
        assertEquals(expected, indexOfFirstOccurrenceInString.strStr(haystack, needle),
                "The needle 'sad' exists at the start of the haystack.");
    }

    @Test
    void testNeedleExistsInMiddle() {
        String haystack = "abcdef";
        String needle = "cd";
        int expected = 2;
        assertEquals(expected, indexOfFirstOccurrenceInString.strStr(haystack, needle),
                "The needle 'cd' exists in the middle of the haystack.");
    }

    @Test
    void testNeedleExistsAtEnd() {
        String haystack = "hellothere";
        String needle = "there";
        int expected = 5;
        assertEquals(expected, indexOfFirstOccurrenceInString.strStr(haystack, needle),
                "The needle 'there' exists at the end of the haystack.");
    }

    @Test
    void testNeedleDoesNotExist() {
        String haystack = "leetcode";
        String needle = "leeto";
        int expected = -1;
        assertEquals(expected, indexOfFirstOccurrenceInString.strStr(haystack, needle),
                "The needle 'leeto' does not exist in the haystack.");
    }

    @Test
    void testEmptyNeedle() {
        String haystack = "anything";
        String needle = "";
        int expected = 0;
        assertEquals(expected, indexOfFirstOccurrenceInString.strStr(haystack, needle),
                "An empty needle should return 0 according to the problem definition.");
    }

    @Test
    void testEmptyHaystack() {
        String haystack = "";
        String needle = "needle";
        int expected = -1;
        assertEquals(expected, indexOfFirstOccurrenceInString.strStr(haystack, needle),
                "An empty haystack cannot contain any needle and should return -1.");
    }

    @Test
    void testBothEmpty() {
        String haystack = "";
        String needle = "";
        int expected = 0;
        assertEquals(expected, indexOfFirstOccurrenceInString.strStr(haystack, needle),
                "If both haystack and needle are empty, return 0.");
    }

    @Test
    void testSingleCharacterMatch() {
        String haystack = "a";
        String needle = "a";
        int expected = 0;
        assertEquals(expected, indexOfFirstOccurrenceInString.strStr(haystack, needle),
                "A single character haystack matching a single character needle should return 0.");
    }

    @Test
    void testSingleCharacterNoMatch() {
        String haystack = "a";
        String needle = "b";
        int expected = -1;
        assertEquals(expected, indexOfFirstOccurrenceInString.strStr(haystack, needle),
                "A single character haystack not matching a single character needle should return -1.");
    }

    @Test
    void testNeedleLargerThanHaystack() {
        String haystack = "short";
        String needle = "longer";
        int expected = -1;
        assertEquals(expected, indexOfFirstOccurrenceInString.strStr(haystack, needle),
                "If the needle is larger than the haystack, it cannot exist, and the result should be -1.");
    }
}
