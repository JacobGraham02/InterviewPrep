package com.jacobdgraham.LeetcodeTopInterview150.LinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {

    private LinkedListCycle linkedListCycle;

    @BeforeEach
    void setUp() {
        linkedListCycle = new LinkedListCycle();
    }

    @AfterEach
    void tearDown() {
        linkedListCycle = null;
    }

    @Test
    void testCycleInMiddle() {
        // List: 1 -> 2 -> 3 -> 4 -> 5 -> (back to node 3)
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node3; // Cycle here

        assertTrue(linkedListCycle.hasCycle(node1));
    }

    @Test
    void testNoCycle() {
        // List: 1 -> 2 -> 3 -> 4 -> 5 (no cycle)
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null; // No cycle

        assertFalse(linkedListCycle.hasCycle(node1));
    }

    @Test
    void testSingleElementNoCycle() {
        // List: 1 (no cycle)
        Node node1 = new Node(1);
        node1.next = null;

        assertFalse(linkedListCycle.hasCycle(node1));
    }

    @Test
    void testSingleElementCycle() {
        // List: 1 -> (points to itself)
        Node node1 = new Node(1);
        node1.next = node1; // Cycle

        assertTrue(linkedListCycle.hasCycle(node1));
    }

    @Test
    void testEmptyList() {
        // Empty list
        Node head = null;

        assertFalse(linkedListCycle.hasCycle(head));
    }
}