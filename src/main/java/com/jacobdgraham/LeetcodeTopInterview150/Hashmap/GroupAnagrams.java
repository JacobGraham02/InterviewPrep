package com.jacobdgraham.LeetcodeTopInterview150.Hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    
    /**
     * Given an array of strings <code>strs</code>, group the anagrams together. 
     * You can return the answer in any order.
     * 
     * <p>Example 1:</p>
     * <pre>
     * Input: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
     * Output: [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]
     * Explanation:
     * - There is no string in <code>strs</code> that can be rearranged to form "bat".
     * - The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
     * - The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
     * </pre>
     * 
     * <p>Example 2:</p>
     * <pre>
     * Input: strs = [""]
     * Output: [[""]]
     * </pre>
     * 
     * <p>Example 3:</p>
     * <pre>
     * Input: strs = ["a"]
     * Output: [["a"]]
     * </pre>
     * 
     * <p>Constraints:</p>
     * <ul>
     *   <li>1 <= strs.length <= 10<sup>4</sup></li>
     *   <li>0 <= strs[i].length <= 100</li>
     *   <li><code>strs[i]</code> consists of lowercase English letters.</li>
     * </ul>
     * @param strs an array of strings, where each string contains only lowercase English letters
     * @see https://leetcode.com/problems/group-anagrams/description/?envType=study-plan-v2&envId=top-interview-150
     * @return a list containing a list of all valid anagrams
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        /*
         * In this problem, each individual List<String> inside of the parent List will contain only strings that are valid anagrams of one another. Afterwords, it will be 
         * returned
         */

         /*
          * In the below map, the String key for each entry will be each individual string from the array of strings. The List<String> that composes the value(s)
          * for the key will be all of the valid anagrams that were found
          */
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            /*
             * In our algorithm, when each individual string "str" we get is sorted, it will become an anagram of the original word (same letters just rearranged)
             * Think of this algorithm as each string in the original "strs" array having a 1-to-1 association with a valid anagram. The first string in each list
             * will be the string that is used to get anagrams from, and all other strings after the first one will be any anagrams. 
             * For each of the sorted words we get, 
             */
            char[] wordChars = str.toCharArray();
            Arrays.sort(wordChars);
            String sortedWord = new String(wordChars);
            
            /*
             * Add the original string to the list corresponding to the sortedWord key. This is used to get the list associated with sortedWord if it exists,
             * or create a new one if it does not exist
             */
            map.computeIfAbsent(sortedWord, key -> new ArrayList<>()).add(str);
        }

        /*
         * Converts all valid anagrams into list of lists
         */
        return new ArrayList<>(map.values());
    }
}
