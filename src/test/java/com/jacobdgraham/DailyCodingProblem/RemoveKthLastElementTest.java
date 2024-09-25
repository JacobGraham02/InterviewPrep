package com.jacobdgraham.DailyCodingProblem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveKthLastElementTest {

    private RemoveKthLastElement removeKthLastElement;
    private Node head;

    @BeforeEach
    void setUp() {
        removeKthLastElement = new RemoveKthLastElement();
        head = removeKthLastElement.createNodes(); 
    }

    @AfterEach
    void tearDown() {
        removeKthLastElement = null;
        head = null;
    }

    @Test
    void testRemove3rdLastNode() {
        int k = 3;
        head = removeKthLastElement.removeKthNode(head, k);
        String expectedList = "10 -> 20 -> 30 -> 40 -> 50 -> 60 -> 70 -> 90 -> 100 -> null";
        assertEquals(expectedList, removeKthLastElement.listToString(head));
    }

    @Test
    void testRemoveFirstNode() {
        int k = 10;
        head = removeKthLastElement.removeKthNode(head, k);
        String expectedList = "20 -> 30 -> 40 -> 50 -> 60 -> 70 -> 80 -> 90 -> 100 -> null";
        assertEquals(expectedList, removeKthLastElement.listToString(head));
    }

    @Test
    void testRemoveLastNode() {
        int k = 1;
        head = removeKthLastElement.removeKthNode(head, k);
        String expectedList = "10 -> 20 -> 30 -> 40 -> 50 -> 60 -> 70 -> 80 -> 90 -> null";
        assertEquals(expectedList, removeKthLastElement.listToString(head));
    }
}