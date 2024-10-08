package com.jacobdgraham.LeetcodeTopInterview150.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    /**
     * Given a pattern and a string s, this method checks if the string s follows the same pattern.
     *
     * <p>To follow the pattern means a full match, such that there is a bijection between a letter in
     * the pattern and a non-empty word in the string s. Specifically:
     *
     * <ul>
     *   <li>Each letter in the pattern maps to exactly one unique word in s.</li>
     *   <li>Each unique word in s maps to exactly one letter in the pattern.</li>
     *   <li>No two letters map to the same word, and no two words map to the same letter.</li>
     * </ul>
     *
     * <p><b>Example 1:</b></p>
     * <pre>
     * Input: pattern = "abba", s = "dog cat cat dog"
     * Output: true
     * Explanation: 
     *   'a' maps to "dog" 
     *   'b' maps to "cat"
     * </pre>
     *
     * <p><b>Example 2:</b></p>
     * <pre>
     * Input: pattern = "abba", s = "dog cat cat fish"
     * Output: false
     * </pre>
     *
     * <p><b>Example 3:</b></p>
     * <pre>
     * Input: pattern = "aaaa", s = "dog cat cat dog"
     * Output: false
     * </pre>
     *
     * <p><b>Constraints:</b></p>
     * <ul>
     *   <li>1 <= pattern.length <= 300</li>
     *   <li>pattern contains only lower-case English letters.</li>
     *   <li>1 <= s.length <= 3000</li>
     *   <li>s contains only lowercase English letters and spaces.</li>
     *   <li>s does not contain any leading or trailing spaces.</li>
     *   <li>All the words in s are separated by a single space.</li>
     * </ul>
     *
     * @param pattern the string representing the pattern of letters
     * @param s the string representing the sequence of words
     * @return {@code true} if the string follows the pattern, {@code false} otherwise
     * @see https://leetcode.com/problems/word-pattern/description/?envType=study-plan-v2&envId=top-interview-150
     */
    public boolean wordPattern(String pattern, String s) {
        if (s.isBlank() || pattern.isBlank()) {
            return false;
        }

        final String[] words = s.split(" ");

        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char patternChar = pattern.charAt(i);
            String word = words[i];

            if (!(charToWord.containsKey(patternChar))) {
                charToWord.put(patternChar, word);
            }

            if (!(wordToChar.containsKey(word))) {
                wordToChar.put(word, patternChar);
            }

            if (!(charToWord.get(patternChar).equals(word)) || !(wordToChar.get(word).equals(patternChar))) {
                return false;
            }
        }

        return true;
    }
}