package com.jacobdgraham.LeetcodeTopInterview150.Problems;

public class MergeSortedArray {
    /**
     * Merges two sorted arrays into one sorted array in-place.
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     * Output: [1,2,2,3,5,6]
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: nums1 = [1], m = 1, nums2 = [], n = 0
     * Output: [1]
     * </pre>
     *
     * <p><strong>Example 3:</strong></p>
     * <pre>
     * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
     * Output: [1]
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>nums1.length == m + n</li>
     *   <li>nums2.length == n</li>
     *   <li>0 <= m, n <= 200</li>
     *   <li>1 <= m + n <= 200</li>
     *   <li>-10⁹ <= nums1[i], nums2[j] <= 10⁹</li>
     * </ul>
     *
     * @param nums1 the first sorted array with additional space for the merged result
     * @param m the number of valid elements in nums1
     * @param nums2 the second sorted array
     * @param n the number of valid elements in nums2
     * @see <a href="https://leetcode.com/problems/merge-sorted-array/description/" title="A link to the leetcode problem 'Merge Sorted Array'">Leetcode</a>
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         /*
        Because we are iterating over 2 arrays, and are going to iterate over the final merged array, we must have 3 pointers:
        1 for nums1
        1 for nums2
        1 for the merged array

        We will start traversing from the end of the integer arrays so that we do not accidentally overwrite any values in the array
        we have to merge the sorted array into, and because the empty space is at the end of the array, so naturally that is where
        we should target.

        We have to compare the elements pointed to by nums1Pointer and nums2Pointer, and place the larger element at position sortedArrayPointer
        in nums1 and move the corresponding pointers nums1Pointer and nums2Pointer backwards.

        We must copy any leftover elements from nums2 into nums1 after we have iterated through the entire array. Any leftover
        elements in nums1 means that they are in place
         */
        int nums1Pointer = m - 1;
        int nums2Pointer = n - 1;
        int sortedArrayPointer = (m + n) - 1; // I always specify the math operation to do first in parentheses to make it very clear what is to happen first

        /*
        Use a while loop because you think in your head 'while this thing is happening'. A for loop would work as well, but a while loop
        is more natural in this context
         */
        while (nums1Pointer >= 0 && nums2Pointer >= 0) {
            if (nums1[nums1Pointer] > nums2[nums2Pointer]) {
                nums1[sortedArrayPointer--] = nums1[nums1Pointer--];
            } else {
                nums1[sortedArrayPointer--] = nums2[nums2Pointer--];
            }
        }

        while (nums2Pointer >= 0) {
            nums1[sortedArrayPointer--] = nums2[nums2Pointer--];
        }
    }
}
