package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import com.jacobdgraham.Utils.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {
    /**
     * Converts a sorted array into a height-balanced binary search tree.
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: nums = [-10,-3,0,5,9]
     * Output: [0,-3,9,-10,null,5]
     * Explanation: [0,-10,5,null,-3,null,9] is also accepted.
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: nums = [1,3]
     * Output: [3,1]
     * Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>1 <= nums.length <= 10⁴</li>
     *   <li>-10⁴ <= nums[i] <= 10⁴</li>
     *   <li>nums is sorted in strictly increasing order.</li>
     * </ul>
     *
     * @param nums the sorted integer array
     * @return the root of the height-balanced binary search tree
     * @see <a href="https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/" title="A link to the leetcode problem 'Convert Sorted Array to Binary Search Tree'">Leetcode</a>
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        /*
        The most efficient strategy to convert a sorted array to bst involves using recursion in the following method:
            1. The middle element of the array becomes the root of the tree, ensuring that the tree is balanced
            2. The elements to the left of the middle element form the left subtree (smaller than the root)
            3. The elements to the right of the middle element form the right subtree (larger than the root)
            4. Recursively repeat the process for the left and right halves of the array
            Use the same equation from a binary search to find the middle element (left + (right - left) / 2)
         */
        return buildBST(nums, 0, nums.length - 1);
    }

    /**
     * Helper function to recursively build the binary search tree given an array of ascendingly-sorted numbers, and a left & right pointer
     *
     * @param nums the sorted array
     * @param left the left boundary of the current subarray
     * @param right the right boundary of the current subarray
     * @return the root of the BST for the current subarray
     */
    private TreeNode buildBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int middleElement = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[middleElement]);

        /*
        left remains 0, and right remains as the last element in the array. Therefore, we have to move the middleElement either 1 location to the
        right of its current position for the right subtree, or 1 location to the left of its current position for the left subtree
         */
        root.left = buildBST(nums, left, middleElement - 1);
        root.right = buildBST(nums, middleElement + 1, right);

        return root;
    }
}
