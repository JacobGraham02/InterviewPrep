package com.jacobdgraham.LeetcodeTopInterview150.Hashmap;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    /**
     * Determines if a number <code>n</code> is a happy number.
     * 
     * <p>A happy number is defined by the following process:</p>
     * <ul>
     *   <li>Starting with any positive integer, replace the number by the sum of the squares of its digits.</li>
     *   <li>Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.</li>
     *   <li>Numbers for which this process ends in 1 are considered happy numbers.</li>
     * </ul>
     * 
     * <p>The method returns <code>true</code> if <code>n</code> is a happy number, and <code>false</code> otherwise.</p>
     * 
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: n = 19
     * Output: true
     * Explanation:
     * 1<sup>2</sup> + 9<sup>2</sup> = 82
     * 8<sup>2</sup> + 2<sup>2</sup> = 68
     * 6<sup>2</sup> + 8<sup>2</sup> = 100
     * 1<sup>2</sup> + 0<sup>2</sup> + 0<sup>2</sup> = 1
     * </pre>
     * 
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: n = 2
     * Output: false
     * </pre>
     * 
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>1 <= n <= 2<sup>31</sup> - 1</li>
     * </ul>
     * 
     * @param n the positive integer to determine if it is a happy number
     * @return <code>true</code> if <code>n</code> is a happy number, <code>false</code> otherwise
     * @see <a href="https://leetcode.com/problems/happy-number/">https://leetcode.com/problems/happy-number/</a>
     */
    public boolean isHappy(int n) {
        /*
         * Create a set to keep track of the numbers that have already been seen
         */
        Set<Integer> seenNumbers = new HashSet<>();

        /*
         * Use a while loop to loop through numbers until either n becomes 1 (n is a happy number), or n is seen again (n is not a happy number)
         */
        while (n != 1 && !(seenNumbers.contains(n))) {
            seenNumbers.add(n);

            int sum = 0;
            
            /*
             * Compute the sum of the squares for the digits of n
             */
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            /*
             * Update n with the sum of squares of its digits
             */
            n = sum;
        }

        /*
         * if n is 1 it is a happy number, false otherwise
         */
        return n == 1;
    }
}