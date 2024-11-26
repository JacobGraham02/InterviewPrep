package com.jacobdgraham.LeetcodeTopInterview150.Problems;

public class SqrtX {
    /**
     * Computes the square root of a non-negative integer x rounded down to the nearest integer.
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: x = 4
     * Output: 2
     * Explanation: The square root of 4 is 2, so we return 2.
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: x = 8
     * Output: 2
     * Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>0 <= x <= 2³¹ - 1</li>
     * </ul>
     *
     * <p>Time complexity: <strong>O(log(n)) because of binary search</strong></p>
     * <p>Space complexity: <strong>O(1) because no additional space is used apart from storing the value</strong></p>
     *
     * @param x the non-negative integer
     * @return the square root of x rounded down to the nearest integer
     * @see <a href="https://leetcode.com/problems/sqrtx/" title="A link to the leetcode problem 'Sqrt(x)'">Leetcode</a>
     */
    public int mySqrt(int x) {
        /*
        We will use binary search here to find the square root of x rounded down to the nearest integer.
        The value will always lie between 0 and x.
        If the square root value is an integer that causes an overflow, we must use a 'long' data type to store it.
         */
        if (x == 0) {
            return 0;
        }

        int leftPointer = 0;
        int rightPointer = x;
        int result = 0;

        while (leftPointer <= rightPointer) {
            int middlePointer = leftPointer + (rightPointer - leftPointer) / 2;
            long square = (long) middlePointer * middlePointer;

            if (square == x) {
                return middlePointer;
            }
            else if (square < x) {
                result = middlePointer;
                leftPointer = middlePointer + 1;
            }
            else {
                rightPointer = middlePointer - 1;
            }
        }

        return result;
    }
}
