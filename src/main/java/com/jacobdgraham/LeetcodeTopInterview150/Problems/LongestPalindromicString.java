package com.jacobdgraham.LeetcodeTopInterview150.Problems;

public class LongestPalindromicString {
    /**
     * Provides a solution to find the longest palindromic substring in a given string.
     *
     * <p>The method uses the expand-around-center approach to efficiently find the longest palindromic
     * substring in O(n^2) time complexity, which is optimal for this problem</p>
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: s = "babad"
     * Output: "bab"
     * Explanation: "aba" is also a valid answer.
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: s = "cbbd"
     * Output: "bb"
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>1 <= s.length <= 1000</li>
     *   <li><code>s</code> consists of only digits and English letters.</li>
     * </ul>
     *
     * @param s the input string to be evaluated
     * @return the longest palindromic substring in <code>s</code>
     */
    public String longestPalindrome(String s) {
        /*
        Edge cases to ensure the input string is valid. If it is not, we return with an empty string immediately
         */
        if (s == null || s.isEmpty()) {
            return "";
        }

        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            int oddLengthPalindrome = expandAroundCenter(s, i, i);
            int evenLengthPalindrome = expandAroundCenter(s, i, i + 1);
            int maxLengthPalindrome = Math.max(oddLengthPalindrome, evenLengthPalindrome);

            /*
            Update the start and end indices for the palindromic string if one is found
             */
            if (maxLengthPalindrome > (endIndex - startIndex)) {
                startIndex = i - (maxLengthPalindrome - 1) / 2;
                endIndex = i + (maxLengthPalindrome / 2);
            }
        }

        return s.substring(startIndex, endIndex + 1);
    }

    /**
     * Expands around the center indices to find the longest palindromic substring.
     *
     * @param s     the input string
     * @param left  the left boundary for expansion
     * @param right the right boundary for expansion
     * @return the length of the palindromic substring found
     */
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return (right - left) - 1;
    }
}
