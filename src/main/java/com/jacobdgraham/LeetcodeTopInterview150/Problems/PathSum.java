package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import com.jacobdgraham.Utils.TreeNode;

public class PathSum {
    /**
     * <p>Given the root of a binary tree and an integer targetSum, return <code>true</code> if the tree
     * has a root-to-leaf path such that adding up all the values along the path equals <code>targetSum</code>.</p>
     *
     * <p>A <strong>leaf</strong> is a node with no children.</p>
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
     * Output: true
     * Explanation: The root-to-leaf path with the target sum is shown.
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: root = [1,2,3], targetSum = 5
     * Output: false
     * Explanation: There are two root-to-leaf paths in the tree:
     * (1 --> 2): The sum is 3.
     * (1 --> 3): The sum is 4.
     * There is no root-to-leaf path with sum = 5.
     * </pre>
     *
     * <p><strong>Example 3:</strong></p>
     * <pre>
     * Input: root = [], targetSum = 0
     * Output: false
     * Explanation: Since the tree is empty, there are no root-to-leaf paths.
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     * <li>The number of nodes in the tree is in the range <code>[0, 5000]</code>.</li>
     * <li><code>-1000 <= Node.val <= 1000</code></li>
     * <li><code>-1000 <= targetSum <= 1000</code></li>
     * </ul>
     * @param root The root of the tree
     * @param targetSum The sum which a root-to-leaf path must equal
     * @return true if a valid path exists that equals to targetSum; false otherwise
     * @see <a href="https://leetcode.com/problems/path-sum/" title="A link to the leetcode problem 'Path Sum'">Leetcode</a>
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        /*
        If the root of the tree is null, there are no possible paths
         */
        if (root == null) {
            return false;
        }

        /*
        If the root is not null, but the left and right initial leaf nodes are, check if the node value equals targetSum
         */
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        /*
        As we go down through the tree, we have to subtract the value of the leaf node from targetSum.
        From here, we can use recursion to go down the left and right subtrees.
        Because we can check either the left or right path, we can use an OR operator
         */
        int remainingSum = targetSum - root.val;
        return hasPathSum(root.left, remainingSum) || hasPathSum(root.right, remainingSum);
    }
}
