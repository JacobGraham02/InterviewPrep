package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {
    /**
     * Given a string containing digits from 2-9 inclusive, return all possible letter combinations
     * that the number could represent. Return the answer in any order.
     *
     * A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: digits = "23"
     * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: digits = ""
     * Output: []
     * </pre>
     *
     * <p><strong>Example 3:</strong></p>
     * <pre>
     * Input: digits = "2"
     * Output: ["a","b","c"]
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>0 <= digits.length <= 4</li>
     *   <li>digits[i] is a digit in the range ['2', '9'].</li>
     * </ul>
     *
     * @param digits the input string containing digits
     * @return a list of all possible letter combinations the number could represent
     * @see <a href="https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/" title="Link to leetcode problem 'Letter combinations of a phone number'">Leetcode</a>
     */
    public List<String> letterCombinations(String digits) {
        final String[] DIGIT_TO_LETTERS = {
            "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }

        /*
        Adding an empty string to the array list initially allows us to add the first digit combination, as the for loop to add
        additional combinations will only trigger if a string exists initially
         */
        List<String> resultingCombationsList = new ArrayList<>();
        resultingCombationsList.add("");

        for (char digit : digits.toCharArray()) {
            /*
            We can select between the 0th and 7th index from our DIGIT_TO_LETTERS array.
            To begin, we know that any character from 'digits' can be between 2 and 9.
            We have to subtract some character value from digit to get a value between 0 and 7.
            The value of 'digit' can be between 50 and 57. Therefore, to get a valid index between 0 and 7,
            we have to subtract a character with the ASCII value of 50, which is 2.
             */
            String letters = DIGIT_TO_LETTERS[digit - '2'];
            List<String> newCombinationsList = new ArrayList<>();

            /*
            For any existing combinations, append each letter from the newly-found combinations
            to form a new combination
             */
            for (String combination : resultingCombationsList) {
                /*
                If we use the example digits = "2", the variable 'letters' will initially hold the value of "abc".
                We then convert this string into a character array, and individually append those characters to the array.
                Let's then add a digit 3, and use the first letter 'a' that is in the array. We are going to iterate over each string
                that exists in the array, which consists of "a", "b", and "c". Then, we add each letter from our newly found 'letter' variable.
                In this instance, that would make "a" + "d", which makes the string: "ad". This pattern follows for "b", "c", and "e", "f"
                 */
                for (char letter : letters.toCharArray()) {
                    newCombinationsList.add(combination + letter);
                }
            }

            resultingCombationsList = newCombinationsList;
        }

        return resultingCombationsList;
    }
}
