package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import com.jacobdgraham.Utils.ListNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedListTest {

    RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList;

    @BeforeEach
    void setUp() {
        removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();
    }

    @AfterEach
    void tearDown() {
        removeDuplicatesFromSortedList = null;
    }

    @Test
    void testExample1() {
        ListNode head = createLinkedList(new int[]{1, 1, 2});
        ListNode expected = createLinkedList(new int[]{1, 2});

        ListNode result = removeDuplicatesFromSortedList.deleteDuplicates(head);

        assertTrue(compareLinkedLists(expected, result));
    }

    @Test
    void testExample2() {
        ListNode head = createLinkedList(new int[]{1, 1, 2, 3, 3});
        ListNode expected = createLinkedList(new int[]{1, 2, 3});

        ListNode result = removeDuplicatesFromSortedList.deleteDuplicates(head);

        assertTrue(compareLinkedLists(expected, result));
    }

    @Test
    void testEmptyList() {
        ListNode head = createLinkedList(new int[]{});

        ListNode result = removeDuplicatesFromSortedList.deleteDuplicates(head);

        assertNull(result);
    }

    @Test
    void testSingleElementList() {
        ListNode head = createLinkedList(new int[]{1});
        ListNode expected = createLinkedList(new int[]{1});

        ListNode result = removeDuplicatesFromSortedList.deleteDuplicates(head);

        assertTrue(compareLinkedLists(expected, result));
    }

    @Test
    void testNoDuplicates() {
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4, 5});
        ListNode expected = createLinkedList(new int[]{1, 2, 3, 4, 5});

        ListNode result = removeDuplicatesFromSortedList.deleteDuplicates(head);

        assertTrue(compareLinkedLists(expected, result));
    }

    @Test
    void testAllDuplicates() {
        ListNode head = createLinkedList(new int[]{2, 2, 2, 2});
        ListNode expected = createLinkedList(new int[]{2});

        ListNode result = removeDuplicatesFromSortedList.deleteDuplicates(head);

        assertTrue(compareLinkedLists(expected, result));
    }

    @Test
    void testMixedDuplicates() {
        ListNode head = createLinkedList(new int[]{1, 1, 2, 3, 3, 4, 4, 4, 5});
        ListNode expected = createLinkedList(new int[]{1, 2, 3, 4, 5});

        ListNode result = removeDuplicatesFromSortedList.deleteDuplicates(head);

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