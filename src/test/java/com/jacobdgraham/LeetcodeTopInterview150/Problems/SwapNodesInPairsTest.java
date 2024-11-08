package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import com.jacobdgraham.Utils.ListNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SwapNodesInPairsTest {
    SwapNodesInPairs swapNodesInPairs;

    @BeforeEach
    void setUp() {
        swapNodesInPairs = new SwapNodesInPairs();
    }

    @AfterEach
    void tearDown() {
        swapNodesInPairs = null;
    }

    @Test
    void testExample1() {
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4});
        ListNode expected = createLinkedList(new int[]{2, 1, 4, 3});

        ListNode result = swapNodesInPairs.swapPairs(head);

        assertTrue(compareLinkedLists(expected, result));
    }

    @Test
    void testExample2EmptyList() {
        ListNode head = createLinkedList(new int[]{});

        ListNode result = swapNodesInPairs.swapPairs(head);

        assertNull(result);
    }

    @Test
    void testExample3SingleNode() {
        ListNode head = createLinkedList(new int[]{1});
        ListNode expected = createLinkedList(new int[]{1});

        ListNode result = swapNodesInPairs.swapPairs(head);

        assertTrue(compareLinkedLists(expected, result));
    }

    @Test
    void testExample4OddNumberOfNodes() {
        ListNode head = createLinkedList(new int[]{1, 2, 3});
        ListNode expected = createLinkedList(new int[]{2, 1, 3});

        ListNode result = swapNodesInPairs.swapPairs(head);

        assertTrue(compareLinkedLists(expected, result));
    }

    @Test
    void testLongList() {
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4, 5, 6});
        ListNode expected = createLinkedList(new int[]{2, 1, 4, 3, 6, 5});

        ListNode result = swapNodesInPairs.swapPairs(head);

        assertTrue(compareLinkedLists(expected, result));
    }

    @Test
    void testAllSameValues() {
        ListNode head = createLinkedList(new int[]{1, 1, 1, 1});
        ListNode expected = createLinkedList(new int[]{1, 1, 1, 1});

        ListNode result = swapNodesInPairs.swapPairs(head);

        assertTrue(compareLinkedLists(expected, result));
    }

    // Helper method to create a linked list from an array of integers
    private ListNode createLinkedList(int[] values) {
        ListNode dummyNode = new ListNode(0);
        ListNode current = dummyNode;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummyNode.next;
    }

    // Helper method to compare two linked lists for equality
    private boolean compareLinkedLists(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }
}
