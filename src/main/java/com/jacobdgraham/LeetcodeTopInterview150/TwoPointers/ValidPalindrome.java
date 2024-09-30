package com.jacobdgraham.LeetcodeTopInterview150.TwoPointers;

public class ValidPalindrome {
    
    /**
     * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters 
     * and removing all non-alphanumeric characters, it reads the same forward and backward. 
     * Alphanumeric characters include letters and numbers.
     * 
     * Given a string <code>s</code>, return <code>true</code> if it is a palindrome, or 
     * <code>false</code> otherwise.
     * 
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: s = "A man, a plan, a canal: Panama"
     * Output: true
     * Explanation: "amanaplanacanalpanama" is a palindrome.
     * </pre>
     * 
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: s = "race a car"
     * Output: false
     * Explanation: "raceacar" is not a palindrome.
     * </pre>
     * 
     * <p><strong>Example 3:</strong></p>
     * <pre>
     * Input: s = " "
     * Output: true
     * Explanation: s is an empty string "" after removing non-alphanumeric characters.
     * Since an empty string reads the same forward and backward, it is a palindrome.
     * </pre>
     * 
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>1 <= s.length <= 2 * 10<sup>5</sup></li>
     *   <li>s consists only of printable ASCII characters.</li>
     * </ul>
     * 
     * <p><strong>Analysis</strong></p>
     * <p>The 
     * @param s String that contains only lowercase alphanumeric characters (a-z, A-Z, 0-9)
     * @return if the string is a valid palindrome. A valid palindrome is when the string reads the same forwards and backwards. 
     * @see https://leetcode.com/problems/valid-palindrome/description/?envType=study-plan-v2&envId=top-interview-150
     */
    public boolean isPalindrome(String s) {
        if (s.isEmpty() || s.isBlank()) {
            return true;
        }
        s = s.trim();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int startChar = 0;
        int endChar = s.length() - 1;

        while (startChar <= endChar) {
            char currentFirstChar = s.charAt(startChar);
            char currentLastChar = s.charAt(endChar);

            if (currentFirstChar != currentLastChar) {
                return false;
            }

            startChar++;
            endChar--;
        }

        return true;
    }
}
