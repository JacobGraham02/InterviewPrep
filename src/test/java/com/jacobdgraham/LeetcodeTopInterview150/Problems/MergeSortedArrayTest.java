package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    MergeSortedArray mergeSortedArray;

    @BeforeEach
    void setUp() {
        mergeSortedArray = new MergeSortedArray();
    }

    @AfterEach
    void tearDown() {
        mergeSortedArray = null;
    }

    @Test
    void testExample1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        int[] expected = {1, 2, 2, 3, 5, 6};

        mergeSortedArray.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1);
    }

    @Test
    void testExample2() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        int[] expected = {1};

        mergeSortedArray.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1);
    }

    @Test
    void testExample3() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[] expected = {1};

        mergeSortedArray.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1);
    }

    @Test
    void testBothArraysEmpty() {
        int[] nums1 = {};
        int m = 0;
        int[] nums2 = {};
        int n = 0;
        int[] expected = {};

        mergeSortedArray.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1);
    }

    @Test
    void testNoOverlap() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {4, 5, 6};
        int n = 3;
        int[] expected = {1, 2, 3, 4, 5, 6};

        mergeSortedArray.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1);
    }

    @Test
    void testAllNums2Smaller() {
        int[] nums1 = {5, 6, 7, 0, 0, 0};
        int m = 3;
        int[] nums2 = {1, 2, 3};
        int n = 3;
        int[] expected = {1, 2, 3, 5, 6, 7};

        mergeSortedArray.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1);
    }

    @Test
    void testAllNums2Larger() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {4, 5, 6};
        int n = 3;
        int[] expected = {1, 2, 3, 4, 5, 6};

        mergeSortedArray.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1);
    }

    @Test
    void testMixedOverlap() {
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 4, 6};
        int n = 3;
        int[] expected = {1, 2, 3, 4, 5, 6};

        mergeSortedArray.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1);
    }
}