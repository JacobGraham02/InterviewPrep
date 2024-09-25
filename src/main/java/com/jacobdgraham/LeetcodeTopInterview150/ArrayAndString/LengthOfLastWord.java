package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

public class LengthOfLastWord {
    /**
 * Given a string <code>s</code> consisting of words and spaces, return the length of the last word in the string.
 * <p>
 * A word is a maximal substring consisting of non-space characters only.
 * </p>
 * 
 * <h3>Example 1:</h3>
 * <pre>
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 * </pre>
 * 
 * <h3>Example 2:</h3>
 * <pre>
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * Explanation: The last word is "moon" with length 4.
 * </pre>
 * 
 * <h3>Example 3:</h3>
 * <pre>
 * Input: s = "luffy is still joyboy"
 * Output: 6
 * Explanation: The last word is "joyboy" with length 6.
 * </pre>
 * 
 * <h3>Constraints:</h3>
 * <ul>
 *   <li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li>
 *   <li><code>s</code> consists of only English letters and spaces <code>' '</code>.</li>
 *   <li>There will be at least one word in <code>s</code>.</li>
 * </ul>
 * @param s A string of characters which can only contain a-z,A-Z, or a space character
 * @return int The length of the last word in the String
 */

    int lengthOfLastWord(String s) {
        if (s == null || s.isBlank()) {
            return 0;
        }
        s = s.strip();

        String[] wordsInStringArray = s.split("\\s+");
        String lastWordInArray = wordsInStringArray[wordsInStringArray.length - 1];
        return lastWordInArray.length();
    }
}
