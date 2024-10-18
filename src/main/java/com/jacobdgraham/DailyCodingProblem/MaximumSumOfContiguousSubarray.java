package com.jacobdgraham.DailyCodingProblem;

public class MaximumSumOfContiguousSubarray {
    /**
     * Finds the maximum sum of any contiguous subarray in the given array.
     *
     * <p>Given an array of integers, this method calculates the maximum sum of any subarray
     * that contains contiguous elements. The solution uses Kadane's Algorithm, which operates
     * in O(N) time.</p>
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: [34, -50, 42, 14, -5, 86]
     * Output: 137
     * Explanation: The subarray [42, 14, -5, 86] produces the maximum sum of 137.
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: [-5, -1, -8, -9]
     * Output: 0
     * Explanation: Since all numbers are negative, the best possible sum is 0 (i.e., take no elements).
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *     <li>The input array may contain both positive and negative integers.</li>
     *     <li>The input array is non-empty.</li>
     * </ul>
     *
     * @param nums the input array of integers
     * @return the maximum sum of any contiguous subarray, or 0 if the best sum is not taking any elements
     */
    public int maxSubarraySum(int[] nums) {
        /*
        globalMax stores the overall maximum sum found so far; currentMax stores the maximum sum of the subarray
        ending at the current index
         */
        int globalMax = 0;
        int currentMax = 0;

        /*
        Loop through the entire array to calculate the maximum sum of any contiguous subarray
         */
        for (int i = 0; i < nums.length; i++) {
            /*
            At each element, do one of the following:
            1. Continue adding the current element to the existing subarray (currentMax + nums[i])
            2. Start a new subarray from the current element (nums[i])
            This is done using Math.max(currentMax + nums[i], nums[i])
            Then, update globalMax to the maximum of itself and currentMax.
            This ensures that we always have the highest sum encountered so far
             */
            currentMax = Math.max(currentMax + nums[i], nums[i]);
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }
}
