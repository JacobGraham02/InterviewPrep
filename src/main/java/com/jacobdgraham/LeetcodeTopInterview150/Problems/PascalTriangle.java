package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    /**
     * LeetCode 118. Pascal's Triangle
     *
     * <p>Given an integer numRows, return the first numRows of Pascal's triangle.</p>
     *
     * <p>In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:</p>
     *
     * <pre>
     * Example 1:
     * Input: numRows = 5
     * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
     *
     * Example 2:
     * Input: numRows = 1
     * Output: [[1]]
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>1 <= numRows <= 30</li>
     * </ul>
     * @param numRows the number of rows in Pascal's Triangle
     * @return a list of lists representing Pascal's Triangle
     * @see <a href="https://leetcode.com/problems/pascals-triangle/" title="A link to the leetcode problem 'Pascal's Triangle'">Leetcode</a>
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        /*
        Each row of the triangle starts with 1. Because each row starts with 1, our inner loop which
        counts the intermediate elements in each individual row must start at 1, and will go until
        we have reached the value of i (the current row).
         */
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            /*
            Calculate the values for intermediate elements
             */
            for (int j = 1; j < i; j++) {
                row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }

            /*
            Add the element 1 to the end of each row
             */
            if (i > 0) {
                row.add(1);
            }

            result.add(row);
        }

        return result;
    }
}
