package com.jacobdgraham.DailyCodingProblem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSumOfContiguousSubarrayTest {

    private MaximumSumOfContiguousSubarray maximumSumOfContiguousSubarray;

    @BeforeEach
    void setUp() {
        maximumSumOfContiguousSubarray = new MaximumSumOfContiguousSubarray();
    }

    @AfterEach
    void tearDown() {
        maximumSumOfContiguousSubarray = null;
    }


    @Test
    void testPositiveAndNegativeNumbers() {
        // Test case: Mix of positive and negative numbers
        int[] input = {34, -50, 42, 14, -5, 86};
        int expected = 137;
        assertEquals(expected, maximumSumOfContiguousSubarray.maxSubarraySum(input));
    }

    @Test
    void testAllNegativeNumbers() {
        // Test case: All negative numbers
        int[] input = {-5, -1, -8, -9};
        int expected = 0; // Since we can choose not to take any numbers, result should be 0
        assertEquals(expected, maximumSumOfContiguousSubarray.maxSubarraySum(input));
    }

    @Test
    void testAllPositiveNumbers() {
        // Test case: All positive numbers
        int[] input = {1, 2, 3, 4, 5};
        int expected = 15; // Whole array should be taken
        assertEquals(expected, maximumSumOfContiguousSubarray.maxSubarraySum(input));
    }

    @Test
    void testSingleElement() {
        // Test case: Single element (positive)
        int[] input = {42};
        int expected = 42; // Only one element to take
        assertEquals(expected, maximumSumOfContiguousSubarray.maxSubarraySum(input));

        // Test case: Single element (negative)
        int[] inputNegative = {-42};
        int expectedNegative = 0; // Since the element is negative, result should be 0
        assertEquals(expectedNegative, maximumSumOfContiguousSubarray.maxSubarraySum(inputNegative));
    }

    @Test
    void testEmptyArray() {
        // Test case: Empty array
        int[] input = {};
        int expected = 0; // Empty array has no elements, so sum should be 0
        assertEquals(expected, maximumSumOfContiguousSubarray.maxSubarraySum(input));
    }

    @Test
    void testAllZeros() {
        // Test case: Array of all zeros
        int[] input = {0, 0, 0, 0};
        int expected = 0; // Sum of zeros should be 0
        assertEquals(expected, maximumSumOfContiguousSubarray.maxSubarraySum(input));
    }

    @Test
    void testAlternatingPositivesAndNegatives() {
        // Test case: Alternating positives and negatives
        int[] input = {2, -1, 3, -2, 4, -3, 5};
        int expected = 8; // Maximum subarray sum is 8 (subarray [2, -1, 3, -2, 4, -3, 5])
        assertEquals(expected, maximumSumOfContiguousSubarray.maxSubarraySum(input));
    }
}