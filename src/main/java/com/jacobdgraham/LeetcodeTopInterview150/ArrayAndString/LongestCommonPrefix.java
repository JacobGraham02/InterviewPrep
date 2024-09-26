package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

import java.util.Arrays;

public class LongestCommonPrefix {
    
    /**
     * Write a function to find the longest common prefix string amongst an array of strings.
     * <p>
     * If there is no common prefix, return an empty string <code>""</code>.
     * </p>
     * 
     * <h3>Example 1:</h3>
     * <pre>
     * Input: strs = ["flower","flow","flight"]
     * Output: "fl"
     * </pre>
     * 
     * <h3>Example 2:</h3>
     * <pre>
     * Input: strs = ["dog","racecar","car"]
     * Output: ""
     * Explanation: There is no common prefix among the input strings.
     * </pre>
     * 
     * <h3>Constraints:</h3>
     * <ul>
     *   <li><code>1 &lt;= strs.length &lt;= 200</code></li>
     *   <li><code>0 &lt;= strs[i].length &lt;= 200</code></li>
     *   <li><code>strs[i]</code> consists of only lowercase English letters.</li>
     * </ul>
     * @param strings An array of strings, where each string contains only lowercase English letters (a-z)
     * @return The most common String prefix amongst each of the strings in the array. If there are none, an empty string is returned. 
     * @see https://leetcode.com/problems/longest-common-prefix/description/?envType=study-plan-v2&envId=top-interview-150
     */
    public String longestCommonPrefix(String[] strings) {
        if (strings.length == 0) {
            return "";
        }
        Arrays.sort(strings);
        final String firstArrayString = strings[0];
        final String lastArrayString = strings[strings.length - 1];
        int prefixCharIndex = 0;

        while (prefixCharIndex < firstArrayString.length() && prefixCharIndex < lastArrayString.length()) {
            if (firstArrayString.charAt(prefixCharIndex) == lastArrayString.charAt(prefixCharIndex)) {
                prefixCharIndex++;
            } else {
                break;
            }
        }

        return firstArrayString.substring(0, prefixCharIndex);
    }
}
