package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

public class RemoveDuplicatesII {
    
    /**
     * Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
     * @param nums an array of integers
     * @return the number of elements which does not exceed at least 2 duplicate elements
     * @link https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int arrayIndex = 1;
        int occurrencesOfValue = 1;

        for (int i=1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                occurrencesOfValue++;
            } else {
                occurrencesOfValue = 1;
            }

            if (occurrencesOfValue <= 2) {
                nums[arrayIndex] = nums[i];
                arrayIndex++;
            }
        }

        return arrayIndex++;
    }
}
