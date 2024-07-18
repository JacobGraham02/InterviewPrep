package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

    Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
    Return k.

 */
public class RemoveDuplicates {
    
    /**
     * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

    Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
    Return k.
     * @param nums the array of integers to remove duplicates from
     * @return the number of unique elements in nums
     * @link https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int locationInArrayPointer = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[locationInArrayPointer] != nums[i]) {
                locationInArrayPointer++;
                nums[locationInArrayPointer] = nums[i];
            }

            resizeArray(nums, locationInArrayPointer + 1);
        }
        return locationInArrayPointer + 1; // Returns the count of unique elements.
    }

    /**
     * Physically resizes an array by first counting the number of unique elements in an array, and then creating a new array 
     * whose size is the number of unique elements
     * @param nums the array of unique integers
     * @return the resized array containing only unique integers
     */
    public int[] resizeArray(int[] nums, final int newSize) {
        return removeAdditionalElements(nums, newSize); // Return the resized array.
    }

    /**
     * Removes additional elements from an array by creating a new array given the input parameter 'arraySize', and copying over all elements from the guaranteed-unique array 
     * 'nums' over the array 'newNums'
     * @param nums an integer array containing only unique elements
     * @param arraySize the size of the new integer array
     * @return the new array of only unique integers
     */
    private int[] removeAdditionalElements(int[] nums, final int arraySize) {
        int[] newNums = new int[arraySize];
        System.arraycopy(nums, 0, newNums, 0, arraySize);
        return newNums;
    }
}
