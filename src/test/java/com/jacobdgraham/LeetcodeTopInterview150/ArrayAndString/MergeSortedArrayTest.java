package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MergeSortedArrayTest {
    
    private static MergeSortedArray mergeSortedArray;

    @BeforeAll
    static void setUp() {
        mergeSortedArray = new MergeSortedArray();
    }

     @Test
    public void testMergeWithBothNonEmptyArrays() {
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int[] nums2 = {2, 4, 6};
        int m = 3, n = 3;
        mergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1, "Arrays should be merged and sorted");
    }

    @Test
    public void testMergeWithEmptyNums1() {
        int[] nums1 = {0, 0, 0};
        int[] nums2 = {1, 2, 3};
        int m = 0, n = 3;
        mergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1, 2, 3}, nums1, "nums1 should have the elements of nums2");
    }

    @Test
    public void testMergeWithEmptyNums2() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {};
        int m = 3, n = 0;
        mergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1, 2, 3}, nums1, "nums1 should be unchanged");
    }

    @Test
    public void testMergeWithOneElementEach() {
        int[] nums1 = {2, 0};
        int[] nums2 = {1};
        int m = 1, n = 1;
        mergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1, 2}, nums1, "nums1 should contain 1 and 2 sorted");
    }

    @Test
    public void testMergeWithDuplicateElements() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;
        mergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1, "nums1 should correctly merge duplicates");
    }

    @AfterAll
    static void tearDown() {
        mergeSortedArray = null;
    }
}
