package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import com.jacobdgraham.Utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    /**
     * Returns the inorder traversal of a binary tree's nodes' values.
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: root = [1,null,2,3]
     * Output: [1,3,2]
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
     * Output: [4,2,6,5,7,1,3,9,8]
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>The number of nodes in the tree is in the range [0, 100].</li>
     *   <li>-100 <= Node.val <= 100</li>
     * </ul>
     *
     * @param root the root of the binary tree
     * @return a list of integers representing the inorder traversal of the tree
     * @see <a href="https://leetcode.com/problems/binary-tree-inorder-traversal/" title="A link to the leetcode problem 'Binary Tree Inorder Traversal'">Leetcode</a>
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        /*
        For this algorithm, we only have to perform an in-order traversal of the binary tree. I am going to use an iterative approach
        for this algorithm so people who read this who are unfamiliar with recursion will have an easier time reading this
         */
        List<Integer> resultArrayList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode dummyRoot = root;

        while (dummyRoot != null || !stack.isEmpty()) {

            while (dummyRoot != null) {
                stack.add(dummyRoot);
                dummyRoot = dummyRoot.left;
            }

            dummyRoot = stack.pop();
            resultArrayList.add(dummyRoot.val);
            dummyRoot = dummyRoot.right;
        }

        return resultArrayList;
    }
}

