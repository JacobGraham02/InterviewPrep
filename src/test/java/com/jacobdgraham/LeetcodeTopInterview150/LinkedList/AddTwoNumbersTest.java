package com.jacobdgraham.LeetcodeTopInterview150.LinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    private AddTwoNumbers addTwoNumbers;

    @BeforeEach
    void setUp() {
        addTwoNumbers = new AddTwoNumbers();
    }

    @AfterEach
    void tearDown() {
        addTwoNumbers = null;
    }

    // Helper method to create a linked list from an array
    private ListNode createLinkedList(int[] digits) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        for (int digit : digits) {
            current.next = new ListNode(digit);
            current = current.next;
        }
        return dummyHead.next;
    }

    // Helper method to convert a linked list to an array for easy comparison
    private int[] linkedListToArray(ListNode head) {
        int[] result = new int[100]; // assuming max length of 100 nodes
        int index = 0;
        while (head != null) {
            result[index++] = head.val;
            head = head.next;
        }
        return java.util.Arrays.copyOf(result, index);
    }

    @Test
    void testExample1() {
        // Input: l1 = [2,4,3], l2 = [5,6,4]
        // Output: [7,0,8] (342 + 465 = 807)
        ListNode l1 = createLinkedList(new int[]{2, 4, 3});
        ListNode l2 = createLinkedList(new int[]{5, 6, 4});

        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        int[] expected = {7, 0, 8};

        assertArrayEquals(expected, linkedListToArray(result));
    }

    @Test
    void testExample2() {
        // Input: l1 = [0], l2 = [0]
        // Output: [0]
        ListNode l1 = createLinkedList(new int[]{0});
        ListNode l2 = createLinkedList(new int[]{0});

        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        int[] expected = {0};

        assertArrayEquals(expected, linkedListToArray(result));
    }

    @Test
    void testExample3() {
        // Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        // Output: [8,9,9,9,0,0,0,1] (9999999 + 9999 = 10009998)
        ListNode l1 = createLinkedList(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode l2 = createLinkedList(new int[]{9, 9, 9, 9});

        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        int[] expected = {8, 9, 9, 9, 0, 0, 0, 1};

        assertArrayEquals(expected, linkedListToArray(result));
    }

    @Test
    void testWithCarryOver() {
        // Test with carry over in each step
        // Input: l1 = [9,9], l2 = [1]
        // Output: [0,0,1] (99 + 1 = 100)
        ListNode l1 = createLinkedList(new int[]{9, 9});
        ListNode l2 = createLinkedList(new int[]{1});

        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        int[] expected = {0, 0, 1};

        assertArrayEquals(expected, linkedListToArray(result));
    }

    @Test
    void testDifferentLengths() {
        // Input: l1 = [2,4], l2 = [5,6,4]
        // Output: [7,0,5] (42 + 465 = 507)
        ListNode l1 = createLinkedList(new int[]{2, 4});
        ListNode l2 = createLinkedList(new int[]{5, 6, 4});

        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        int[] expected = {7, 0, 5};

        assertArrayEquals(expected, linkedListToArray(result));
    }
}