package com.jacobdgraham.LeetcodeTopInterview150.Hashmap;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HappyNumberTest {
    
    private HappyNumber happyNumber;

    @BeforeEach
    void setUp() {
        happyNumber = new HappyNumber();
    }

    @AfterEach
    void tearDown() {
        happyNumber = null;
    }

        @Test
    void testHappyNumber19() {
        assertTrue(happyNumber.isHappy(19));
    }

    @Test
    void testUnhappyNumber2() {
        assertFalse(happyNumber.isHappy(2));
    }

    @Test
    void testHappyNumber1() {
        assertTrue(happyNumber.isHappy(1));
    }

    @Test
    void testHappyNumber7() {
        assertTrue(happyNumber.isHappy(7));
    }

    @Test
    void testUnhappyNumber20() {
        assertFalse(happyNumber.isHappy(20));
    }

    @Test
    void testLargeHappyNumber() {
        assertTrue(happyNumber.isHappy(100000000));
    }

    @Test
    void testLargeUnhappyNumber() {
        assertFalse(happyNumber.isHappy(987654321));
    }
}
