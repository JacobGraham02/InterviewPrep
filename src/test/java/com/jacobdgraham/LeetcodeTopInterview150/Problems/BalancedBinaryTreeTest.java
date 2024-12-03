package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import com.jacobdgraham.Utils.TreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBinaryTreeTest {

    BalancedBinaryTree balancedBinaryTree;

    @BeforeEach
    void setUp() {
        balancedBinaryTree = new BalancedBinaryTree();
    }

    @AfterEach
    void tearDown() {
        balancedBinaryTree = null;
    }

    @Test
    void testExample1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        assertTrue(balancedBinaryTree.isBalanced(root));
    }

    @Test
    void testExample2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);

        assertFalse(balancedBinaryTree.isBalanced(root));
    }

    @Test
    void testExample3() {
        TreeNode root = null;

        assertTrue(balancedBinaryTree.isBalanced(root));
    }

    @Test
    void testSingleNodeTree() {
        TreeNode root = new TreeNode(1);

        assertTrue(balancedBinaryTree.isBalanced(root));
    }

    @Test
    void testLeftSkewedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);

        assertFalse(balancedBinaryTree.isBalanced(root));
    }

    @Test
    void testRightSkewedTree() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        assertFalse(balancedBinaryTree.isBalanced(root));
    }

    @Test
    void testBalancedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        assertTrue(balancedBinaryTree.isBalanced(root));
    }

    @Test
    void testUnbalancedTreeWithOneDeepSubtree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.right = new TreeNode(2);

        assertFalse(balancedBinaryTree.isBalanced(root));
    }
}