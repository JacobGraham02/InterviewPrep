package com.jacobdgraham.OneMonthPreparationKit.WeekOne;

import java.util.List;

/**
 * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with

places after the decimal.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to
are acceptable.
 */
public final class PlusMinus {
    
    /**
     * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with

places after the decimal.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to
are acceptable.
     * @param arr a List of data where each item has an Integer data type
     */
    public final void ratiosOfNumberInstances(List<Integer> arr) {
        float instancesOfPositiveNumber = 0;
        float instancesOfNegativeNumber = 0;
        float instancesOfZero = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) {
                instancesOfZero++;
            }
            if (arr.get(i) > 0) {
                instancesOfPositiveNumber++;
            }
            if (arr.get(i) < 0) {
                instancesOfNegativeNumber++;
            }
        }

        if (arr.size() == 0) {
            return "0.000000\n0.000000\n0.000000\n"; // Handle division by zero case.
        }
        
        System.out.println(String.format("%.6f", instancesOfPositiveNumber / arr.size()));
        System.out.println(String.format("%.6f", instancesOfNegativeNumber / arr.size()));
        System.out.println(String.format("%.6f", instancesOfZero / arr.size()));
    }
}