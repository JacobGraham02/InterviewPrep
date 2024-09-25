package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LengthOfLastWordTest {

    LengthOfLastWord lengthOfLastWord;

    @BeforeEach
    void setUp() {
        lengthOfLastWord = new LengthOfLastWord();
    }

    @AfterEach
    void tearDown() {
        lengthOfLastWord = null;
    }

    @Test
    void testExample1() {
        String input = "Hello World";
        int expected = 5;
        int actual = lengthOfLastWord.lengthOfLastWord(input);
        assertEquals(expected, actual);
    }

    @Test
    void testExample2() {
        String input = "   fly me   to   the moon  ";
        int expected = 4;
        int actual = lengthOfLastWord.lengthOfLastWord(input);
        assertEquals(expected, actual);
    }

    @Test
    void testExample3() {
        String input = "luffy is still joyboy";
        int expected = 6;
        int actual = lengthOfLastWord.lengthOfLastWord(input);
        assertEquals(expected, actual);
    }

    @Test
    void testEmptyString() {
        String input = "";
        int expected = 0;
        int actual = lengthOfLastWord.lengthOfLastWord(input);
        assertEquals(expected, actual);
    }

    @Test
    void testOnlySpaces() {
        String input = "     ";
        int expected = 0;
        int actual = lengthOfLastWord.lengthOfLastWord(input);
        assertEquals(expected, actual);
    }

    @Test
    void testNullInput() {
        String input = null;
        int expected = 0;
        int actual = lengthOfLastWord.lengthOfLastWord(input);
        assertEquals(expected, actual);
    }

    @Test
    void testSingleWord() {
        String input = "Hello";
        int expected = 5;
        int actual = lengthOfLastWord.lengthOfLastWord(input);
        assertEquals(expected, actual);
    }

    @Test
    void testTrailingSpaces() {
        String input = "Hello World   ";
        int expected = 5;
        int actual = lengthOfLastWord.lengthOfLastWord(input);
        assertEquals(expected, actual);
    }

    @Test
    void testLeadingSpaces() {
        String input = "   Hello World";
        int expected = 5;
        int actual = lengthOfLastWord.lengthOfLastWord(input);
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleSpacesBetweenWords() {
        String input = "Hello   World";
        int expected = 5;
        int actual = lengthOfLastWord.lengthOfLastWord(input);
        assertEquals(expected, actual);
    }
}
