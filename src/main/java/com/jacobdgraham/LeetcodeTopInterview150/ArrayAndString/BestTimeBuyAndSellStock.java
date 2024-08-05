package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

 */
public class BestTimeBuyAndSellStock {
    
    /**
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

     * @param prices an array of integers, where each integer represents a stock price 
     * @return integer for maximum profit from a transaction
     * @see https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&envId=top-interview-150
     */
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int bestStockPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            /*  
            * If we find a stock price that is smaller than our current best stock price, we assign that smaller value to the 
            * best stock price variable
            */
            if (bestStockPrice > prices[i]) {
                bestStockPrice = prices[i];
            }
            /*
             * Else, if the current stock price in the list is larger than the current best stock price, we determine 
             * if the profit that you get from subtracting the best stock price from the current stock price is larger than the current profit.
             * If it is, we assign the maximum profit to be that value
             */
            else if (profit < (prices[i] - bestStockPrice)) {
                profit = (prices[i] - bestStockPrice);
            }
        }

        return profit;
    }
}
