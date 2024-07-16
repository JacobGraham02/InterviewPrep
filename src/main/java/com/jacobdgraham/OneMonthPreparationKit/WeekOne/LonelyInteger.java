package com.jacobdgraham.OneMonthPreparationKit.WeekOne;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of integers, where all elements but one occur twice, find the unique element.

Example
a = [1,2,3,4,3,2,1]

The unique element is 4. 
 */
public class LonelyInteger {
    
    /**
     *  * Given an array of integers, where all elements but one occur twice, find the unique element.

Example
a = [1,2,3,4,3,2,1];

The unique element is 4. 
     * @param integerList a list of integers
     * @return the integer in integerList that occurs only once in the list
     */
    public final int lonelyInteger(List<Integer> integerList) {
        final Map<Integer, Integer> occurencesMap = new HashMap<>();

        for (int i = 0; i < integerList.size(); i++) {
            occurencesMap.put(integerList.get(i), occurencesMap.getOrDefault(integerList.get(i), 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : occurencesMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
