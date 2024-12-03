package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import com.jacobdgraham.Utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    /**
     * Determines if a binary tree is symmetric around its center.
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: root = [1,2,2,3,4,4,3]
     * Output: true
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: root = [1,2,2,null,3,null,3]
     * Output: false
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>The number of nodes in the tree is in the range [1, 1000].</li>
     *   <li>-100 <= Node.val <= 100</li>
     * </ul>
     *
     * @param root the root of the binary tree
     * @return true if the tree is symmetric, false otherwise
     * @see <a href="https://leetcode.com/problems/symmetric-tree/description/" title="A link to the leetcode problem 'Symmetric Tree'">Leetcode</a>
     */
    public boolean isSymmetric(TreeNode root) {
        /*
        We will take an iterative approach first. Initially, to ensure our edge cases are covered, we have to make sure that
        the root of the tree is not null. A null tree is symmetric by default
         Next, we initially insert the left and right nodes that are attached to the tree head node into the queue, and compare those.
        .offer() function is used to insert elements into the queue without violating any capacity restrictions
        .poll() function is used to retrieve and remove an element from the head of the queue
        Subsequently, after this, we need to insert both the left and right elements of both the left and right tree nodes into
        the queue. This will take 4 .offer() function calls
         */
        if (root == null) {
            return true;
        }

        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.offer(root.left);
        treeNodeQueue.offer(root.right);

        while (!(treeNodeQueue.isEmpty())) {
            TreeNode leftNode = treeNodeQueue.poll();
            TreeNode rightNode = treeNodeQueue.poll();

            if (leftNode == null && rightNode == null) {
                continue;
            }
            if (leftNode == null || rightNode == null) {
                return false;
            }
            if (leftNode.val != rightNode.val) {
                return false;
            }

            /*
            The order of inserting nodes into the queue matters because of symmetry. The outer nodes on both the left and right tree branches
            will be compared, and the same for the inner nodes.
             */
            treeNodeQueue.offer(leftNode.left);
            treeNodeQueue.offer(rightNode.right);
            treeNodeQueue.offer(leftNode.right);
            treeNodeQueue.offer(rightNode.left);
        }

        return true;
    }
}
