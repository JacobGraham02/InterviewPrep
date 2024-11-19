package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    private SearchInsertPosition searchInsertPosition;

    @BeforeEach
    void setUp() {
        searchInsertPosition = new SearchInsertPosition();
    }

    @AfterEach
    void tearDown() {
        searchInsertPosition = null;
    }

    @Test
    void testTargetExistsInMiddle() {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int expected = 2;
        assertEquals(expected, searchInsertPosition.searchInsert(nums, target),
                "The target exists in the middle of the array.");
    }

    @Test
    void testTargetShouldBeInsertedAtBeginning() {
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        int expected = 0;
        assertEquals(expected, searchInsertPosition.searchInsert(nums, target),
                "The target should be inserted at the beginning.");
    }

    @Test
    void testTargetShouldBeInsertedInMiddle() {
        int[] nums = {1, 3, 5, 6};
        int target = 4;
        int expected = 2;
        assertEquals(expected, searchInsertPosition.searchInsert(nums, target),
                "The target should be inserted in the middle.");
    }

    @Test
    void testTargetShouldBeInsertedAtEnd() {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int expected = 4;
        assertEquals(expected, searchInsertPosition.searchInsert(nums, target),
                "The target should be inserted at the end.");
    }

    @Test
    void testSingleElementArray_TargetExists() {
        int[] nums = {5};
        int target = 5;
        int expected = 0;
        assertEquals(expected, searchInsertPosition.searchInsert(nums, target),
                "The target exists as the single element in the array.");
    }

    @Test
    void testSingleElementArray_TargetShouldBeInsertedBefore() {
        int[] nums = {5};
        int target = 3;
        int expected = 0;
        assertEquals(expected, searchInsertPosition.searchInsert(nums, target),
                "The target should be inserted before the single element in the array.");
    }

    @Test
    void testSingleElementArray_TargetShouldBeInsertedAfter() {
        int[] nums = {5};
        int target = 8;
        int expected = 1;
        assertEquals(expected, searchInsertPosition.searchInsert(nums, target),
                "The target should be inserted after the single element in the array.");
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        int target = 1;
        int expected = 0;
        assertEquals(expected, searchInsertPosition.searchInsert(nums, target),
                "The target should be inserted as the first element in an empty array.");
    }

    @Test
    void testLargeArray() {
        int[] nums = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 14;
        int expected = 7;
        assertEquals(expected, searchInsertPosition.searchInsert(nums, target),
                "The target should be inserted correctly in a large array.");
    }

    @Test
    void testTargetExistsAtEnd() {
        int[] nums = {1, 3, 5, 7, 9, 11};
        int target = 11;
        int expected = 5;
        assertEquals(expected, searchInsertPosition.searchInsert(nums, target),
                "The target exists at the end of the array.");
    }

    @Test
    void testTargetExistsAtStart() {
        int[] nums = {1, 3, 5, 7, 9, 11};
        int target = 1;
        int expected = 0;
        assertEquals(expected, searchInsertPosition.searchInsert(nums, target),
                "The target exists at the start of the array.");
    }
}