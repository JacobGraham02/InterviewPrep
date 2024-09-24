package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductOfArrayExceptSelfTest {
    
    ProductOfArrayExceptSelf productOfArrayExceptSelf;

    @BeforeEach
    void setUp() {
        productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
    }

    @Test
    void testExample1() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, productOfArrayExceptSelf.productExceptSelf(nums));
    }

    @Test
    void testExample2() {
        int[] nums = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};
        assertArrayEquals(expected, productOfArrayExceptSelf.productExceptSelf(nums));
    }

    @Test
    void testSingleElement() {
        int[] nums = {10};
        int[] expected = {1};
        assertArrayEquals(expected, productOfArrayExceptSelf.productExceptSelf(nums));
    }

    @Test
    void testAllOnes() {
        int[] nums = {1, 1, 1, 1};
        int[] expected = {1, 1, 1, 1};
        assertArrayEquals(expected, productOfArrayExceptSelf.productExceptSelf(nums));
    }

    @Test
    void testWithMultipleZeros() {
        int[] nums = {0, 0, 2, 3};
        int[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, productOfArrayExceptSelf.productExceptSelf(nums));
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        int[] expected = {};
        assertArrayEquals(expected, productOfArrayExceptSelf.productExceptSelf(nums));
    }

    @AfterEach
    void tearDown() {
        productOfArrayExceptSelf = null;
    }
}
