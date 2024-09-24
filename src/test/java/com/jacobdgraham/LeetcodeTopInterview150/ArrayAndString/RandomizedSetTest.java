package com.jacobdgraham.LeetcodeTopInterview150.ArrayAndString;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RandomizedSetTest {

    private static RandomizedSet randomizedSet;
    
    @BeforeEach
    void setUp() {
        randomizedSet = new RandomizedSet(); 
    }

    /**
     * Test inserting elements into the RandomizedSet.
     */
    @Test
    void testInsert() {
        // Reset the set for this test
        randomizedSet = new RandomizedSet();

        // Insert a new element
        assertTrue(randomizedSet.insert(1), "Inserting 1 should return true.");

        // Insert the same element again
        assertFalse(randomizedSet.insert(1), "Inserting 1 again should return false.");

        // Insert another new element
        assertTrue(randomizedSet.insert(2), "Inserting 2 should return true.");
    }

    /**
     * Test removing elements from the RandomizedSet.
     */
    @Test
    void testRemove() {
        // Reset the set for this test
        randomizedSet = new RandomizedSet();
        randomizedSet.insert(1);
        randomizedSet.insert(2);

        // Remove an existing element
        assertTrue(randomizedSet.remove(1), "Removing 1 should return true.");

        // Attempt to remove the same element again
        assertFalse(randomizedSet.remove(1), "Removing 1 again should return false.");

        // Attempt to remove a non-existing element
        assertFalse(randomizedSet.remove(3), "Removing 3 (not present) should return false.");
    }

    /**
     * Test the getRandom method of RandomizedSet.
     */
    @Test
    void testGetRandom() {
        // Reset the set for this test
        randomizedSet = new RandomizedSet();
        randomizedSet.insert(1);
        randomizedSet.insert(2);
        randomizedSet.insert(3);

        // Since getRandom is random, we'll perform multiple calls to ensure it returns existing elements
        Set<Integer> possibleValues = new HashSet<>();
        possibleValues.add(1);
        possibleValues.add(2);
        possibleValues.add(3);

        for (int i = 0; i < 10; i++) {
            int rand = randomizedSet.getRandom();
            assertTrue(possibleValues.contains(rand), "getRandom() should return an existing element.");
        }
    }

    /**
     * Test getRandom method when the set is empty.
     * It should throw an IllegalStateException.
     */
    @Test
    void testGetRandomEmptySet() {
        // Reset the set for this test
        randomizedSet = new RandomizedSet();

        // Attempting to getRandom from an empty set should throw an exception
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            randomizedSet.getRandom();
        });

        String expectedMessage = "Cannot get a random element from an empty list";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage), "Exception message should indicate the set is empty.");
    }

    /**
     * Test a sequence of insertions and removals.
     */
    @Test
    void testSequenceOperations() {
        // Reset the set for this test
        randomizedSet = new RandomizedSet();

        // Insert elements
        assertTrue(randomizedSet.insert(10), "Inserting 10 should return true.");
        assertTrue(randomizedSet.insert(20), "Inserting 20 should return true.");
        assertTrue(randomizedSet.insert(30), "Inserting 30 should return true.");

        // Remove an element
        assertTrue(randomizedSet.remove(20), "Removing 20 should return true.");

        // Insert a new element
        assertTrue(randomizedSet.insert(40), "Inserting 40 should return true.");

        // Attempt to remove a non-existing element
        assertFalse(randomizedSet.remove(50), "Removing 50 (not present) should return false.");

        // Verify getRandom returns existing elements
        Set<Integer> expected = new HashSet<>();
        expected.add(10);
        expected.add(30);
        expected.add(40);

        for (int i = 0; i < 10; i++) {
            int rand = randomizedSet.getRandom();
            assertTrue(expected.contains(rand), "getRandom() should return an existing element.");
        }
    }

    /**
     * Test removing all elements and ensure the set is empty.
     */
    @Test
    void testRemoveAll() {
        // Reset the set for this test
        randomizedSet = new RandomizedSet();
        randomizedSet.insert(5);
        randomizedSet.insert(15);
        randomizedSet.insert(25);

        // Remove all elements
        assertTrue(randomizedSet.remove(5), "Removing 5 should return true.");
        assertTrue(randomizedSet.remove(15), "Removing 15 should return true.");
        assertTrue(randomizedSet.remove(25), "Removing 25 should return true.");

        // The set should now be empty
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            randomizedSet.getRandom();
        });

        String expectedMessage = "Cannot get a random element from an empty list";
        String actualMessage = exception.getMessage();

        System.out.println(actualMessage);

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @AfterEach
    void tearDown() {
        randomizedSet = null;
    }
}
