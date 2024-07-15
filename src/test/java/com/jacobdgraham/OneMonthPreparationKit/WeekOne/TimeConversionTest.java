package com.jacobdgraham.OneMonthPreparationKit.WeekOne;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TimeConversionTest {

    static TimeConversion timeConversionInstance;

    @BeforeAll
    public static void setUp() {
        timeConversionInstance = new TimeConversion();
    }
    
    @Test
    public void testMorningTime() {
        assertEquals("19:05:45", timeConversionInstance.timeConversion("07:05:45PM"));
    }

    @Test
    public void testNoon() {
        assertEquals("12:00:00", timeConversionInstance.timeConversion("12:00:00PM"));
    }

    @Test
    public void testAfternoon() {
        assertEquals("14:00:00", timeConversionInstance.timeConversion("02:00:00PM"));
    }

    @Test
    public void testMidnight() {
        assertEquals("00:00:00", timeConversionInstance.timeConversion("12:00:00AM"));
    }

    @Test
    public void testEarlyMorning() {
        assertEquals("01:00:00", timeConversionInstance.timeConversion("01:00:00AM"));
    }

    @Test
    public void testInvalidFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            timeConversionInstance.timeConversion("invalid_time");
        });
        assertTrue(exception.getMessage().contains("Invalid time format"));
    }
}
