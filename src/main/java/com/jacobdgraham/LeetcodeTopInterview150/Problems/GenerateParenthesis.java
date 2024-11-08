package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    /**
     * Given n pairs of parentheses, generate all combinations of well-formed parentheses.
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: n = 3
     * Output: ["((()))","(()())","(())()","()(())","()()()"]
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: n = 1
     * Output: ["()"]
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>1 <= n <= 8</li>
     * </ul>
     *
     * @param n the number of pairs of parentheses
     * @return a list of all combinations of well-formed parentheses
     * @see <a href="https://leetcode.com/problems/generate-parentheses/description/" title="A link to the leetcode problem 'Generate Parentheses'">Leetcode</a>
     */
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    /**
     * Recursive backtracking function to build all valid parentheses combinations.
     *
     * @param result the list to store completed valid combinations
     * @param combination the current combination being built
     * @param openCount the number of open parentheses added so far
     * @param closeCount the number of close parentheses added so far
     * @param n the total number of pairs of parentheses
     */
    private void backtrack(List<String> result, String combination, int openCount, int closeCount, int n) {
        /*
        Because we are going to use backtracking with recursion, we must have a base case so the recursion eventually terminates,
        returns a tree of valid results, and does not cause any out of memory errors.
        We have a base case of: combination.length() == 2 * n because there must be the same amount of open and closed parenthesis.
        If they are n number of open parenthesis, there must be n number of closing ones.
         */
        if (combination.length() == (2 * n)) {
            result.add(combination);
            return;
        }

        /*
        Add an open parenthesis to the resulting array if we have not reached the limit
         */
        if (openCount < n) {
            String resultingCombination = combination + "(";
            backtrack(result, resultingCombination, openCount + 1, closeCount, n);
        }

        /*
        If we will not unbalance the parenthesis (i.e., keep the same number of opening and closing parenthesis),
        we will add a closing parenthesis. We test if closeCount is less than openCount before doing another backtrack
        to see if we can keep an equal number of opening and closing parenthesis
         */
        if (closeCount < openCount) {
            String resultingCombination =  combination + ")";
            backtrack(result, resultingCombination, openCount, closeCount + 1, n);
        }
    }
}
