package com.jacobdgraham.LeetcodeTopInterview150.Hashmap;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwoSumTest {
    
    private TwoSum twoSumInstance;

    @BeforeEach
    void setUp() {
        twoSumInstance = new TwoSum();
    }

    @AfterEach
    void tearDown() {
        twoSumInstance = null;
    }

    
    @Test
    void testExample1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, twoSumInstance.twoSum(nums, target));
    }

    @Test
    void testExample2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        assertArrayEquals(expected, twoSumInstance.twoSum(nums, target));
    }

    @Test
    void testExample3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        assertArrayEquals(expected, twoSumInstance.twoSum(nums, target));
    }

    @Test
    void testWithNegativeNumbers() {
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        int[] expected = {2, 4};
        assertArrayEquals(expected, twoSumInstance.twoSum(nums, target));
    }

    @Test
    void testWithLargeNumbers() {
        int[] nums = {1000000, 500000, -1500000};
        int target = -1000000;
        int[] expected = {1, 2};
        assertArrayEquals(expected, twoSumInstance.twoSum(nums, target));
    }
}
