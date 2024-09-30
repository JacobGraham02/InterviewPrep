package com.jacobdgraham.LeetcodeTopInterview150.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    /**
     * Given two strings <code>ransomNote</code> and <code>magazine</code>, return <code>true</code> if 
     * <code>ransomNote</code> can be constructed by using the letters from <code>magazine</code> and 
     * <code>false</code> otherwise.
     * 
     * <p>Each letter in <code>magazine</code> can only be used once in <code>ransomNote</code>.</p>
     * 
     * <h3>Example 1:</h3>
     * <pre>
     * Input: ransomNote = "a", magazine = "b"
     * Output: false
     * </pre>
     * 
     * <h3>Example 2:</h3>
     * <pre>
     * Input: ransomNote = "aa", magazine = "ab"
     * Output: false
     * </pre>
     * 
     * <h3>Example 3:</h3>
     * <pre>
     * Input: ransomNote = "aa", magazine = "aab"
     * Output: true
     * </pre>
     * 
     * <h3>Constraints:</h3>
     * <ul>
     *   <li>1 &lt;= ransomNote.length, magazine.length &lt;= 10<sup>5</sup></li>
     *   <li>ransomNote and magazine consist of lowercase English letters.</li>
     * </ul>
     *
     * @param ransomNote the string representing the ransom note.
     * @param magazine the string representing the letters available from the magazine.
     * @return <code>true</code> if ransomNote can be constructed from the letters in magazine, <code>false</code> otherwise.
     * @see https://leetcode.com/problems/ransom-note/description/?envType=study-plan-v2&envId=top-interview-150
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> characterCountMap = new HashMap<Character, Integer>();
        
        for (int i = 0; i < magazine.length(); i++) {
            characterCountMap.put(magazine.charAt(i), characterCountMap.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (!(characterCountMap.containsKey(ransomNote.charAt(i))) || characterCountMap.get(ransomNote.charAt(i)) <= 0) {
                return false;
            }
            characterCountMap.put(ransomNote.charAt(i), characterCountMap.get(ransomNote.charAt(i)) - 1);
        }
        return true;
    }
}
