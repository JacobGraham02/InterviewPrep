package com.jacobdgraham.OneMonthPreparationKit.WeekOne;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class MiniMaxSumTest {

    private static MiniMaxSum miniMaxSum;

    @BeforeAll
    public static void setUp() {
        miniMaxSum = new MiniMaxSum();
    }

    @Test
    public void testMiniMaxSumListTooShort() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4); // Only 4 elements

        // This should throw an IllegalArgumentException
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            miniMaxSum.miniMaxSum(input);
        });

        assertEquals("The list must contain exactly 5 elements", exception.getMessage(), "Should throw an exception with the correct message");
    }

    @Test
    public void testMiniMaxSumListTooLong() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6); // 6 elements

        // This should throw an IllegalArgumentException
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            miniMaxSum.miniMaxSum(input);
        });

        assertEquals("The list must contain exactly 5 elements", exception.getMessage(), "Should throw an exception with the correct message");
    }

    @Test
    public void testMiniMaxSumNullList() {
        // This should throw an IllegalArgumentException for null input
        assertThrows(IllegalArgumentException.class, () -> {
            miniMaxSum.miniMaxSum(null);
        }, "Should throw an IllegalArgumentException for null input");
    }

    @Test
    public void testMiniMaxSumValidInputDoesNotThrowException() {
        List<Integer> input = Arrays.asList(7, 9, 5, 1, 3);

        // This should not throw any exception
        assertDoesNotThrow(() -> miniMaxSum.miniMaxSum(input), "Valid input should not throw any exceptions");
    }
}
