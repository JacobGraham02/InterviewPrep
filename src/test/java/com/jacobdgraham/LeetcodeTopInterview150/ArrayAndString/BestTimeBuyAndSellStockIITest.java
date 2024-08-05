package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BestTimeBuyAndSellStockIITest {
    
    private static BestTimeBuyAndSellStockII bestTimeBuyAndSellStockII;

    @BeforeAll
    static void setUp() {
        bestTimeBuyAndSellStockII = new BestTimeBuyAndSellStockII();
    }

    @AfterAll
    static void tearDown() {
        bestTimeBuyAndSellStockII = null;
    }

    @Test
    public void testExample1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expected = 7;
        int actual = bestTimeBuyAndSellStockII.maxProfit(prices);
        assertEquals(expected, actual, "Test Example 1 Failed");
    }

    @Test
    public void testExample2() {
        int[] prices = {1, 2, 3, 4, 5};
        int expected = 4;
        int actual = bestTimeBuyAndSellStockII.maxProfit(prices);
        assertEquals(expected, actual, "Test Example 2 Failed");
    }

    @Test
    public void testExample3() {
        int[] prices = {7, 6, 4, 3, 1};
        int expected = 0;
        int actual = bestTimeBuyAndSellStockII.maxProfit(prices);
        assertEquals(expected, actual, "Test Example 3 Failed");
    }

    @Test
    public void testSingleElement() {
        int[] prices = {5};
        int expected = 0;
        int actual = bestTimeBuyAndSellStockII.maxProfit(prices);
        assertEquals(expected, actual, "Test Single Element Failed");
    }

    @Test
    public void testEmptyArray() {
        int[] prices = {};
        int expected = 0;
        int actual = bestTimeBuyAndSellStockII.maxProfit(prices);
        assertEquals(expected, actual, "Test Empty Array Failed");
    }

    @Test
    public void testAllSamePrices() {
        int[] prices = {5, 5, 5, 5, 5};
        int expected = 0;
        int actual = bestTimeBuyAndSellStockII.maxProfit(prices);
        assertEquals(expected, actual, "Test All Same Prices Failed");
    }

    @Test
    public void testZigZagPrices() {
        int[] prices = {1, 2, 1, 2, 1, 2, 1};
        int expected = 3;
        int actual = bestTimeBuyAndSellStockII.maxProfit(prices);
        assertEquals(expected, actual, "Test ZigZag Prices Failed");
    }
}
