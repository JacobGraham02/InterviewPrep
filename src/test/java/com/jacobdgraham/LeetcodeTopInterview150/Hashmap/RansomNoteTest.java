package com.jacobdgraham.LeetcodeTopInterview150.Hashmap;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RansomNoteTest {
    
    RansomNote ransomNote;

    @BeforeEach
    void setUp() {
        ransomNote = new RansomNote();
    }

    @AfterEach
    void tearDown() {
        ransomNote = null;
    }

    @Test
    void testSingleCharacterSuccess() {
        assertTrue(ransomNote.canConstruct("a", "a"), "The ransom note 'a' should be constructible from magazine 'a'.");
    }

    @Test
    void testSingleCharacterFailure() {
        assertFalse(ransomNote.canConstruct("a", "b"), "The ransom note 'a' cannot be constructed from magazine 'b'.");
    }

    @Test
    void testMultipleCharactersSuccess() {
        assertTrue(ransomNote.canConstruct("aa", "aab"), "The ransom note 'aa' should be constructible from magazine 'aab'.");
    }

    @Test
    void testMultipleCharactersFailure() {
        assertFalse(ransomNote.canConstruct("aa", "ab"), "The ransom note 'aa' cannot be constructed from magazine 'ab'.");
    }

    @Test
    void testEmptyRansomNote() {
        assertTrue(ransomNote.canConstruct("", "abc"), "An empty ransom note can always be constructed from any magazine.");
    }

    @Test
    void testEmptyMagazine() {
        assertFalse(ransomNote.canConstruct("abc", ""), "No ransom note can be constructed from an empty magazine.");
    }

    @Test
    void testRansomNoteLargerThanMagazine() {
        assertFalse(ransomNote.canConstruct("aaaa", "aaa"), "The ransom note 'aaaa' cannot be constructed from magazine 'aaa'.");
    }

    @Test
    void testAllLettersUsedOnce() {
        assertTrue(ransomNote.canConstruct("abcd", "dcba"), "The ransom note 'abcd' should be constructible from magazine 'dcba'.");
    }

    @Test
    void testCaseSensitive() {
        assertFalse(ransomNote.canConstruct("aA", "aa"), "The ransom note 'aA' cannot be constructed from magazine 'aa' as it is case-sensitive.");
    }
}
