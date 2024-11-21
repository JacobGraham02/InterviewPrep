package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PlusOneTest {

    PlusOne plusOne;

    @BeforeEach
    void setUp() {
        plusOne = new PlusOne();
    }

    @AfterEach
    void tearDown() {
        plusOne = null;
    }

    @Test
    void testSingleDigitNoCarry() {
        int[] input = {1};
        int[] expected = {2};
        assertArrayEquals(expected, plusOne.plusOne(input), "Adding 1 to [1] should return [2].");
    }

    @Test
    void testSingleDigitWithCarry() {
        int[] input = {9};
        int[] expected = {1, 0};
        assertArrayEquals(expected, plusOne.plusOne(input), "Adding 1 to [9] should return [1, 0].");
    }

    @Test
    void testMultipleDigitsNoCarry() {
        int[] input = {1, 2, 3};
        int[] expected = {1, 2, 4};
        assertArrayEquals(expected, plusOne.plusOne(input), "Adding 1 to [1, 2, 3] should return [1, 2, 4].");
    }

    @Test
    void testMultipleDigitsWithCarry() {
        int[] input = {4, 3, 2, 1};
        int[] expected = {4, 3, 2, 2};
        assertArrayEquals(expected, plusOne.plusOne(input), "Adding 1 to [4, 3, 2, 1] should return [4, 3, 2, 2].");
    }

    @Test
    void testAllNines() {
        int[] input = {9, 9, 9};
        int[] expected = {1, 0, 0, 0};
        assertArrayEquals(expected, plusOne.plusOne(input), "Adding 1 to [9, 9, 9] should return [1, 0, 0, 0].");
    }

    @Test
    void testTrailingNines() {
        int[] input = {1, 9, 9};
        int[] expected = {2, 0, 0};
        assertArrayEquals(expected, plusOne.plusOne(input), "Adding 1 to [1, 9, 9] should return [2, 0, 0].");
    }
}