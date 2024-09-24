package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

/**
 * Given an integer array <code>nums</code>, return an array <code>answer</code> such that 
 * <code>answer[i]</code> is equal to the product of all the elements of <code>nums</code> 
 * except <code>nums[i]</code>.
 *
 * <p>The product of any prefix or suffix of <code>nums</code> is guaranteed to fit in a 32-bit integer.</p>
 *
 * <p>You must write an algorithm that runs in <code>O(n)</code> time and without using the division operation.</p>
 *
 * <h3>Examples:</h3>
 *
 * <h4>Example 1:</h4>
 * <pre>
 * <strong>Input:</strong> nums = [1,2,3,4]
 * <strong>Output:</strong> [24,12,8,6]
 * </pre>
 *
 * <h4>Example 2:</h4>
 * <pre>
 * <strong>Input:</strong> nums = [-1,1,0,-3,3]
 * <strong>Output:</strong> [0,0,9,0,0]
 * </pre>
 *
 * <h3>Constraints:</h3>
 * <ul>
 *   <li><code>2 &le; nums.length &le; 10<sup>5</sup></code></li>
 *   <li><code>-30 &le; nums[i] &le; 30</code></li>
 *   <li><code>nums</code> contains at least one zero.</li>
 * </ul>
 */
public class ProductOfArrayExceptSelf {
    
    /**
 * Given an integer array <code>nums</code>, return an array <code>answer</code> such that 
 * <code>answer[i]</code> is equal to the product of all the elements of <code>nums</code> 
 * except <code>nums[i]</code>.
 *
 * <p>The product of any prefix or suffix of <code>nums</code> is guaranteed to fit in a 32-bit integer.</p>
 *
 * <p>You must write an algorithm that runs in <code>O(n)</code> time and without using the division operation.</p>
 *
 * <h3>Examples:</h3>
 *
 * <h4>Example 1:</h4>
 * <pre>
 * <strong>Input:</strong> nums = [1,2,3,4]
 * <strong>Output:</strong> [24,12,8,6]
 * </pre>
 *
 * <h4>Example 2:</h4>
 * <pre>
 * <strong>Input:</strong> nums = [-1,1,0,-3,3]
 * <strong>Output:</strong> [0,0,9,0,0]
 * </pre>
 *
 * <h3>Constraints:</h3>
 * <ul>
 *   <li><code>2 &le; nums.length &le; 10<sup>5</sup></code></li>
 *   <li><code>-30 &le; nums[i] &le; 30</code></li>
 *   <li><code>nums</code> contains at least one zero.</li>
 * </ul>
 * @param nums an integer array where each element is between Integer.MIN_VALUE and Integer.MAX_VALUE
 **/
    public int[] productExceptSelf(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return new int[0];
        }

        int[] newValueArray = new int[nums.length];
        int[] prefixArray = new int[nums.length];
        int[] suffixArray = new int[nums.length];
        prefixArray[0] = 1;
        suffixArray[nums.length - 1] = 1;

        for (int i = 1; i < nums.length; i++) {
            prefixArray[i] = prefixArray[i - 1] * nums[i - 1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            suffixArray[i] = suffixArray[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            newValueArray[i] = prefixArray[i] * suffixArray[i];
        }

        return newValueArray;
    }
}
