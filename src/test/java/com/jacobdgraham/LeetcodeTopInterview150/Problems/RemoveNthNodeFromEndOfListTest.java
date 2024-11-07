package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import com.jacobdgraham.Utils.ListNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RemoveNthNodeFromEndOfListTest {
    RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList;

    @BeforeEach
    void setUp() {
        removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
    }

    @AfterEach
    void tearDown() {
        removeNthNodeFromEndOfList = null;
    }

    @Test
    void testExample1() {
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4, 5});
        int n = 2;
        ListNode expected = createLinkedList(new int[]{1, 2, 3, 5});

        ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(head, n);

        assertTrue(compareLinkedLists(expected, result));
    }

    @Test
    void testExample2SingleElement() {
        ListNode head = createLinkedList(new int[]{1});
        int n = 1;

        ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(head, n);

        assertNull(result);
    }

    @Test
    void testExample3TwoElements() {
        ListNode head = createLinkedList(new int[]{1, 2});
        int n = 1;
        ListNode expected = createLinkedList(new int[]{1});

        ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(head, n);

        assertTrue(compareLinkedLists(expected, result));
    }

    @Test
    void testRemoveFirstNodeInLongList() {
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4, 5});
        int n = 5;
        ListNode expected = createLinkedList(new int[]{2, 3, 4, 5});

        ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(head, n);

        assertTrue(compareLinkedLists(expected, result));
    }

    @Test
    void testRemoveLastNodeInLongList() {
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4, 5});
        int n = 1;
        ListNode expected = createLinkedList(new int[]{1, 2, 3, 4});

        ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(head, n);

        assertTrue(compareLinkedLists(expected, result));
    }

    @Test
    void testMiddleNodeRemoval() {
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4, 5, 6});
        int n = 3;
        ListNode expected = createLinkedList(new int[]{1, 2, 3, 5, 6});

        ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(head, n);

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
