package com.jacobdgraham.LeetcodeTopInterview150.Hashmap;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IsomorphicStringsTest {
    
   private IsomorphicStrings isomorphicStrings;

   @BeforeEach
   private void setUp() {
    isomorphicStrings = new IsomorphicStrings();
   }

   @AfterEach
   private void tearDown() {
    isomorphicStrings = null;
   }

    @Test
    public void testIsomorphicStrings_trueCase1() {
        String s = "egg";
        String t = "add";
        assertTrue(isomorphicStrings.isIsomorphic(s, t));
    }

    @Test
    public void testIsomorphicStrings_falseCase1() {
        String s = "foo";
        String t = "bar";
        assertFalse(isomorphicStrings.isIsomorphic(s, t));
    }

    @Test
    public void testIsomorphicStrings_trueCase2() {
        String s = "paper";
        String t = "title";
        assertTrue(isomorphicStrings.isIsomorphic(s, t));
    }

    @Test
    public void testIsomorphicStrings_falseCase2() {
        String s = "abc";
        String t = "defg";
        assertFalse(isomorphicStrings.isIsomorphic(s, t));
    }

    @Test
    public void testIsomorphicStrings_edgeCase_emptyStrings() {
        String s = "";
        String t = "";
        assertTrue(isomorphicStrings.isIsomorphic(s, t));
    }

    @Test
    public void testIsomorphicStrings_trueCase_singleCharacterStrings() {
        String s = "a";
        String t = "b";
        assertTrue(isomorphicStrings.isIsomorphic(s, t));
    }

    @Test
    public void testIsomorphicStrings_falseCase_sameCharactersDifferentPattern() {
        String s = "ab";
        String t = "aa";
        assertFalse(isomorphicStrings.isIsomorphic(s, t));
    }
}
