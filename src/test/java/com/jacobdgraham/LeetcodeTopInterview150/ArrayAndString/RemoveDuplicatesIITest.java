package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesIITest {
    
    private static RemoveDuplicatesII removeDuplicatesII;

    @BeforeAll
    static void setUp() {
        removeDuplicatesII = new RemoveDuplicatesII();
    }

    @Test
    public void testAllUnique() {
        int[] nums = {1, 2, 3, 4, 5};
        int expectedLength = 5;
        assertEquals(expectedLength, removeDuplicatesII.removeDuplicates(nums));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, java.util.Arrays.copyOf(nums, expectedLength));
    }

    @Test
    public void testSomeDuplicates() {
        int[] nums = {1, 1, 2, 2, 3, 3, 3, 4};
        int expectedLength = 7;
        assertEquals(expectedLength, removeDuplicatesII.removeDuplicates(nums));
        assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3, 4}, java.util.Arrays.copyOf(nums, expectedLength));
    }

    @Test
    public void testMoreThanTwoDuplicates() {
        int[] nums = {1, 1, 1, 2, 2, 2, 2, 3};
        int expectedLength = 5;
        assertEquals(expectedLength, removeDuplicatesII.removeDuplicates(nums));
        assertArrayEquals(new int[]{1, 1, 2, 2, 3}, java.util.Arrays.copyOf(nums, expectedLength));
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int expectedLength = 0;
        assertEquals(expectedLength, removeDuplicatesII.removeDuplicates(nums));
        assertArrayEquals(new int[]{}, java.util.Arrays.copyOf(nums, expectedLength));
    }

    @Test
    public void testSingleElement() {
        int[] nums = {1};
        int expectedLength = 1;
        assertEquals(expectedLength, removeDuplicatesII.removeDuplicates(nums));
        assertArrayEquals(new int[]{1}, java.util.Arrays.copyOf(nums, expectedLength));
    }

    @Test
    public void testOnlyDuplicates() {
        int[] nums = {2, 2, 2, 2, 2};
        int expectedLength = 2;
        assertEquals(expectedLength, removeDuplicatesII.removeDuplicates(nums));
        assertArrayEquals(new int[]{2, 2}, java.util.Arrays.copyOf(nums, expectedLength));
    }

    @AfterAll
    static void tearDown() {
        removeDuplicatesII = null;
    }
}
