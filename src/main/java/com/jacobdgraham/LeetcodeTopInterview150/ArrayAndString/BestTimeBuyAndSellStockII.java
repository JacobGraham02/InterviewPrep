package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

public class BestTimeBuyAndSellStockII {
    
    /**
     * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
     *
     * <p>On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
     * However, you can buy it then immediately sell it on the same day.</p>
     *
     * <p>Find and return the maximum profit you can achieve.</p>
     *
     * <p><b>Example 1:</b></p>
     * <pre>
     * Input: prices = [7,1,5,3,6,4]
     * Output: 7
     * Explanation: 
     * Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
     * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
     * Total profit is 4 + 3 = 7.
     * </pre>
     *
     * <p><b>Example 2:</b></p>
     * <pre>
     * Input: prices = [1,2,3,4,5]
     * Output: 4
     * Explanation: 
     * Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
     * Total profit is 4.
     * </pre>
     *
     * <p><b>Example 3:</b></p>
     * <pre>
     * Input: prices = [7,6,4,3,1]
     * Output: 0
     * Explanation: 
     * There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.
     * </pre>
     * 
     * This algorithm has a time complexity of O(N) because it iterates over our array of integers only once
     * This algorithm has a space complexity of O(1) because it no additional space other than the maxProfit variable is used in the algorithm
     *
     * @param prices An array of integers representing the stock prices on each day.
     * @return The maximum profit you can achieve.
     */
    public int maxProfit(int[] prices) {
        /*
         * We have to keep an accumulative sum of the maximum profit, so assign as an integer. 
         */
        int maxProfit = 0;
        /*
         * We will start at the first location in the array, and for each iteration over the array, search the location that is 
         * adjacent (to the right of) the buy price. This will determine if the price immediately after tells us we can sell.
         * If the price of the stock that we bought is less than the price of the stock after we bought it, we subtract the cost
         * of buying the stock from the sell amount, and add to the accumulative sum variable. 
         */
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i+1]) {
                maxProfit += (prices[i+1] - prices[i]);
            }
        }
        return maxProfit;
    }
}