package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import com.jacobdgraham.Utils.ListNode;

public class RemoveNthNodeFromEndOfList {
    /**
     * Given the head of a linked list, remove the nth node from the end of the list and return its head.
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: head = [1,2,3,4,5], n = 2
     * Output: [1,2,3,5]
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: head = [1], n = 1
     * Output: []
     * </pre>
     *
     * <p><strong>Example 3:</strong></p>
     * <pre>
     * Input: head = [1,2], n = 1
     * Output: [1]
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>The number of nodes in the list is sz.</li>
     *   <li>1 <= sz <= 30</li>
     *   <li>0 <= Node.val <= 100</li>
     *   <li>1 <= n <= sz</li>
     * </ul>
     *
     * @param head the head of the linked list
     * @param n the position from the end of the list to remove the node
     * @return the head of the modified linked list
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode fastPointer = dummyNode;
        ListNode slowPointer = dummyNode;

        /*
        This will make a difference of n nodes between slowPointer and fastPointer. Then, when we progress fastPointer and slowPointer at the same time,
        there will always be a difference of n nodes between them.
         */
        for (int i = 0; i <= n; i++) {
            fastPointer = fastPointer.next;
        }

        while (fastPointer != null) {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }

        /*
        When we reach the end of the linked list with fastPointer, that means slowPointer will point at the nth node which we want to remove.
        Then, we will move the next node after slowPointer to the node after that one. This will remove the nth node (by skipping over it),
        dereferencing it and allowing the garbage collector to make that memory inaccessible.
         */
        slowPointer.next = slowPointer.next.next;

        /*
        Because the first node in our dummyNode list is a dummy node (has a value of 0), we will return the Node as the one after that
        as the list head
         */
        return dummyNode.next;
    }
}
