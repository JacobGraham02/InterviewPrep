package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import com.jacobdgraham.Utils.TreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeInorderTraversalTest {

    BinaryTreeInorderTraversal binaryTreeInorderTraversal;

    @BeforeEach
    void setUp() {
        binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();
    }

    @AfterEach
    void tearDown() {
        binaryTreeInorderTraversal = null;
    }


    @Test
    void testExample1() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> expected = List.of(1, 3, 2);
        List<Integer> result = binaryTreeInorderTraversal.inorderTraversal(root);

        assertEquals(expected, result);
    }

    @Test
    void testExample2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<Integer> expected = List.of(4, 2, 5, 1, 6, 3, 7);
        List<Integer> result = binaryTreeInorderTraversal.inorderTraversal(root);

        assertEquals(expected, result);
    }

    @Test
    void testEmptyTree() {
        TreeNode root = null;

        List<Integer> expected = List.of();
        List<Integer> result = binaryTreeInorderTraversal.inorderTraversal(root);

        assertEquals(expected, result);
    }

    @Test
    void testSingleNodeTree() {
        TreeNode root = new TreeNode(1);

        List<Integer> expected = List.of(1);
        List<Integer> result = binaryTreeInorderTraversal.inorderTraversal(root);

        assertEquals(expected, result);
    }

    @Test
    void testLeftSkewedTree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(1);

        List<Integer> expected = List.of(1, 2, 3, 4);
        List<Integer> result = binaryTreeInorderTraversal.inorderTraversal(root);

        assertEquals(expected, result);
    }

    @Test
    void testRightSkewedTree() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        List<Integer> expected = List.of(1, 2, 3, 4);
        List<Integer> result = binaryTreeInorderTraversal.inorderTraversal(root);

        assertEquals(expected, result);
    }

    @Test
    void testComplexTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);

        List<Integer> expected = List.of(8, 4, 9, 2, 5, 1, 6, 3, 7);
        List<Integer> result = binaryTreeInorderTraversal.inorderTraversal(root);

        assertEquals(expected, result);
    }
}