package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithMostWaterTest {

    ContainerWithMostWater containerWithMostWater;

    @BeforeEach
    void setUp() {
        containerWithMostWater = new ContainerWithMostWater();
    }

    @AfterEach
    void tearDown() {
        containerWithMostWater = null;
    }

    @Test
    void testExample1() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;
        assertEquals(expected, containerWithMostWater.maxArea(height));
    }

    @Test
    void testExample2() {
        int[] height = {1, 1};
        int expected = 1;
        assertEquals(expected, containerWithMostWater.maxArea(height));
    }

    @Test
    void testAllEqualHeights() {
        int[] height = {5, 5, 5, 5, 5};
        int expected = 20; // Width between first and last elements (4) * height (5)
        assertEquals(expected, containerWithMostWater.maxArea(height));
    }

    @Test
    void testDecreasingHeights() {
        int[] height = {5, 4, 3, 2, 1};
        int expected = 6; // Width (2) * min height (3) between indices 1 and 3
        assertEquals(expected, containerWithMostWater.maxArea(height));
    }

    @Test
    void testSinglePeak() {
        int[] height = {1, 8, 1};
        int expected = 2; // Width (1) * min height (2) between indices 0 and 2
        assertEquals(expected, containerWithMostWater.maxArea(height));
    }
}
