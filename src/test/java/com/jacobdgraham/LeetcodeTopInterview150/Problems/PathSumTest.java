package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import com.jacobdgraham.Utils.TreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathSumTest {

    PathSum pathSum;

    @BeforeEach
    void setUp() {
        pathSum = new PathSum();
    }

    @AfterEach
    void tearDown() {
        pathSum = null;
    }

    @Test
    void testExample1() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        assertTrue(pathSum.hasPathSum(root, 22));
    }

    @Test
    void testExample2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        assertFalse(pathSum.hasPathSum(root, 5));
    }

    @Test
    void testExample3() {
        TreeNode root = null;

        assertFalse(pathSum.hasPathSum(root, 0));
    }

    @Test
    void testSingleNodeMatchingTargetSum() {
        TreeNode root = new TreeNode(5);

        assertTrue(pathSum.hasPathSum(root, 5));
    }

    @Test
    void testSingleNodeNotMatchingTargetSum() {
        TreeNode root = new TreeNode(1);

        assertFalse(pathSum.hasPathSum(root, 5));
    }

    @Test
    void testLeftSkewedTreeMatchingSum() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(2);

        assertTrue(pathSum.hasPathSum(root, 14));
    }

    @Test
    void testRightSkewedTreeNotMatchingSum() {
        TreeNode root = new TreeNode(5);
        root.right = new TreeNode(4);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(2);

        assertFalse(pathSum.hasPathSum(root, 20));
    }

    @Test
    void testTreeWithNegativeValues() {
        TreeNode root = new TreeNode(-2);
        root.right = new TreeNode(-3);

        assertTrue(pathSum.hasPathSum(root, -5));
    }
}