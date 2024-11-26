package com.jacobdgraham.LeetcodeTopInterview150.Problems;

public class ClimbingStairs {
    /**
     * Calculates the number of distinct ways to climb a staircase of n steps,
     * where each step can be either 1 or 2 steps.
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: n = 2
     * Output: 2
     * Explanation: There are two ways to climb to the top:
     * 1 step + 1 step
     * 2 steps
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: n = 3
     * Output: 3
     * Explanation: There are three ways to climb to the top:
     * 1 step + 1 step + 1 step
     * 1 step + 2 steps
     * 2 steps + 1 step
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>1 <= n <= 45</li>
     * </ul>
     *
     * @param n the total number of steps to climb
     * @return the number of distinct ways to climb to the top
     * @see <a href="https://leetcode.com/problems/climbing-stairs/description/" title="A link to the leetcode problem 'Climbing Stairs'">Leetcode</a>
     */
    public int climbStairs(int n) {
        /*
        Here, you have to recognize that the number of ways to climb a staircase with n steps is equivalent to the Fibonacci sequence.
        When n = 1, there is only 1 way to climb the stairs. If n = 2, there are only 2 ways. Beyond that, the following
        formula is used to determine the total number of steps: f(n) = f(n-1) + f(n-2)
        We can use a dynamic programming approach here where we can use two variables to store intermediate results and build the
        solution iteratively from smaller subproblems.
         */
        if (n <= 2) {
            return n;
        }

        int stepNMinusOne = 2; // Ways to climb to the step: n-1
        int stepNMinusTwo = 1; // Ways to climb to the step: n-2

        for (int i = 3; i <= n; i++) {
            /*
            f(n) = f(n-1) + f(n-2)
             */
            int currentStep = stepNMinusOne + stepNMinusTwo;
            stepNMinusTwo = stepNMinusOne;
            stepNMinusOne = currentStep;
        }

        return stepNMinusOne;
    }
}
