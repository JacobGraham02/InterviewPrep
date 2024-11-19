package com.jacobdgraham.LeetcodeTopInterview150.Problems;

public class PalindromeNumber {
    /**
     * Determines whether an integer is a palindrome without converting it to a string.
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: x = 121
     * Output: true
     * Explanation: 121 reads as 121 from left to right and from right to left.
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: x = -121
     * Output: false
     * Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
     * Therefore, it is not a palindrome.
     * </pre>
     *
     * <p><strong>Example 3:</strong></p>
     * <pre>
     * Input: x = 10
     * Output: false
     * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>-2³¹ <= x <= 2³¹ - 1</li>
     * </ul>
     *
     * <p><strong>Follow-up:</strong> Solve without converting the integer to a string.</p>
     *
     * @param x the integer to evaluate
     * @return true if the integer is a palindrome, false otherwise
     * @see <a href="https://leetcode.com/problems/palindrome-number/description/" title="A link to the leetcode problem 'Palindrome Number">Leetcode</a>
     */
    public boolean isPalindrome(int x) {
        /*
        Negative numbers and numbers that end in 0 cannot be palindromes
        For example:
        -121 cannot be palindrome because of the negative sign
        20 cannot be palindrome because of the 0. 20 cannot be read as 02
        x % 10 == 0 ensures that numbers that end in 0 cannot be palindromes.
        Additionally, x != 0 ensures that 0 is treated as a palindrome
         */
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedNumber = 0;

        while (x > reversedNumber) {
            reversedNumber = reversedNumber * 10 + (x % 10);
            x /= 10;
        }

        return x == reversedNumber || x == (reversedNumber / 10);
    }
}
