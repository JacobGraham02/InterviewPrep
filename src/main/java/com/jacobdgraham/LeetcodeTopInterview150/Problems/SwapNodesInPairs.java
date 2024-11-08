package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import com.jacobdgraham.Utils.ListNode;

public class SwapNodesInPairs {
    /**
     * Given a linked list, swap every two adjacent nodes and return its head.
     * You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: head = [1,2,3,4]
     * Output: [2,1,4,3]
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: head = []
     * Output: []
     * </pre>
     *
     * <p><strong>Example 3:</strong></p>
     * <pre>
     * Input: head = [1]
     * Output: [1]
     * </pre>
     *
     * <p><strong>Example 4:</strong></p>
     * <pre>
     * Input: head = [1,2,3]
     * Output: [2,1,3]
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>The number of nodes in the list is in the range [0, 100].</li>
     *   <li>0 <= Node.val <= 100</li>
     * </ul>
     *
     * @param head the head of the linked list
     * @return the head of the modified linked list with pairs swapped
     * @see <a href="https://leetcode.com/problems/swap-nodes-in-pairs/" title="A link to the leetcode problem 'Swap Nodes in Pairs">Leetcode</a>
     */
    public ListNode swapPairs(ListNode head) {
        /*
        Create a duplicate dummy linked list to use, and assign the original linked list to it for use in the algorithm.

         */
        ListNode dummyHeadNode = new ListNode(0);
        dummyHeadNode.next = head;
        ListNode previousNode = dummyHeadNode;

        /*
        previousNode will be the node we use primarily to iterate with
         */
        while (previousNode.next != null && previousNode.next.next != null) {
            ListNode firstPointer = previousNode.next;
            ListNode secondPointer = firstPointer.next;

            /*
            To begin, firstPointer and secondPointer are set to the two nodes we want to swap. Below is our general process:
             1. firstPointer.next = secondPointer.next will connect firstPointer to the node after secondPointer
             2. secondPointer.next = firstPointer will make secondPointer point to firstPointer
             3. previousNode.next = secondPointer will connect the previous part of the list to secondPointer. This will place secondPointer
                before firstPointer.
             4. previousNode = firstPointer (the node after the swapped pair) to prepare for the next pair
             */
            firstPointer.next = secondPointer.next;
            secondPointer.next = firstPointer;
            previousNode.next = secondPointer;

            previousNode = firstPointer;
        }

        return dummyHeadNode.next;
    }
}
