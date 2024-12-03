package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import com.jacobdgraham.Utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree {
    /**
     * Finds the maximum depth of a binary tree.
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: root = [3,9,20,null,null,15,7]
     * Output: 3
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: root = [1,null,2]
     * Output: 2
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>The number of nodes in the tree is in the range [0, 10⁴].</li>
     *   <li>-100 <= Node.val <= 100</li>
     * </ul>
     *
     * @param root the root of the binary tree
     * @return the maximum depth of the binary tree
     * @see <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/" title="A link to the leetcode problem 'Maximum Depth of Binary Tree">Leetcode</a>
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.offer(root);
        int treeDepth = 0;

        while (!(treeNodeQueue.isEmpty())) {
            int treeSize = treeNodeQueue.size();

            for (int i = 0; i < treeSize; i++) {
                TreeNode currentNode = treeNodeQueue.poll();

                if (currentNode != null) {

                    if (currentNode.left != null) {
                        treeNodeQueue.offer(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        treeNodeQueue.offer(currentNode.right);
                    }
                }
            }
            treeDepth++;
        }

        return treeDepth;
    }

    /**
     * Finds the maximum depth of a binary tree.
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: root = [3,9,20,null,null,15,7]
     * Output: 3
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: root = [1,null,2]
     * Output: 2
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>The number of nodes in the tree is in the range [0, 10⁴].</li>
     *   <li>-100 <= Node.val <= 100</li>
     * </ul>
     *
     * @param root the root of the binary tree
     * @return the maximum depth of the binary tree
     * @see <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/" title="A link to the leetcode problem 'Maximum Depth of Binary Tree">Leetcode</a>
     */
    public int maxDepthRecursive(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepthRecursive(root.left) + 1;
        int rightDepth = maxDepthRecursive(root.right) + 1;
        return Math.max(leftDepth, rightDepth);
    }
}
