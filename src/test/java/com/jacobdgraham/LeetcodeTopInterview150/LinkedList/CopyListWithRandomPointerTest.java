package com.jacobdgraham.LeetcodeTopInterview150.LinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CopyListWithRandomPointerTest {
    CopyListWithRandomPointer copyListWithRandomPointer;

    @BeforeEach
    void setUp() {
        copyListWithRandomPointer = new CopyListWithRandomPointer();
    }

    @AfterEach
    void tearDown() {
        copyListWithRandomPointer = null;
    }

    // Helper method to compare two lists, including both next and random pointers
    private boolean compareLists(Node head1, Node head2) {
        while (head1 != null && head2 != null) {
            if (head1.val != head2.val) {
                return false;
            }
            if (head1.random != null && head2.random != null) {
                if (head1.random.val != head2.random.val) {
                    return false;
                }
            } else if (head1.random != head2.random) { // Check if one is null and the other isn't
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1 == null && head2 == null;
    }

    @Test
    void testSingleElementWithNullRandom() {
        // Create a list with a single element, random is null
        Node node = new Node(1);
        node.random = null;

        Node copiedList = copyListWithRandomPointer.copyRandomList(node);

        assertNotNull(copiedList);
        assertEquals(1, copiedList.val);
        assertNull(copiedList.random);
        assertNull(copiedList.next);
    }

    @Test
    void testTwoNodesWithSelfRandom() {
        // Create a list: 1 -> 2, with random pointers pointing to themselves
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.next = node2;
        node1.random = node1;
        node2.random = node2;

        Node copiedList = copyListWithRandomPointer.copyRandomList(node1);

        // Compare the copied list with the original
        assertTrue(compareLists(node1, copiedList));
    }

    @Test
    void testThreeNodesWithMixedRandom() {
        // Create a list: 1 -> 2 -> 3, with mixed random pointers
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;

        node1.random = node3; // 1 -> 3 (random)
        node2.random = null;  // 2 -> null (random)
        node3.random = node1; // 3 -> 1 (random)

        Node copiedList = copyListWithRandomPointer.copyRandomList(node1);

        // Compare the copied list with the original
        assertTrue(compareLists(node1, copiedList));
    }

    @Test
    void testEmptyList() {
        // Create an empty list (head is null)
        Node head = null;

        Node copiedList = copyListWithRandomPointer.copyRandomList(head);

        assertNull(copiedList);
    }

    @Test
    void testCyclicRandomPointers() {
        // Create a list with cyclic random pointers: 1 -> 2 -> 3 -> null
        // Random pointers: 1 -> 2, 2 -> 3, 3 -> 1
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        node1.random = node2;
        node2.random = node3;
        node3.random = node1;

        Node copiedList = copyListWithRandomPointer.copyRandomList(node1);

        // Compare the copied list with the original
        assertTrue(compareLists(node1, copiedList));
    }
}