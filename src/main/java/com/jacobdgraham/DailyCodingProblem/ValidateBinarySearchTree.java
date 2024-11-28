package com.jacobdgraham.DailyCodingProblem;

import com.jacobdgraham.Utils.TreeNode;

public class ValidateBinarySearchTree {

    /**
     * Determines if a binary search tree is a valid binary search tree. The term BST is used in the function
     * @param root the head node of the Binary Search Tree
     * @return if the tree is a valid BST
     */
    public boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, null, null);
    }

    /**
     * Recursive helper function to validate the BST properties with value ranges.
     *
     * @param node the current node
     * @param min the minimum allowable value for the node
     * @param max the maximum allowable value for the node
     * @return true if the subtree rooted at this node is a valid BST
     */
    private boolean isValidBSTHelper(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return false;
        }

        if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
            return false;
        }

        return isValidBSTHelper(node.left, min, node.val) && isValidBSTHelper(node.right, node.val, max);
    }
}
