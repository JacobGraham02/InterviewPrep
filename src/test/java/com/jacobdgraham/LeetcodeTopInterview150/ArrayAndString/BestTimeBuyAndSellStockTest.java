package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BestTimeBuyAndSellStockTest {
    
    private static BestTimeBuyAndSellStock bestTimeBuyAndSellStock;

    @BeforeAll
    static void setUp() {
        bestTimeBuyAndSellStock = new BestTimeBuyAndSellStock();
    }

    @Test
    public void testIncreasingPrices() {
        int[] prices = {1, 2, 3, 4, 5};
        assertEquals(4, bestTimeBuyAndSellStock.maxProfit(prices), "Profit should be maximum with increasing prices.");
    }

    @Test
    public void testDecreasingPrices() {
        int[] prices = {5, 4, 3, 2, 1};
        assertEquals(0, bestTimeBuyAndSellStock.maxProfit(prices), "Profit should be zero with decreasing prices.");
    }

    @Test
    public void testMixedPrices() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(5, bestTimeBuyAndSellStock.maxProfit(prices), "Profit should be the maximum difference between min and max following min.");
    }

    @Test
    public void testSingleDay() {
        int[] prices = {5};
        assertEquals(0, bestTimeBuyAndSellStock.maxProfit(prices), "Profit should be zero if there's only one day.");
    }

    @Test
    public void testEmptyArray() {
        int[] prices = {};
        assertEquals(0, bestTimeBuyAndSellStock.maxProfit(prices), "Profit should be zero if there are no prices.");
    }

    @Test
    public void testNoProfitPossible() {
        int[] prices = {3, 3, 3, 3, 3};
        assertEquals(0, bestTimeBuyAndSellStock.maxProfit(prices), "Profit should be zero if all prices are the same.");
    }


    @AfterAll
    static void tearDown() {
        bestTimeBuyAndSellStock = null;
    }
}
