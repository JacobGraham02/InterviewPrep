package com.jacobdgraham.OneMonthPreparationKit.WeekOne;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Example
The minimum sum is and the maximum sum is

. The function prints

16 24

 */
public class MiniMaxSum {
    
    /**
     * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Example
The minimum sum is and the maximum sum is

. The function prints

16 24

     * @param arr a List of Integer objects
     */
    public final void miniMaxSum(List<Integer> arr) {
        if (arr == null || arr.size() != 5) {
            throw new IllegalArgumentException("The list must contain exactly 5 elements");
        }

        List<Integer> sortedList = arr.stream().sorted().collect(Collectors.toList());

        long minimumSum = sortedList.stream().limit(4).mapToLong(Integer::longValue).sum();

        long maximumSum = sortedList.stream().skip(1).mapToLong(Integer::longValue).sum();

        System.out.println(minimumSum + " " + maximumSum);
    }
}
