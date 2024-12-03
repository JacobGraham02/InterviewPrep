package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import com.jacobdgraham.Utils.TreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthOfBinaryTreeTest {

    MaximumDepthOfBinaryTree maximumDepthOfBinaryTree;

    @BeforeEach
    void setUp() {
        maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
    }

    @AfterEach
    void tearDown() {
        maximumDepthOfBinaryTree = null;
    }

    @Test
    void testExample1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int expected = 3;
        int result = maximumDepthOfBinaryTree.maxDepth(root);

        assertEquals(expected, result);
    }

    @Test
    void testExample2() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);

        int expected = 2;
        int result = maximumDepthOfBinaryTree.maxDepth(root);

        assertEquals(expected, result);
    }

    @Test
    void testEmptyTree() {
        TreeNode root = null;

        int expected = 0;
        int result = maximumDepthOfBinaryTree.maxDepth(root);

        assertEquals(expected, result);
    }

    @Test
    void testSingleNodeTree() {
        TreeNode root = new TreeNode(1);

        int expected = 1;
        int result = maximumDepthOfBinaryTree.maxDepth(root);

        assertEquals(expected, result);
    }

    @Test
    void testLeftSkewedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);

        int expected = 4;
        int result = maximumDepthOfBinaryTree.maxDepth(root);

        assertEquals(expected, result);
    }

    @Test
    void testRightSkewedTree() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        int expected = 4;
        int result = maximumDepthOfBinaryTree.maxDepth(root);

        assertEquals(expected, result);
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

        int expected = 3;
        int result = maximumDepthOfBinaryTree.maxDepth(root);

        assertEquals(expected, result);
    }

    @Test
    void testComplexTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);
        root.left.right.right.right = new TreeNode(7);

        int expected = 5;
        int result = maximumDepthOfBinaryTree.maxDepth(root);

        assertEquals(expected, result);
    }
}