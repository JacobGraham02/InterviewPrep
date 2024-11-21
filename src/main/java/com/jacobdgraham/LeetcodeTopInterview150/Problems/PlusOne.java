package com.jacobdgraham.LeetcodeTopInterview150.Problems;

public class PlusOne {
    /**
     * Increments a large integer represented as an array of digits by one.
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: digits = [1,2,3]
     * Output: [1,2,4]
     * Explanation: The array represents the integer 123. Incrementing by one gives 124.
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: digits = [4,3,2,1]
     * Output: [4,3,2,2]
     * Explanation: The array represents the integer 4321. Incrementing by one gives 4322.
     * </pre>
     *
     * <p><strong>Example 3:</strong></p>
     * <pre>
     * Input: digits = [9]
     * Output: [1,0]
     * Explanation: The array represents the integer 9. Incrementing by one gives 10.
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>1 <= digits.length <= 100</li>
     *   <li>0 <= digits[i] <= 9</li>
     *   <li>digits does not contain any leading 0's.</li>
     * </ul>
     *
     * @param digits the array of digits representing the integer
     * @return the resulting array of digits after adding one
     * @see <a href="https://leetcode.com/problems/plus-one/" title="Solved the leetcode problem 'Plus One' with an associated test class">Leetcode</a>
     */
    public int[] plusOne(int[] digits) {
        int[] result = null;
        /*
        Begin from the last significant digit (the rightmost digit) in the array, and increment it by 1. Then, if the result is
        less than 10, replace the digit and stop. If the digit equals 10, set the current digit to 0 and propagate the carry
        to the next digit to the left.
        If all digits become 0 due to a carry from the most significant digit, prepend 1 to the array.
        For example, [9, 9] becomes [1, 0, 0]
        Finally, return the modified array
         */
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            if (digits[i] == 9) {
                digits[i] = 0;
                result = new int[digits.length + 1];
                result[0] = 1;
            }
        }
        return result;
    }
}
