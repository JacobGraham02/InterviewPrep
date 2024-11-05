package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * Finds the length of the longest substring without repeating characters in a given string.
     *
     * <p>Given a string <code>s</code>, this method determines the length of the longest contiguous substring
     * that contains no repeating characters.
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: s = "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: s = "bbbbb"
     * Output: 1
     * Explanation: The answer is "b", with the length of 1.
     * </pre>
     *
     * <p><strong>Example 3:</strong></p>
     * <pre>
     * Input: s = "pwwkew"
     * Output: 3
     * Explanation: The answer is "wke", with the length of 3.
     * Note: The answer must be a substring, "pwke" is a subsequence and not a substring.
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>0 <= s.length <= 5 * 10<sup>4</sup></li>
     *   <li><code>s</code> consists of English letters, digits, symbols, and spaces.</li>
     * </ul>
     *
     * @param s the input string to be evaluated
     * @return the length of the longest substring without repeating characters
     */
    public int lengthOfLongestSubstring(String s) {
        /*
        This problem can be solved by using a sliding window technique. We keep one pointer (start) for the beginning of the substring, and
        another (end) that expands the window as we move through the string.
         */
        if (s == null || s.isEmpty()) {
            return 0;
        }

        final Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        /*
        We expand the sliding window by moving the right pointer forwards
         */
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            /*
            If the character we are looking at is in the map and within the bounds of the current window, move the start
            of the sliding window to skip any duplicate characters
             */
            if (map.containsKey(currentChar) && map.get(currentChar) >= start) {
                start = map.get(currentChar) + 1;
            }

            /*
            Update the latest position of currentChar in the map with the end of the substring
             */
            map.put(currentChar, end);

            /*
            Update the maximum length of the substring if the current window is larger than the previous one
             */
            maxLength = Math.max(maxLength, ((end - start)+ 1));
        }

        return maxLength;
    }
}
