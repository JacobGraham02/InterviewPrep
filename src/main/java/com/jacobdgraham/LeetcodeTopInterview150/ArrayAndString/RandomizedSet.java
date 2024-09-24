package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Implements the <code>RandomizedSet</code> class.
 *
 * <p>The <code>RandomizedSet</code> class supports the following operations:</p>
 * <ul>
 *   <li><code>RandomizedSet()</code>: Initializes the <code>RandomizedSet</code> object.</li>
 *   <li><code>boolean insert(int val)</code>: Inserts an item <code>val</code> into the set if not present. 
 *       Returns <code>true</code> if the item was not present, <code>false</code> otherwise.</li>
 *   <li><code>boolean remove(int val)</code>: Removes an item <code>val</code> from the set if present. 
 *       Returns <code>true</code> if the item was present, <code>false</code> otherwise.</li>
 *   <li><code>int getRandom()</code>: Returns a random element from the current set of elements. 
 *       It is guaranteed that at least one element exists when this method is called. 
 *       Each element must have the same probability of being returned.</li>
 * </ul>
 *
 * <p>All operations are designed to have an average time complexity of <code>O(1)</code>.</p>
 *
 * <h3>Example 1:</h3>
 *
 * <pre>
 * Input:
 * ["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
 * [[], [1], [2], [2], [], [1], [2], []]
 *
 * Output:
 * [null, true, false, true, 2, true, false, 2]
 *
 * Explanation:
 * <code>RandomizedSet randomizedSet = new RandomizedSet();</code>
 * <code>randomizedSet.insert(1);</code> // Inserts 1 to the set. Returns <code>true</code> as 1 was inserted successfully.
 * <code>randomizedSet.remove(2);</code> // Returns <code>false</code> as 2 does not exist in the set.
 * <code>randomizedSet.insert(2);</code> // Inserts 2 to the set, returns <code>true</code>. Set now contains [1,2].
 * <code>randomizedSet.getRandom();</code> // Returns either 1 or 2 randomly.
 * <code>randomizedSet.remove(1);</code> // Removes 1 from the set, returns <code>true</code>. Set now contains [2].
 * <code>randomizedSet.insert(2);</code> // 2 was already in the set, so returns <code>false</code>.
 * <code>randomizedSet.getRandom();</code> // Since 2 is the only number in the set, returns 2.
 * </pre>
 */
public class RandomizedSet {

    private HashMap<Integer, Integer> valueToIndexMap;
    private ArrayList<Integer> valuesList;
    private Random random;
    
    public RandomizedSet() {
        valueToIndexMap = new HashMap();
        valuesList = new ArrayList();
        random = new Random();
    }

    /**
     * Inserts a value at the end of the array list <strong>valuesList</strong>, and puts a key value pair into the hash map <strong>valueToIndexMap</strong>
     * @param val an integer that has a value between Integer.MIN_VALUE and Integer.MAX_VALUE
     * @return true if val was successfully inserted, false otherwise
     */
    public boolean insert(int val) {
        if (valueToIndexMap.containsKey(val)) {
            return false;
        }
        valuesList.add(val);
        // Store the index of the value from valuesList into the map
        valueToIndexMap.put(val, valuesList.size() - 1);
        return true;
    }

    /**
     * Removes a value from the end of the array list <strong>valuesList</strong>, and removes a key value pair from the hash map <strong>valueToIndexMap</strong>
     * @param val an integer that has a value between Integer.MIN_VALUE and Integer.MAX_VALUE
     * @return true if val was successfully deleted, false otherwise
     */
    public boolean remove(int val) {
        if (!valueToIndexMap.containsKey(val)) {
            return false;
        }
        int indexToRemove = valueToIndexMap.get(val);
        int lastElementInList = valuesList.get(valuesList.size() - 1);
        /*
         * Move the last element in the array list to the position of the element we want to remove, and update the hash map to reflect this change. 
         */
        valuesList.set(indexToRemove, lastElementInList);
        valueToIndexMap.put(lastElementInList, indexToRemove);
        /*
         * Remove the last element from the array list, which this is the element we want to remove. Then, remove the key-value pair from the hash map which has the key
         * of the removed value
         */
        valuesList.remove(valuesList.size() - 1);
        valueToIndexMap.remove(val);
        return true;
    }

    /**
     * Gets a random value from the array list <strong>valuesList</strong>. This is guaranteed to be a random element from the array list. 
     * @return
     * @throws IllegalStateException if the array list valuesList is empty
     */
    public int getRandom() {
        if (valuesList.isEmpty()) {
            throw new IllegalStateException("Cannot get a random element from an empty list");
        }
        int randomIndex = random.nextInt(valuesList.size());
        return valuesList.get(randomIndex);
    }
}
