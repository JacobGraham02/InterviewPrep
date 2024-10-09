package com.jacobdgraham.LeetcodeTopInterview150.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /**
     * Given an array of integers <code>nums</code> and an integer <code>target</code>, 
     * returns the indices of the two numbers such that they add up to <code>target</code>.
     * 
     * <p>You may assume that each input would have exactly one solution, 
     * and you may not use the same element twice.</p>
     * 
     * <p>You can return the answer in any order.</p>
     * 
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: nums = [2, 7, 11, 15], target = 9
     * Output: [0, 1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     * </pre>
     * 
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: nums = [3, 2, 4], target = 6
     * Output: [1, 2]
     * </pre>
     * 
     * <p><strong>Example 3:</strong></p>
     * <pre>
     * Input: nums = [3, 3], target = 6
     * Output: [0, 1]
     * </pre>
     * 
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>2 <= nums.length <= 10<sup>4</sup></li>
     *   <li>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></li>
     *   <li>-10<sup>9</sup> <= target <= 10<sup>9</sup></li>
     *   <li>Only one valid answer exists.</li>
     * </ul>
     * 
     * <p><strong>Follow-up:</strong> Can you come up with an algorithm that is less than O(n<sup>2</sup>) time complexity?</p>
     * @param nums an integer array where each integer is guaranteed to be valid
     * @param target the target number that two integers in nums must add up to
     * @return an integer array containing two integers that add up to target
     * @see https://leetcode.com/problems/two-sum/?envType=study-plan-v2&envId=top-interview-150
     */
    public int[] twoSum(int[] nums, int target) {
        /*
         * An algorithm we can use to solve this problem is a two-pass hash table solution. Here, we will use one key-value pair to store
         * both integers, where the key+value == target. 
         */
        Map<Integer, Integer> integerMap = new HashMap<>();

        /*
         * To begin, for each integer in nums, we will associate the value of i with that integer: This will store the indice of the integer in the array alongside
         * the integer itself. In subsequent iterations (2, 3, ..., N), we will see if nums[i] subtracted from the target number exists in the map. 
         * If the key (target - nums[i]) exists in the map, it means that the number needed to reach the target sum with nums[i] has already been encountered 
         * at some previous index. Therefore, the stored indice and the current indice will return the required values. 
         */
        for (int i = 0; i < nums.length; i++) {
            if (integerMap.containsKey(target - nums[i])) {
                int[] integers = new int[]{integerMap.get(target - nums[i]), i};
                return integers;
            }

            integerMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
