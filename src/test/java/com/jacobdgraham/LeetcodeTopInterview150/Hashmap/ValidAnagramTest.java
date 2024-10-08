package com.jacobdgraham.LeetcodeTopInterview150.Hashmap;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidAnagramTest {
    
    private ValidAnagram validAnagram;

    @BeforeEach
    void setUp() {
        validAnagram = new ValidAnagram();
    }

    @AfterEach
    void tearDown() {
        validAnagram = null;
    }

    @Test
    public void testValidAnagram_Example1() {
        assertTrue(validAnagram.isAnagram("anagram", "nagaram"));
    }

    @Test
    public void testValidAnagram_Example2() {
        assertFalse(validAnagram.isAnagram("rat", "car"));
    }

    @Test
    public void testValidAnagram_DifferentLengths() {
        assertFalse(validAnagram.isAnagram("hello", "helloo"));
    }

    @Test
    public void testValidAnagram_EmptyStrings() {
        assertTrue(validAnagram.isAnagram("", ""));
    }

    @Test
    public void testValidAnagram_SingleCharacter() {
        assertTrue(validAnagram.isAnagram("a", "a"));
        assertFalse(validAnagram.isAnagram("a", "b"));
    }

    @Test
    public void testValidAnagram_MixedCharacters() {
        assertTrue(validAnagram.isAnagram("cinema", "iceman"));
        assertFalse(validAnagram.isAnagram("cinema", "icecream"));
    }

    @Test
    public void testValidAnagram_RepeatedCharacters() {
        assertTrue(validAnagram.isAnagram("aabbcc", "abcabc"));
        assertFalse(validAnagram.isAnagram("aabbcc", "abccbaaa"));
    }
}
