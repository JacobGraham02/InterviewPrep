package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JumpGameTest {
    
    private static JumpGame jumpGame;

    @BeforeAll
    static void setUp() {
        jumpGame = new JumpGame();
    }

    @Test
    public void testCanJumpExample1() {
        int[] nums = {2, 3, 1, 1, 4};
        assertTrue(jumpGame.canJump(nums));
    }

    @Test
    public void testCanJumpExample2() {
        int[] nums = {3, 2, 1, 0, 4};
        assertFalse(jumpGame.canJump(nums));
    }

    @Test
    public void testSingleElement() {
        int[] nums = {0};
        assertTrue(jumpGame.canJump(nums));
    }

    @Test
    public void testAllZeros() {
        int[] nums = {0, 0, 0, 0};
        assertFalse(jumpGame.canJump(nums));
    }

    @Test
    public void testMinimumJump() {
        int[] nums = {1, 1, 1, 1};
        assertTrue(jumpGame.canJump(nums));
    }

    @Test
    public void testLongArray() {
        int[] nums = new int[10000];
        for (int i = 0; i < 9999; i++) {
            nums[i] = 1;
        }
        nums[9999] = 0;
        assertTrue(jumpGame.canJump(nums));
    }

    @Test
    public void testImpossibleJump() {
        int[] nums = {1, 2, 3, 4, 0, 0, 0, 0, 0};
        assertFalse(jumpGame.canJump(nums));
    }


    @AfterAll
    static void tearDown() {
        jumpGame = null;
    }
}