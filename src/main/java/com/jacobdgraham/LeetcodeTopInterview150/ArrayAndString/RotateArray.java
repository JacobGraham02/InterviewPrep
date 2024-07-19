package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

/**
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

 
 */
public class RotateArray {
    
    /**
     * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
     * @param nums an array of integers
     * @param k the number of places to move the integer
     * @see https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150
     */
    public void rotate(int[] nums, int k) {
        if (k == 0) {
            return;
        }
        if (nums.length == 0) {
            return;
        }
        final int numsLength = nums.length;
        int[] rotatedArray = new int[numsLength];
        k = k % numsLength;

        for (int i = 0; i < numsLength; i++) {
            int newInsertionPosition = (i + k) % numsLength;
            rotatedArray[newInsertionPosition] = nums[i];
        }

        System.arraycopy(rotatedArray, 0, nums, 0, numsLength);
    }
}
