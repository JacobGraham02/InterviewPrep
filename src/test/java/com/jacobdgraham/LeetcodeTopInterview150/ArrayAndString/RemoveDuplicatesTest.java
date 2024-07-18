package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTest {
    private static RemoveDuplicates removeDuplicates;

    @BeforeAll
    static void setUp() {
        removeDuplicates = new RemoveDuplicates();
    }

    @Test
    public void testRemoveDuplicates_AllUnique() {
        int[] nums = {1, 2, 3, 4, 5};
        int expectedLength = 5;
        assertEquals(expectedLength, removeDuplicates.removeDuplicates(nums));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, java.util.Arrays.copyOf(nums, expectedLength));
    }

    @Test
    public void testRemoveDuplicates_SomeDuplicates() {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 5, 5};
        int expectedLength = 5;
        assertEquals(expectedLength, removeDuplicates.removeDuplicates(nums));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, java.util.Arrays.copyOf(nums, expectedLength));
    }

    @Test
    public void testRemoveDuplicates_NoDuplicates() {
        int[] nums = {1, 1, 1, 1, 1};
        int expectedLength = 1;
        assertEquals(expectedLength, removeDuplicates.removeDuplicates(nums));
        assertArrayEquals(new int[]{1}, java.util.Arrays.copyOf(nums, expectedLength));
    }

    @Test
    public void testRemoveDuplicates_EmptyArray() {
        int[] nums = {};
        int expectedLength = 0;
        assertEquals(expectedLength, removeDuplicates.removeDuplicates(nums));
        assertArrayEquals(new int[]{}, java.util.Arrays.copyOf(nums, expectedLength));
    }

    @Test
    public void testRemoveDuplicates_SingleElement() {
        int[] nums = {7};
        int expectedLength = 1;
        assertEquals(expectedLength, removeDuplicates.removeDuplicates(nums));
        assertArrayEquals(new int[]{7}, java.util.Arrays.copyOf(nums, expectedLength));
    }

    @Test
    public void testRemoveDuplicates_OrderedArrayWithDuplicates() {
        int[] nums = {1, 2, 2, 3, 4, 4, 4, 5};
        int expectedLength = 5;
        assertEquals(expectedLength, removeDuplicates.removeDuplicates(nums));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, java.util.Arrays.copyOf(nums, expectedLength));
    }


    @AfterAll
    static void tearDown() {
        removeDuplicates = null;
    }
}
