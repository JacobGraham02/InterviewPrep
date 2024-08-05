package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

import java.util.Arrays;

public class HIndex {
    /**
     * This class provides a method to calculate the H-Index of a researcher given an array of their citations.
     *
     * <p>The H-Index is defined as the maximum value h such that the researcher has at least h papers with h or more citations.
     * This implementation uses binary search for an efficient solution.
     *
     * <p>Given the array [3, 0, 6, 1, 5]:
     * <ol>
     *   <li>Initial Array:
     *     <pre>
     *     [3, 0, 6, 1, 5]
     *     </pre>
     *   </li>
     *   <li>Sorted Array:
     *     <pre>
     *     [0, 1, 3, 5, 6]
     *     </pre>
     *   </li>
     *   <li>Binary Search Steps:
     *     <ul>
     *       <li>Iteration 1:
     *         <pre>
     *         left = 0, right = 4
     *         mid = 0 + (4 - 0) / 2 = 2
     *         citations[2] = 3, n - mid = 5 - 2 = 3
     *         citations[2] (3) >= 3, move right to mid - 1 = 1
     *         </pre>
     *       </li>
     *       <li>Iteration 2:
     *         <pre>
     *         left = 0, right = 1
     *         mid = 0 + (1 - 0) / 2 = 0
     *         citations[0] = 0, n - mid = 5 - 0 = 5
     *         citations[0] (0) < 5, move left to mid + 1 = 1
     *         </pre>
     *       </li>
     *       <li>Iteration 3:
     *         <pre>
     *         left = 1, right = 1
     *         mid = 1 + (1 - 1) / 2 = 1
     *         citations[1] = 1, n - mid = 5 - 1 = 4
     *         citations[1] (1) < 4, move left to mid + 1 = 2
     *         </pre>
     *       </li>
     *     </ul>
     *   </li>
     *   <li>Termination:
     *     <pre>
     *     left = 2, right = 1
     *     </pre>
     *   </li>
     *   <li>Calculate H-Index:
     *     <pre>
     *     H-Index = n - left = 5 - 2 = 3
     *     </pre>
     *   </li>
     * </ol>
     * 
     * @param citations an array of integers
     * @return the h index of the array of integers. This is defined as the maximum value of h such that the given researcher has published at least h
     * papers that have each been cited at least h times
     */
    public int hIndex(int[] citations) {
        Arrays.sort(citations); // Step 1: Sort the array
        int n = citations.length;
        int left = 0, right = n - 1;

        while (left <= right) { // Step 2: Binary Search
            int mid = left + (right - left) / 2;
            if (citations[mid] >= n - mid) {
                right = mid - 1; // Move the right pointer to mid - 1
            } else {
                left = mid + 1; // Move the left pointer to mid + 1
            }
        }

        return n - left; // Step 3: Calculate H-Index
    }
}
