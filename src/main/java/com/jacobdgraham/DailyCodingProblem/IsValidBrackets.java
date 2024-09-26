package com.jacobdgraham.DailyCodingProblem;

import java.util.Stack;

public class IsValidBrackets {
    
    /**
     * <p>Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).</p>
    <h4>For example:</h4> 
    <p>given the string <strong>([])[]({})</strong>, you should return <strong>true</strong>. 
    Given the string <strong>([)]</strong> or <strong>((()</strong>, you should return <strong>false</strong>.</p>
     * @param s A string containing only valid bracket characters from the following set: []; (); {}
     * @return Whether or not the sequence of brackets in the string is valid or not 
     */
    public boolean isValid(final String s) {
        final Stack<Character> bracketsStack = new Stack<>();
        char[] brackets = s.toCharArray();

        /*
         * It makes sense and is more intuitive to use the enhanced for loop below, as we are directly checking the characters themselves. However, that 
         * does not mean we cannot use a traditional for loop.
         * 
         * Push any opening bracket onto the stack initially. Then, for any subsequent closing brackets, check for a matching opening bracket. 
         */
        for (char bracketChar : brackets) {
            if (bracketChar == '(') {
                bracketsStack.push(')');
            }
            else if (bracketChar == '{') {
                bracketsStack.push('}');
            }
            else if (bracketChar == '[') {
                bracketsStack.push(']');
            }
            else if (bracketsStack.isEmpty() || (bracketsStack.pop() != bracketChar)) {
                return false;
            }
        }
        return bracketsStack.isEmpty();
    }
}
