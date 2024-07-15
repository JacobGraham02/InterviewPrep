package com.jacobdgraham.OneMonthPreparationKit.WeekOne;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Given a time in

-hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example

Return '12:01:00'.

Return '00:01:00'.
 */
public class TimeConversion {
    
    /**
     * Given a time in

-hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example

Return '12:01:00'.

Return '00:01:00'.
     * @param time the current time in a 12 hour format
     * @return a 12 hour time converted to 24 hour time
     */
    public final String timeConversion(final String time) {
        Locale locale = Locale.US;
        final SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa", locale);
        final SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss", locale);
        try {
            Date date = parseFormat.parse(time); 
            return displayFormat.format(date); 
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid time format: " + time);
        }
    }
}
