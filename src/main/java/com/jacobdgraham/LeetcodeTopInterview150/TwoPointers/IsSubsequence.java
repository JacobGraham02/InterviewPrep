package com.jacobdgraham.LeetcodeTopInterview150.TwoPointers;

public class IsSubsequence {
    /**
     * Given two strings <code>s</code> and <code>t</code>, return <code>true</code> if <code>s</code> 
     * is a subsequence of <code>t</code>, or <code>false</code> otherwise.
     * 
     * <p>A subsequence of a string is a new string that is formed from the original string by deleting some 
     * (can be none) of the characters without disturbing the relative positions of the remaining characters. 
     * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).</p>
     * 
     * <h3>Example 1:</h3>
     * <pre>
     * Input: s = "abc", t = "ahbgdc"
     * Output: true
     * </pre>
     * 
     * <h3>Example 2:</h3>
     * <pre>
     * Input: s = "axc", t = "ahbgdc"
     * Output: false
     * </pre>
     * 
     * <h3>Constraints:</h3>
     * <ul>
     *   <li>0 &lt;= s.length &lt;= 100</li>
     *   <li>0 &lt;= t.length &lt;= 10<sup>4</sup></li>
     *   <li>s and t consist only of lowercase English letters.</li>
     * </ul>
     * @param s A string containing only lowercase English letters (a-z, A-Z)
     * @param t A string containing only lowercase English letters (a-z, A-Z)
     * @see https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=top-interview-150
     * @return if string <strong>s</strong> is a subsequence of string <strong>t</strong>
     */
    public boolean isSubsequence(String s, String t) {
        int sPointer = 0;
        int tPointer = 0;

        while (sPointer < s.length() && tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            tPointer++;
        }
        
        return sPointer == s.length();
    }
}
