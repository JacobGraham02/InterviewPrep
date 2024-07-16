package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */
public class MergeSortedArray {

    /**
     * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
     * @param nums1 an array of integers, sorted ascendingly. This array will, at the end of the function, hold ascendingly-sorted elements from both itself and nums2
     * @param m the size of nums1.
     * @param nums2 an array of integers, sorted ascendingly.
     * @param n the size of nums2
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Iterator = m - 1;
        int nums2Iterator = n - 1;
        int numsMergeIterator = (m + n) - 1;

        while(nums1Iterator >= 0 && nums2Iterator >= 0) {
            if (nums1[nums1Iterator] > nums2[nums2Iterator]) {
                nums1[numsMergeIterator] = nums1[nums1Iterator];
                nums1Iterator--;
            } else {
                nums1[numsMergeIterator] = nums2[nums2Iterator];
                nums2Iterator--;
            }
            numsMergeIterator--;
        }

        while (nums2Iterator >= 0) {
            nums1[numsMergeIterator] = nums2[nums2Iterator];
            nums2Iterator--;
            numsMergeIterator--;
        }
    }
}
