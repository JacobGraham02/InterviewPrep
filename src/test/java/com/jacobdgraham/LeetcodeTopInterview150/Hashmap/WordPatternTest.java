package com.jacobdgraham.LeetcodeTopInterview150.Hashmap;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WordPatternTest {
    
    private WordPattern wordPattern;

    @BeforeEach
    private void setUp() {
        wordPattern = new WordPattern();
    }

    @AfterEach
    private void tearDown() {
        wordPattern = null;
    }

    @Test
    public void testPatternMatches() {
        assertTrue(wordPattern.wordPattern("abba", "dog cat cat dog"));
    }

    @Test
    public void testPatternDoesNotMatch() {
        assertFalse(wordPattern.wordPattern("abba", "dog cat cat fish"));
    }

    @Test
    public void testDifferentPatternAndWordLengths() {
        assertFalse(wordPattern.wordPattern("aaaa", "dog cat cat dog"));
    }

    @Test
    public void testOneLetterPattern() {
        assertTrue(wordPattern.wordPattern("a", "dog"));
    }

    @Test
    public void testNoWords() {
        assertFalse(wordPattern.wordPattern("a", ""));
    }

    @Test
    public void testAllUniquePatternLetters() {
        assertTrue(wordPattern.wordPattern("abc", "dog cat fish"));
    }

    @Test
    public void testPatternWithRepeatingWords() {
        assertFalse(wordPattern.wordPattern("abb", "dog dog dog"));
    }
}
