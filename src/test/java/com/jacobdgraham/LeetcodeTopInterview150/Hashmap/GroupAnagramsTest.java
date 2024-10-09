package com.jacobdgraham.LeetcodeTopInterview150.Hashmap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GroupAnagramsTest {
    
    private GroupAnagrams groupAnagrams;

    @BeforeEach
    void setUp() {
        groupAnagrams = new GroupAnagrams();
    }

    @AfterEach
    void tearDown() {
        groupAnagrams = null;
    }

    @Test
    void testExample2() {
        String[] input = {""};
        List<List<String>> result = groupAnagrams.groupAnagrams(input);
        
        assertTrue(result.contains(List.of("")));
        assertEquals(1, result.size());
    }

    @Test
    void testExample3() {
        String[] input = {"a"};
        List<List<String>> result = groupAnagrams.groupAnagrams(input);
        
        assertTrue(result.contains(List.of("a")));
        assertEquals(1, result.size());
    }

    @Test
    void testEmptyInput() {
        String[] input = {};
        List<List<String>> result = groupAnagrams.groupAnagrams(input);
        
        assertTrue(result.isEmpty());
    }

    @Test
    void testSingleGroupOfAnagrams() {
        String[] input = {"abc", "bca", "cab"};
        List<List<String>> result = groupAnagrams.groupAnagrams(input);
        
        assertTrue(result.contains(List.of("abc", "bca", "cab")));
        assertEquals(1, result.size());
    }

    @Test
    void testNoAnagrams() {
        String[] input = {"abc", "def", "ghi"};
        List<List<String>> result = groupAnagrams.groupAnagrams(input);
        
        assertTrue(result.contains(List.of("abc")));
        assertTrue(result.contains(List.of("def")));
        assertTrue(result.contains(List.of("ghi")));
        assertEquals(3, result.size());
    }

    @Test
    void testMixedCase() {
        String[] input = {"", "a", "ab", "ba", "abc", "cba"};
        List<List<String>> result = groupAnagrams.groupAnagrams(input);
        
        assertTrue(result.contains(List.of("")));
        assertTrue(result.contains(List.of("a")));
        assertTrue(result.contains(List.of("ab", "ba")));
        assertTrue(result.contains(List.of("abc", "cba")));
        assertEquals(4, result.size());
    }

    @Test
    void testLongerStrings() {
        String[] input = {"abcd", "dcba", "bcad", "xyz", "zyx", "yxz"};
        List<List<String>> result = groupAnagrams.groupAnagrams(input);
        
        assertTrue(result.contains(List.of("abcd", "dcba", "bcad")));
        assertTrue(result.contains(List.of("xyz", "zyx", "yxz")));
        assertEquals(2, result.size());
    }
}
