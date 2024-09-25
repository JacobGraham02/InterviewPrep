package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    
    /**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D, and M.
 *
 * <p><strong>Symbol&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Value</strong><br>
 * I&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1<br>
 * V&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;5<br>
 * X&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;10<br>
 * L&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;50<br>
 * C&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;100<br>
 * D&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;500<br>
 * M&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1000
 * </p>
 *
 * <p>
 * For example, 2 is written as II in Roman numerals, just two ones added together.
 * 12 is written as XII, which is simply X + II.
 * The number 27 is written as XXVII, which is XX + V + II.
 * </p>
 *
 * <p>
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written as IV.
 * Because the one is before the five we subtract it, making four.
 * The same principle applies to the number nine, which is written as IX.
 * There are six instances where subtraction is used:
 * </p>
 *
 * <ul>
 *   <li>I can be placed before V (5) and X (10) to make 4 and 9.</li>
 *   <li>X can be placed before L (50) and C (100) to make 40 and 90.</li>
 *   <li>C can be placed before D (500) and M (1000) to make 400 and 900.</li>
 * </ul>
 *
 * <p>Given a Roman numeral, convert it to an integer.</p>
 *
 * <h3>Example 1:</h3>
 *
 * <pre>
 * Input: s = "III"
 * Output: 3
 * Explanation: III = 3.
 * </pre>
 *
 * <h3>Example 2:</h3>
 *
 * <pre>
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V = 5, III = 3.
 * </pre>
 *
 * <h3>Example 3:</h3>
 *
 * <pre>
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90, and IV = 4.
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>1 &le; s.length &le; 15</li>
 *   <li><code>s</code> contains only the characters 'I', 'V', 'X', 'L', 'C', 'D', and 'M'.</li>
 *   <li>It is guaranteed that <code>s</code> is a valid Roman numeral in the range [1, 3999].</li>
 * </ul>
 * @see https://leetcode.com/problems/roman-to-integer/description/?envType=study-plan-v2&envId=top-interview-150
 * @param s A string that consists of only roman numerals 
 */
    public int romanToInt(String s) {
        final Map<Character, Integer> romanNumeralValueMap = new HashMap<Character, Integer>();
        int value = 0;
        romanNumeralValueMap.put('I', 1);
        romanNumeralValueMap.put('V', 5);
        romanNumeralValueMap.put('X', 10);
        romanNumeralValueMap.put('L', 50);
        romanNumeralValueMap.put('C', 100);
        romanNumeralValueMap.put('D', 500);
        romanNumeralValueMap.put('M', 1000);

        /*
         * If the highest value digit in the roman numeral has a lesser value digit to the left of it, then we must subtract the lesser value from the higher value
         * E.g., if we have the value XL, we get 40 (50 - 10); if we have XC, we get 90 (100 - 10)
         * In all other cases, we do not do this. 
         */
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && romanNumeralValueMap.get(s.charAt(i)) < romanNumeralValueMap.get(s.charAt(i + 1))) {
                value -= romanNumeralValueMap.get(s.charAt(i));
            } else {
                value += romanNumeralValueMap.get(s.charAt(i));
            }
        }
        return value;
    }
}
