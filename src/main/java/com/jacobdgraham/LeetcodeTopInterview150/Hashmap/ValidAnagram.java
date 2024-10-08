package com.jacobdgraham.LeetcodeTopInterview150.Hashmap;

public class ValidAnagram {
    
    /**
     * Given two strings s and t, this method returns {@code true} if t is an anagram of s, and {@code false} otherwise.
     *
     * <p>An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
     *
     * <p><b>Example 1:</b></p>
     * <pre>
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     * </pre>
     *
     * <p><b>Example 2:</b></p>
     * <pre>
     * Input: s = "rat", t = "car"
     * Output: false
     * </pre>
     *
     * <p><b>Constraints:</b></p>
     * <ul>
     *   <li>1 <= s.length, t.length <= 5 * 10<sup>4</sup></li>
     *   <li>s and t consist of lowercase English letters.</li>
     * </ul>
     *
     * @param s the first string
     * @param t the second string
     * @return {@code true} if {@code t} is an anagram of {@code s}, {@code false} otherwise
     * @see <a href="https://leetcode.com/problems/valid-anagram/">Valid Anagram - LeetCode</a>
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] charCounts = new int[26];

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        for (char sChar : sChars) {
            charCounts[sChar - 'a']++;
        }

        for (char tChar : tChars) {
            charCounts[tChar - 'a']--;
        }

        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
