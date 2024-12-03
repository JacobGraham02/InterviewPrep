package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import com.jacobdgraham.Utils.TreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.SortedMap;

import static org.junit.jupiter.api.Assertions.*;

class ConvertSortedArrayToBinarySearchTreeTest {

    ConvertSortedArrayToBinarySearchTree convertSortedArrayToBinarySearchTree;

    @BeforeEach
    void setUp() {
        convertSortedArrayToBinarySearchTree = new ConvertSortedArrayToBinarySearchTree();
    }

    @AfterEach
    void tearDown() {
        convertSortedArrayToBinarySearchTree = null;
    }

    @Test
    void testSingleElementArray() {
        int[] nums = {1};
        TreeNode result = convertSortedArrayToBinarySearchTree.sortedArrayToBST(nums);

        assertNotNull(result);
        assertEquals(1, result.val);
        assertNull(result.left);
        assertNull(result.right);
    }

    @Test
    void testEvenLengthArray() {
        int[] nums = {1, 2, 3, 4};
        TreeNode result = convertSortedArrayToBinarySearchTree.sortedArrayToBST(nums);

        assertNotNull(result);
        assertTrue(result.val == 2 || result.val == 3);
        if (result.val == 2) {
            assertEquals(1, result.left.val);
            assertEquals(3, result.right.val);
        } else {
            assertEquals(2, result.left.val);
            assertEquals(4, result.right.val);
        }
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        TreeNode result = convertSortedArrayToBinarySearchTree.sortedArrayToBST(nums);

        assertNull(result);
    }

    @Test
    void testLargeArray() {
        int[] nums = new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums[i] = i;
        }
        TreeNode result = convertSortedArrayToBinarySearchTree.sortedArrayToBST(nums);

        assertNotNull(result);
        assertTrue(isHeightBalanced(result));
    }

    /**
     * Helper function to check if a binary tree is height-balanced.
     *
     * @param root the root of the tree
     * @return true if the tree is height-balanced, false otherwise
     */
    private boolean isHeightBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }
}