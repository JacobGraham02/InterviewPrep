package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import com.jacobdgraham.Utils.TreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameTreeTest {

    SameTree sameTree;

    @BeforeEach
    void setUp() {
        sameTree = new SameTree();
    }

    @AfterEach
    void tearDown() {
        sameTree = null;
    }

    @Test
    void testIdenticalTrees() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        assertTrue(sameTree.isSameTree(p, q));
    }

    @Test
    void testDifferentStructures() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);

        TreeNode q = new TreeNode(1);
        q.right = new TreeNode(2);

        assertFalse(sameTree.isSameTree(p, q));
    }

    @Test
    void testDifferentValues() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(4);

        assertFalse(sameTree.isSameTree(p, q));
    }

    @Test
    void testOneTreeEmpty() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);

        TreeNode q = null;

        assertFalse(sameTree.isSameTree(p, q));
    }

    @Test
    void testBothTreesEmpty() {
        TreeNode p = null;
        TreeNode q = null;

        assertTrue(sameTree.isSameTree(p, q));
    }

    @Test
    void testSingleNodeTreesSameValue() {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);

        assertTrue(sameTree.isSameTree(p, q));
    }

    @Test
    void testSingleNodeTreesDifferentValues() {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(2);

        assertFalse(sameTree.isSameTree(p, q));
    }

    @Test
    void testLargerIdenticalTrees() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        p.left.left = new TreeNode(4);
        p.left.right = new TreeNode(5);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        q.left.left = new TreeNode(4);
        q.left.right = new TreeNode(5);

        assertTrue(sameTree.isSameTree(p, q));
    }

    @Test
    void testLargerDifferentTrees() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        p.left.left = new TreeNode(4);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        q.left.right = new TreeNode(4);

        assertFalse(sameTree.isSameTree(p, q));
    }
}