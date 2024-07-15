package com.jacobdgraham.OneMonthPreparationKit.WeekOne;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class PlusMinusTest {

    private final PlusMinus plusMinus = new PlusMinus();
    
    private String formatRatios(String[] ratios) {
        return String.join("\n", ratios) + "\n";
    }

    @Test
    void testAllPositives() {
        assertEquals("1.000000\n0.000000\n0.000000\n", 
                     formatRatios(plusMinus.ratiosOfNumberInstances(new ArrayList<>(Arrays.asList(1,2,3,4,5)))), 
                     "Output should show all positives");
    }

    @Test
    void testAllNegatives() {
        assertEquals("0.000000\n1.000000\n0.000000\n", 
                     formatRatios(plusMinus.ratiosOfNumberInstances(new ArrayList<>(Arrays.asList(-1, -2, -3, -4, -5)))), 
                     "Output should show all negatives");
    }

    @Test
    void testAllZeros() {
        assertEquals("0.000000\n0.000000\n1.000000\n", 
                     formatRatios(plusMinus.ratiosOfNumberInstances(new ArrayList<>(Arrays.asList(0, 0, 0, 0)))), 
                     "Output should show all zeros");
    }

    @Test
    void testMixedValues() {
        assertEquals("0.400000\n0.400000\n0.200000\n", 
                     formatRatios(plusMinus.ratiosOfNumberInstances(new ArrayList<>(Arrays.asList(3, -2, 0, 1, -1)))), 
                     "Output should show mixed values correctly");
    }

    @Test
    void testEmptyArray() {
        assertEquals("0.000000\n0.000000\n0.000000\n", 
                     formatRatios(plusMinus.ratiosOfNumberInstances(new ArrayList<>())), 
                     "Output should handle empty arrays gracefully");
    }
}