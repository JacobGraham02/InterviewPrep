package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import com.jacobdgraham.Utils.TreeNode;

public class BalancedBinaryTree {
    /**
     * Determines if a binary tree is height-balanced.
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: root = [3,9,20,null,null,15,7]
     * Output: true
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: root = [1,2,2,3,3,null,null,4,4]
     * Output: false
     * </pre>
     *
     * <p><strong>Example 3:</strong></p>
     * <pre>
     * Input: root = []
     * Output: true
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>The number of nodes in the tree is in the range [0, 5000].</li>
     *   <li>-10⁴ <= Node.val <= 10⁴</li>
     * </ul>
     *
     * @param root the root of the binary tree
     * @return true if the tree is height-balanced, false otherwise
     * @see <a href="https://leetcode.com/problems/balanced-binary-tree/" title="A link to the leetcode problem 'Balanced Binary Tree'">Leetcode</a>
     */
    public boolean isBalanced(TreeNode root) {
        /*
        To determine if a binary tree is height-balanced, we need to ensure the following:
            1. The difference between the heights of the left and right subtrees or every node is at most 1
            2. The left and right subtrees are also height-balanced
        A depth-first search algorithm would be suitable for this because we can calculate the height of each subtree recursively, and check the balance
        condition during our recursive traversal
         */
        return checkHeight(root) != -1;
    }

    /**
     * Helper method to check the height of the tree and whether it is balanced.
     *
     * @param node the current tree node
     * @return the height of the subtree if balanced, or -1 if unbalanced
     */
    private int checkHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = checkHeight(node.left);
        /*
        Check if the left subtree is unbalanced
         */
        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = checkHeight(node.right);
        /*
        Check if the right subtree is unbalanced
         */
        if (rightHeight == -1) {
            return -1;
        }

        /*
        Check if the current node is unbalanced
         */
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        /*
        Return the node depth (height) of the current node
         */
        return 1 + (Math.max(leftHeight, rightHeight));
    }
}
