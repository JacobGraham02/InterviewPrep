package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3

Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

 

Constraints:

    n == nums.length
    1 <= n <= 5 * 104
    -109 <= nums[i] <= 109

 */
public class MajorityElement {
    
    /**
     * Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3

Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

 

Constraints:

    n == nums.length
    1 <= n <= 5 * 104
    -109 <= nums[i] <= 109

     * @param nums an array of integers
     * @return the integer which is the majority in the array (i.e., occurs the most)
     * @link https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150
     */
    public int majorityElement(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int sizeOfArray = nums.length;
        Map<Integer, Integer> numsMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < sizeOfArray; i++) {
            numsMap.put(nums[i], numsMap.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
            if (entry.getValue() > (sizeOfArray / 2)) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
