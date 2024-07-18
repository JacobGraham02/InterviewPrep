package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MajorityElementTest {
    
    private static MajorityElement majorityElement;

    @BeforeAll
    static void setUp() {
        majorityElement = new MajorityElement();
    }

    
    @Test
    public void testMajorityElementInSmallArray() {
        int[] nums = {1, 1, 2};
        assertEquals(1, majorityElement.majorityElement(nums), "The majority element should be 1.");
    }

    @Test
    public void testMajorityElementInLargeArray() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        assertEquals(2, majorityElement.majorityElement(nums), "The majority element should be 2.");
    }

    @Test
    public void testMajorityElementAllSame() {
        int[] nums = {3, 3, 3, 3};
        assertEquals(3, majorityElement.majorityElement(nums), "The majority element should be 3.");
    }

    @Test
    public void testMajorityElementSingleElement() {
        int[] nums = {1};
        assertEquals(1, majorityElement.majorityElement(nums), "The majority element should be 1 in a single-element array.");
    }

    @Test
    public void testMajorityElementNoMajority() {
        int[] nums = {1, 2, 3, 4};
        // Since there is no clear majority in this case, your function would not handle this correctly based on the problem constraints.
        // However, if your function should return a default value or handle it somehow, it needs to be defined.
        // Assuming function should return 0 if no majority (even though problem guarantees one).
        assertEquals(0, majorityElement.majorityElement(nums), "There is no majority element, should return default value.");
    }

    @Test
    public void testMajorityElementEmptyArray() {
        int[] nums = {};
        assertEquals(0, majorityElement.majorityElement(nums), "Empty array should return 0 or a default value.");
    }

    @AfterAll
    static void tearDown() {
        majorityElement = null;
    }
}
