package com.jacobdgraham.LeetcodeTopInterview150.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    
    /**
     * Given two strings s and t, determines if they are isomorphic.
     * <p>
     * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
     * All occurrences of a character must be replaced with another character while preserving 
     * the order of characters. No two characters may map to the same character, but a character 
     * may map to itself.
     * </p>
     * 
     * <h3>Examples:</h3>
     * 
     * <p>
     * <b>Example 1:</b><br>
     * <b>Input:</b> s = "egg", t = "add"<br>
     * <b>Output:</b> true<br>
     * <b>Explanation:</b> The strings s and t can be made identical by:
     * <ul>
     * <li>Mapping 'e' to 'a'</li>
     * <li>Mapping 'g' to 'd'</li>
     * </ul>
     * </p>
     * 
     * <p>
     * <b>Example 2:</b><br>
     * <b>Input:</b> s = "foo", t = "bar"<br>
     * <b>Output:</b> false<br>
     * <b>Explanation:</b> The strings s and t cannot be made identical as 'o' needs to be 
     * mapped to both 'a' and 'r'.
     * </p>
     * 
     * <p>
     * <b>Example 3:</b><br>
     * <b>Input:</b> s = "paper", t = "title"<br>
     * <b>Output:</b> true<br>
     * </p>
     * 
     * <h3>Constraints:</h3>
     * <ul>
     * <li>1 <= s.length <= 5 * 10^4</li>
     * <li>t.length == s.length</li>
     * <li>s and t consist of any valid ASCII character</li>
     * </ul>
     * 
     * @param s The first input string.
     * @param t The second input string.
     * @return true if the strings are isomorphic, false otherwise.
     */
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> sToTCharMapping = new HashMap<Character, Character>();
        Map<Character, Character> tToSCharMapping = new HashMap<Character, Character>();
        
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            /*
             * Check if sChar has already been mapped to a different character in t
             */
            if (sToTCharMapping.containsKey(sChar)) {
                if (sToTCharMapping.get(sChar) != tChar) {
                    return false;
                }
            }

            /*
             * Check if tChar has already been mapped to a different character in s
             */
            if (tToSCharMapping.containsKey(tChar)) {
                if (tToSCharMapping.get(tChar) != sChar) {
                    return false;
                }
            }

            sToTCharMapping.put(sChar, tChar);
            tToSCharMapping.put(tChar, sChar);
        }

        return true;
    }
}
