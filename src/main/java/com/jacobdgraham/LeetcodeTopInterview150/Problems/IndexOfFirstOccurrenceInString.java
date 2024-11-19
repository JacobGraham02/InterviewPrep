package com.jacobdgraham.LeetcodeTopInterview150.Problems;

public class IndexOfFirstOccurrenceInString {
    /**
     * Finds the index of the first occurrence of the string `needle` in `haystack`,
     * or returns -1 if `needle` is not part of `haystack`.
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: haystack = "sadbutsad", needle = "sad"
     * Output: 0
     * Explanation: "sad" occurs at index 0 and 6. The first occurrence is at index 0.
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: haystack = "leetcode", needle = "leeto"
     * Output: -1
     * Explanation: "leeto" did not occur in "leetcode".
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>1 <= haystack.length, needle.length <= 10⁴</li>
     *   <li>`haystack` and `needle` consist of only lowercase English characters.</li>
     * </ul>
     *
     * @param haystack the string to search within
     * @param needle the string to search for
     * @return the index of the first occurrence of `needle` in `haystack`, or -1 if not found
     * @see <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/" title="A link to the leetcode problem 'Find the Index of the First Occurrence in a String'">Leetcode</a>
     */
    public int strStr(String haystack, String needle) {
        /*
        If the needle is longer than the haystack, return -1 as the
        needle cannot be longer than the haystack
         */
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        if (needleLength > haystackLength) {
            return -1;
        }

        /*
        We must iterate over the entire length of haystack. We can only go until the end of the haystack, minus the length of the needle
        When we iterate over each character in the string 'haystack', we can check the substring (i, i + needleLength), where i is a
        character in the string. We can immediately return when we find a valid substring, as we only have to return the first
        occurrence
         */
        for (int i = 0; i <= haystackLength - needleLength; i++){
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
