package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RemoveElementTest {
    
    private static RemoveElement removeElement;

    @BeforeAll
    static void setUp() {
        removeElement = new RemoveElement();
    }

    @Test
    public void testRemoveElementAllMatch() {
        int[] nums = {1, 1, 1, 1};
        int val = 1;
        int expectedLength = 0;
        assertEquals(expectedLength, removeElement.removeElement(nums, val), "Array should be empty after removal.");
    }

    @Test
    public void testRemoveElementNoMatch() {
        int[] nums = {1, 2, 3, 4};
        int val = 5;
        int expectedLength = 4;
        assertEquals(expectedLength, removeElement.removeElement(nums, val), "Array length should remain unchanged.");
    }

    @Test
    public void testRemoveElementMixedValues() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int expectedLength = 2;
        assertEquals(expectedLength, removeElement.removeElement(nums, val), "Array should contain only two elements after removal.");
    }

    @Test
    public void testRemoveElementSingleElementMatch() {
        int[] nums = {1};
        int val = 1;
        int expectedLength = 0;
        assertEquals(expectedLength, removeElement.removeElement(nums, val), "Single element array should be empty after removal.");
    }

    @Test
    public void testRemoveElementSingleElementNoMatch() {
        int[] nums = {1};
        int val = 2;
        int expectedLength = 1;
        assertEquals(expectedLength, removeElement.removeElement(nums, val), "Single element array length should remain unchanged.");
    }

    @AfterAll
    static void tearDown() {
        removeElement = null;
    }
}
