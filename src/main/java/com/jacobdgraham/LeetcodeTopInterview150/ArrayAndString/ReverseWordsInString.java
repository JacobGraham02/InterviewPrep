package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

public class ReverseWordsInString {
    
    /**
     * Given an input string <code>s</code>, reverse the order of the words.
     * <p>
     * A word is defined as a sequence of non-space characters.
     * The words in <code>s</code> will be separated by at least one space.
     * </p>
     * <p>
     * Return a string of the words in reverse order concatenated by a single space.
     * </p>
     * <p>
     * <strong>Note:</strong> <code>s</code> may contain leading or trailing spaces or multiple spaces between two words.
     * The returned string should only have a single space separating the words.
     * Do not include any extra spaces.
     * </p>
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: s = "the sky is blue"
     * Output: "blue is sky the"
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: s = "  hello world  "
     * Output: "world hello"
     * Explanation: Your reversed string should not contain leading or trailing spaces.
     * </pre>
     *
     * <p><strong>Example 3:</strong></p>
     * <pre>
     * Input: s = "a good   example"
     * Output: "example good a"
     * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *     <li>1 &le; s.length &le; 10<sup>4</sup></li>
     *     <li><code>s</code> contains English letters (upper-case and lower-case), digits, and spaces <code>' '</code>.</li>
     *     <li>There is at least one word in <code>s</code>.</li>
     * </ul>
     *
     * <p><strong>Follow-up:</strong> If the string data type is mutable in your language, can you solve it in-place with <code>O(1)</code> extra space?</p>
     * @param s A string containing upper- and lower-case English letters, and space characters ' '
     * @see https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=top-interview-150
     */
    public String reverseWords(String s) {
        if (s.length() == 0) {
            return "";
        }

        s = s.trim();
        String[] words = s.split("\\s+");
        StringBuilder reversedString = new StringBuilder("");

        for (int i = words.length - 1; i > 0; i--) {
            reversedString.append(words[i] + " ");
        }

        return reversedString.toString() + words[0];
    }
}
