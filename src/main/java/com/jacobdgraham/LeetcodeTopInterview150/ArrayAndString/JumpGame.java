package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

/**
 * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

 

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.

 */
public class JumpGame {
    
    /**
     * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

 

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.

     * @param nums an integer array
     * @return 
     * @see https://leetcode.com/problems/jump-game/?envType=study-plan-v2&envId=top-interview-150
     */
    public boolean canJump(final int[] nums) {
        int maximumJumpReach = 0;

        for (int i = 0; i < nums.length; i++) {
            // If we are at a position that is beyond maximumJumpReach, we cannot proceed further
            if (i > maximumJumpReach) {
                return false;
            }

            // Update maximumJumpReach if the current position plus the jump length is greater
            maximumJumpReach = Math.max(maximumJumpReach, i + nums[i]);
            if (maximumJumpReach >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}