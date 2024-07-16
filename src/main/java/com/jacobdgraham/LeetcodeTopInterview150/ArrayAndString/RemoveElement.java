package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

    Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
    Return k.
https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class RemoveElement {
    
    /**
     Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

    Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
    Return k.
https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
     * @param nums an integer array
     * @param val the integer to remove from the integer array nums
     * @return the number of elements in nums which are not equal to val
     */
    public final int removeElement(int[] nums, int val) {
        int removalIndex = 0;

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[removalIndex] = nums[i];
                removalIndex++;
            }
        }

        return removalIndex;
    }
}
