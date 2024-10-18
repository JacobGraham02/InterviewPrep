package com.jacobdgraham.LeetcodeTopInterview150.LinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedListIITest {

    private RemoveDuplicatesFromSortedListII removeDuplicatesFromSortedListII;

    @BeforeEach
    void setUp() {
        removeDuplicatesFromSortedListII = new RemoveDuplicatesFromSortedListII();
    }

    @AfterEach
    void tearDown() {
        removeDuplicatesFromSortedListII = null;
    }

    // Helper method to create a linked list from an array of integers
    private ListNode createLinkedList(int[] values) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummyHead.next;
    }

    // Helper method to convert a linked list to an array for easier comparison
    private int[] linkedListToArray(ListNode head) {
        int[] result = new int[300];  // assuming the max length of the list is 300 nodes
        int index = 0;
        while (head != null) {
            result[index++] = head.val;
            head = head.next;
        }
        return java.util.Arrays.copyOf(result, index);
    }

    @Test
    void testExample1() {
        // Input: head = [1, 2, 3, 3, 4, 4, 5]
        // Output: [1, 2, 5]
        ListNode head = createLinkedList(new int[]{1, 2, 3, 3, 4, 4, 5});
        ListNode result = removeDuplicatesFromSortedListII.deleteDuplicates(head);
        int[] expected = {1, 2, 5};
        assertArrayEquals(expected, linkedListToArray(result));
    } // Helper method to create a linked list from an array of integers

    @Test
    void testExample2() {
        // Input: head = [1, 1, 1, 2, 3]
        // Output: [2, 3]
        ListNode head = createLinkedList(new int[]{1, 1, 1, 2, 3});
        ListNode result = removeDuplicatesFromSortedListII.deleteDuplicates(head);
        int[] expected = {2, 3};
        assertArrayEquals(expected, linkedListToArray(result));
    }

    @Test
    void testAllDuplicates() {
        // Input: head = [1, 1, 1, 1, 1]
        // Output: []
        ListNode head = createLinkedList(new int[]{1, 1, 1, 1, 1});
        ListNode result = removeDuplicatesFromSortedListII.deleteDuplicates(head);
        int[] expected = {};
        assertArrayEquals(expected, linkedListToArray(result));
    }

    @Test
    void testNoDuplicates() {
        // Input: head = [1, 2, 3, 4, 5]
        // Output: [1, 2, 3, 4, 5]
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4, 5});
        ListNode result = removeDuplicatesFromSortedListII.deleteDuplicates(head);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, linkedListToArray(result));
    }

    @Test
    void testSingleElement() {
        // Input: head = [1]
        // Output: [1]
        ListNode head = createLinkedList(new int[]{1});
        ListNode result = removeDuplicatesFromSortedListII.deleteDuplicates(head);
        int[] expected = {1};
        assertArrayEquals(expected, linkedListToArray(result));
    }

    @Test
    void testTwoElementsNoDuplicates() {
        // Input: head = [1, 2]
        // Output: [1, 2]
        ListNode head = createLinkedList(new int[]{1, 2});
        ListNode result = removeDuplicatesFromSortedListII.deleteDuplicates(head);
        int[] expected = {1, 2};
        assertArrayEquals(expected, linkedListToArray(result));
    }

    @Test
    void testTwoElementsWithDuplicates() {
        // Input: head = [2, 2]
        // Output: []
        ListNode head = createLinkedList(new int[]{2, 2});
        ListNode result = removeDuplicatesFromSortedListII.deleteDuplicates(head);
        int[] expected = {};
        assertArrayEquals(expected, linkedListToArray(result));
    }
}