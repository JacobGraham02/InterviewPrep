package com.jacobdgraham.LeetcodeTopInterview150.LinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    MergeTwoSortedLists mergeTwoSortedLists;

    @BeforeEach
    void setUp() {
        mergeTwoSortedLists = new MergeTwoSortedLists();
    }

    @AfterEach
    void tearDown() {
        mergeTwoSortedLists = null;
    }


    // Helper method to create a linked list from an array
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
        int[] result = new int[100];  // assuming max length of 100 nodes
        int index = 0;
        while (head != null) {
            result[index++] = head.val;
            head = head.next;
        }
        return java.util.Arrays.copyOf(result, index);
    }

    @Test
    void testExample1() {
        // Input: list1 = [1, 2, 4], list2 = [1, 3, 4]
        // Output: [1, 1, 2, 3, 4, 4]
        ListNode list1 = createLinkedList(new int[]{1, 2, 4});
        ListNode list2 = createLinkedList(new int[]{1, 3, 4});

        ListNode result = mergeTwoSortedLists.mergeTwoListsIterative(list1, list2);
        int[] expected = {1, 1, 2, 3, 4, 4};

        assertArrayEquals(expected, linkedListToArray(result));
    }

    @Test
    void testBothEmptyLists() {
        // Input: list1 = [], list2 = []
        // Output: []
        ListNode list1 = createLinkedList(new int[]{});
        ListNode list2 = createLinkedList(new int[]{});

        ListNode result = mergeTwoSortedLists.mergeTwoListsIterative(list1, list2);
        int[] expected = {};

        assertArrayEquals(expected, linkedListToArray(result));
    }

    @Test
    void testOneEmptyList() {
        // Input: list1 = [], list2 = [0]
        // Output: [0]
        ListNode list1 = createLinkedList(new int[]{});
        ListNode list2 = createLinkedList(new int[]{0});

        ListNode result = mergeTwoSortedLists.mergeTwoListsIterative(list1, list2);
        int[] expected = {0};

        assertArrayEquals(expected, linkedListToArray(result));
    }

    @Test
    void testDifferentLengthLists() {
        // Input: list1 = [1, 2, 3], list2 = [4, 5]
        // Output: [1, 2, 3, 4, 5]
        ListNode list1 = createLinkedList(new int[]{1, 2, 3});
        ListNode list2 = createLinkedList(new int[]{4, 5});

        ListNode result = mergeTwoSortedLists.mergeTwoListsIterative(list1, list2);
        int[] expected = {1, 2, 3, 4, 5};

        assertArrayEquals(expected, linkedListToArray(result));
    }

    @Test
    void testBothListsHaveSameValues() {
        // Input: list1 = [2, 2, 2], list2 = [2, 2]
        // Output: [2, 2, 2, 2, 2]
        ListNode list1 = createLinkedList(new int[]{2, 2, 2});
        ListNode list2 = createLinkedList(new int[]{2, 2});

        ListNode result = mergeTwoSortedLists.mergeTwoListsIterative(list1, list2);
        int[] expected = {2, 2, 2, 2, 2};

        assertArrayEquals(expected, linkedListToArray(result));
    }

    @Test
    void testExample1Recursive() {
        // Input: list1 = [1, 2, 4], list2 = [1, 3, 4]
        // Output: [1, 1, 2, 3, 4, 4]
        ListNode list1 = createLinkedList(new int[]{1, 2, 4});
        ListNode list2 = createLinkedList(new int[]{1, 3, 4});

        ListNode result = mergeTwoSortedLists.mergeTwoListsRecursive(list1, list2);
        int[] expected = {1, 1, 2, 3, 4, 4};

        assertArrayEquals(expected, linkedListToArray(result));
    }

    @Test
    void testBothEmptyListsRecursive() {
        // Input: list1 = [], list2 = []
        // Output: []
        ListNode list1 = createLinkedList(new int[]{});
        ListNode list2 = createLinkedList(new int[]{});

        ListNode result = mergeTwoSortedLists.mergeTwoListsRecursive(list1, list2);
        int[] expected = {};

        assertArrayEquals(expected, linkedListToArray(result));
    }

    @Test
    void testOneEmptyListRecursive() {
        // Input: list1 = [], list2 = [0]
        // Output: [0]
        ListNode list1 = createLinkedList(new int[]{});
        ListNode list2 = createLinkedList(new int[]{0});

        ListNode result = mergeTwoSortedLists.mergeTwoListsRecursive(list1, list2);
        int[] expected = {0};

        assertArrayEquals(expected, linkedListToArray(result));
    }

    @Test
    void testDifferentLengthListsRecursive() {
        // Input: list1 = [1, 2, 3], list2 = [4, 5]
        // Output: [1, 2, 3, 4, 5]
        ListNode list1 = createLinkedList(new int[]{1, 2, 3});
        ListNode list2 = createLinkedList(new int[]{4, 5});

        ListNode result = mergeTwoSortedLists.mergeTwoListsRecursive(list1, list2);
        int[] expected = {1, 2, 3, 4, 5};

        assertArrayEquals(expected, linkedListToArray(result));
    }

    @Test
    void testBothListsHaveSameValuesRecursive() {
        // Input: list1 = [2, 2, 2], list2 = [2, 2]
        // Output: [2, 2, 2, 2, 2]
        ListNode list1 = createLinkedList(new int[]{2, 2, 2});
        ListNode list2 = createLinkedList(new int[]{2, 2});

        ListNode result = mergeTwoSortedLists.mergeTwoListsRecursive(list1, list2);
        int[] expected = {2, 2, 2, 2, 2};

        assertArrayEquals(expected, linkedListToArray(result));
    }
}