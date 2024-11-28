package com.jacobdgraham.LeetcodeTopInterview150.Problems;


import com.jacobdgraham.Utils.TreeNode;

public class SameTree {
    /**
     * Checks if two binary trees are structurally identical and have the same node values.
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: p = [1,2,3], q = [1,2,3]
     * Output: true
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: p = [1,2], q = [1,null,2]
     * Output: false
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>The number of nodes in both trees is in the range [0, 100].</li>
     *   <li>-10⁴ <= Node.val <= 10⁴</li>
     * </ul>
     *
     * @param p the root of the first binary tree
     * @param q the root of the second binary tree
     * @return true if the trees are the same, false otherwise
     * @see <a href="https://leetcode.com/problems/same-tree/description/" title="A link to the leetcode problem 'Same Tree'">Leetcode</a>
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
