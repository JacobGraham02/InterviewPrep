package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReverseWordsInStringTest {
     
    ReverseWordsInString reverseWords;

    @BeforeEach
    void setUp() {
        reverseWords = new ReverseWordsInString();
    }

    @AfterEach
    void tearDown() {
        reverseWords = null;
    }

    @Test
    void testReverseWordsWithNormalString() {
        String input = "the sky is blue";
        String expected = "blue is sky the";
        String actual = reverseWords.reverseWords(input);
        assertEquals(expected, actual);
    }

    @Test
    void testReverseWordsWithLeadingAndTrailingSpaces() {
        String input = "  hello world  ";
        String expected = "world hello";
        String actual = reverseWords.reverseWords(input);
        assertEquals(expected, actual);
    }

    @Test
    void testReverseWordsWithMultipleSpacesBetweenWords() {
        String input = "a good   example";
        String expected = "example good a";
        String actual = reverseWords.reverseWords(input);
        assertEquals(expected, actual);
    }

    @Test
    void testReverseWordsWithSingleWord() {
        String input = "hello";
        String expected = "hello";
        String actual = reverseWords.reverseWords(input);
        assertEquals(expected, actual);
    }

    @Test
    void testReverseWordsWithEmptyString() {
        String input = "";
        String expected = "";
        String actual = reverseWords.reverseWords(input);
        assertEquals(expected, actual);
    }

    @Test
    void testReverseWordsWithOnlySpaces() {
        String input = "    ";
        String expected = "";
        String actual = reverseWords.reverseWords(input);
        assertEquals(expected, actual);
    }

    @Test
    void testReverseWordsWithMixedCharacters() {
        String input = "Leetcode 123 is fun";
        String expected = "fun is 123 Leetcode";
        String actual = reverseWords.reverseWords(input);
        assertEquals(expected, actual);
    }
}
