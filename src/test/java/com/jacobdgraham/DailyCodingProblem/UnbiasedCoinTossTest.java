package com.jacobdgraham.DailyCodingProblem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UnbiasedCoinTossTest {

    UnbiasedCoinToss unbiasedCoinToss;

    @BeforeEach
    void setUp() {
        unbiasedCoinToss = new UnbiasedCoinToss();
    }

    @AfterEach
    void tearDown() {
        unbiasedCoinToss = null;
    }

    @Test
    void testTossUnbiasedReturnsOnlyZeroOrOne() {
        // Perform a single toss and check if it returns only 0 or 1
        int result = unbiasedCoinToss.tossUnbiased();
        assertTrue(result == 0 || result == 1, "Result should be either 0 or 1");
    }

    @Test
    void testTossUnbiasedIsApproximatelyFair() {
        // Perform a large number of tosses and check if the results are approximately 50-50
        int trials = 1000000; // Large number to approximate fairness
        int zeroCount = 0;
        int oneCount = 0;

        for (int i = 0; i < trials; i++) {
            int result = unbiasedCoinToss.tossUnbiased();
            if (result == 0) {
                zeroCount++;
            } else if (result == 1) {
                oneCount++;
            }
        }

        // Calculate the ratio of 0s to 1s
        double ratio = (double) zeroCount / oneCount;
        double expectedRatio = 1.0;

        // Allow a small margin of error for fairness due to randomness
        assertTrue(Math.abs(ratio - expectedRatio) < 0.05,
                "The ratio of 0s to 1s should be close to 1.0 for fairness");
    }

    @Test
    void testLargeNumberOfTossesForDistribution() {
        // Perform multiple tosses and check that both 0 and 1 appear
        int trials = 1000;
        boolean foundZero = false;
        boolean foundOne = false;

        for (int i = 0; i < trials; i++) {
            int result = unbiasedCoinToss.tossUnbiased();
            if (result == 0) foundZero = true;
            if (result == 1) foundOne = true;

            if (foundZero && foundOne) break;
        }

        // Check that we observed both 0 and 1 within the specified number of trials
        assertTrue(foundZero, "Unbiased toss should eventually return 0");
        assertTrue(foundOne, "Unbiased toss should eventually return 1");
    }
}
