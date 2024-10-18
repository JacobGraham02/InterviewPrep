package com.jacobdgraham.LeetcodeTopInterview150.LinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ReverseLinkedListIITest {

    private ReverseLinkedListII reverseLinkedListII;

    @BeforeEach
    void setUp() {
        reverseLinkedListII = new ReverseLinkedListII();
    }

    @AfterEach
    void tearDown() {
        reverseLinkedListII = null;
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

    // Helper method to convert a linked list to an array for comparison
    private int[] linkedListToArray(ListNode head) {
        int[] result = new int[500];  // assuming max length of 500 nodes
        int index = 0;
        while (head != null) {
            result[index++] = head.val;
            head = head.next;
        }
        return java.util.Arrays.copyOf(result, index);
    }

    @Test
    void testExample1() {
        // Input: head = [1, 2, 3, 4, 5], left = 2, right = 4
        // Output: [1, 4, 3, 2, 5]
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4, 5});
        ListNode result = reverseLinkedListII.reverseBetween(head, 2, 4);
        int[] expected = {1, 4, 3, 2, 5};
        assertArrayEquals(expected, linkedListToArray(result));
    }

    @Test
    void testExample2() {
        // Input: head = [5], left = 1, right = 1
        // Output: [5]
        ListNode head = createLinkedList(new int[]{5});
        ListNode result = reverseLinkedListII.reverseBetween(head, 1, 1);
        int[] expected = {5};
        assertArrayEquals(expected, linkedListToArray(result));
    }

    @Test
    void testFullReversal() {
        // Input: head = [1, 2, 3, 4, 5], left = 1, right = 5
        // Output: [5, 4, 3, 2, 1]
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4, 5});
        ListNode result = reverseLinkedListII.reverseBetween(head, 1, 5);
        int[] expected = {5, 4, 3, 2, 1};
        assertArrayEquals(expected, linkedListToArray(result));
    }

    @Test
    void testPartialReversalAtEnd() {
        // Input: head = [1, 2, 3, 4, 5, 6], left = 3, right = 6
        // Output: [1, 2, 6, 5, 4, 3]
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4, 5, 6});
        ListNode result = reverseLinkedListII.reverseBetween(head, 3, 6);
        int[] expected = {1, 2, 6, 5, 4, 3};
        assertArrayEquals(expected, linkedListToArray(result));
    }

    @Test
    void testNoReversal() {
        // Input: head = [1, 2, 3, 4, 5], left = 3, right = 3
        // Output: [1, 2, 3, 4, 5]
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4, 5});
        ListNode result = reverseLinkedListII.reverseBetween(head, 3, 3);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, linkedListToArray(result));
    }
}