package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RotateArrayTest {
    
    private static RotateArray rotateArray;

    @BeforeAll
    static void setUp() {
        rotateArray = new RotateArray();
    }

     @Test
    public void testRotateNormal() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotate(nums, 3);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums, "Array should be rotated by 3 positions.");
    }

    @Test
    public void testRotateByOne() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotate(nums, 1);
        assertArrayEquals(new int[]{7, 1, 2, 3, 4, 5, 6}, nums, "Array should be rotated by 1 position.");
    }

    @Test
    public void testRotateByArrayLength() {
        int[] nums = {1, 2, 3, 4, 5};
        rotateArray.rotate(nums, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, nums, "Rotating by array length should not change array.");
    }

    @Test
    public void testRotateByMoreThanArrayLength() {
        int[] nums = {1, 2, 3, 4, 5};
        rotateArray.rotate(nums, 8); // Equivalent to rotating by 3
        assertArrayEquals(new int[]{3, 4, 5, 1, 2}, nums, "Rotating by more than array length should wrap correctly.");
    }

    @Test
    public void testRotateEmptyArray() {
        int[] nums = {};
        rotateArray.rotate(nums, 3);
        assertArrayEquals(new int[]{}, nums, "Rotating an empty array should leave it unchanged.");
    }

    @AfterAll
    static void tearDown() {
        rotateArray = null;
    }
}
