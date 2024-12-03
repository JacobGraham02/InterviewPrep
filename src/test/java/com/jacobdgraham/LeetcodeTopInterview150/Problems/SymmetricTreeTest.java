package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import com.jacobdgraham.Utils.TreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeTest {

    SymmetricTree symmetricTree;

    @BeforeEach
    void setUp() {
        symmetricTree = new SymmetricTree();
    }

    @AfterEach
    void tearDown() {
        symmetricTree = null;
    }

    @Test
    void testExample1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        assertTrue(symmetricTree.isSymmetric(root));
    }

    @Test
    void testExample2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(3);

        assertFalse(symmetricTree.isSymmetric(root));
    }

    @Test
    void testSingleNodeTree() {
        TreeNode root = new TreeNode(1);

        assertTrue(symmetricTree.isSymmetric(root));
    }

    @Test
    void testEmptyTree() {
        TreeNode root = null;

        assertTrue(symmetricTree.isSymmetric(root));
    }

    @Test
    void testAsymmetricTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(3);

        assertFalse(symmetricTree.isSymmetric(root));
    }

    @Test
    void testSymmetricTreeWithNulls() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(3);

        assertTrue(symmetricTree.isSymmetric(root));
    }

    @Test
    void testComplexSymmetricTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        root.left.left.left = new TreeNode(5);
        root.right.right.right = new TreeNode(5);

        assertTrue(symmetricTree.isSymmetric(root));
    }
}