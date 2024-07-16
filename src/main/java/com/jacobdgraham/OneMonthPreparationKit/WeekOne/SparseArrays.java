package com.jacobdgraham.OneMonthPreparationKit.WeekOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * There is a collection of input strings and a collection of query strings. For each query string, determine how many times it occurs in the list of input strings. Return an array of the results.

Example

strings = ['ab','ab','abc']
queries = ['ab','abc','bc']

There are instances of ', of '' and of ''. For each query, add an element to the return array, 
results = [2,1,0]

Complete the function matchingStrings in the editor below. The function must return an array of integers representing the frequency of occurrence of each query string in strings.

matchingStrings has the following parameters:

    string strings[n] - an array of strings to search
    string queries[q] - an array of query strings

 */
public class SparseArrays {
    
    /**
      * There is a collection of input strings and a collection of query strings. For each query string, determine how many times it occurs in the list of input strings. Return an array of the results.

Example

strings = ['ab','ab','abc']
queries = ['ab','abc','bc']

There are instances of ', of '' and of ''. For each query, add an element to the return array, 
results = [2,1,0]

Complete the function matchingStrings in the editor below. The function must return an array of integers representing the frequency of occurrence of each query string in strings.

matchingStrings has the following parameters:

     * @param strings an array of strings to search
     * @param queries an array of query strings to search for instances that occur in the 'strings' array
     * @return
     */
    public final List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        final Map<String, Integer> frequencyOfQueriesMap = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            frequencyOfQueriesMap.put(s, frequencyOfQueriesMap.getOrDefault(s, 0) + 1);
        }

        final List<Integer> frequencies = new ArrayList<>();

        for (int i = 0; i < queries.size(); i++) {
            frequencies.add(frequencyOfQueriesMap.getOrDefault(queries.get(i), 0));
        }
        return frequencies;
    }
}