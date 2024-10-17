package com.jacobdgraham.LeetcodeTopInterview150.LinkedList;

public class LinkedListCycle {

    /**
     * Determines if a linked list has a cycle.
     *
     * <p>A cycle exists in a linked list if there is some node in the list that can be reached again
     * by continuously following the <code>next</code> pointer. Internally, <code>pos</code> is used to denote the index of the node
     * that the tail's <code>next</code> pointer is connected to. Note that <code>pos</code> is not passed as a parameter.</p>
     *
     * <p>The method returns <code>true</code> if a cycle exists in the linked list, and <code>false</code> otherwise.</p>
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: head = [3, 2, 0, -4], pos = 1
     * Output: true
     * Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: head = [1, 2], pos = 0
     * Output: true
     * Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
     * </pre>
     *
     * <p><strong>Example 3:</strong></p>
     * <pre>
     * Input: head = [1], pos = -1
     * Output: false
     * Explanation: There is no cycle in the linked list.
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>The number of nodes in the list is in the range [0, 10<sup>4</sup>].</li>
     *   <li>-10<sup>5</sup> <= Node.val <= 10<sup>5</sup></li>
     *   <li><code>pos</code> is -1 or a valid index in the linked list.</li>
     * </ul>
     *
     * @param head the head node of the linked list
     * @return <code>true</code> if there is a cycle in the linked list, <code>false</code> otherwise
     * @see <a href="https://leetcode.com/problems/linked-list-cycle/">Leetcode problem</a>
     */
    public boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }

        Node slowPointer = head;
        Node fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

//            1 2 3 4 5
//                ^   |
//                |----
//            1 1
//            2 3
//            3 5
//            4 4
            if (slowPointer == fastPointer) {
                return true;
            }
        }
        return false;
    }
}
