package com.jacobdgraham.LeetcodeTopInterview150.LinkedList;

public class RemoveDuplicatesFromSortedListII {
    /**
     * Removes all nodes from a sorted linked list that have duplicate numbers, leaving only distinct numbers from the original list.
     *
     * <p>The method takes the head of a sorted linked list and deletes all nodes that have duplicate values, ensuring that only
     * nodes with distinct values remain. The resulting linked list is returned in sorted order.</p>
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: head = [1, 2, 3, 3, 4, 4, 5]
     * Output: [1, 2, 5]
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: head = [1, 1, 1, 2, 3]
     * Output: [2, 3]
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>The number of nodes in the list is in the range [0, 300].</li>
     *   <li>-100 <= Node.val <= 100</li>
     *   <li>The list is guaranteed to be sorted in ascending order.</li>
     * </ul>
     *
     * @param head the head node of the sorted linked list
     * @return the head of the linked list with all duplicates removed, containing only distinct values
     * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/">Leetcode problem</a>
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        /*
        We will create a new list node head and assign the rest of the linked list to it. This will allow us to handle edge cases where the head
        itself is a duplicate
         */
        ListNode newList = new ListNode(0);
        newList.next = head;
        ListNode nodeBeforeDuplicates = newList;

        /*
        While loop through the 'head' linked list passed in as a parameter
         */
        while (head != null) {
            /*
            If we detect a duplicate value after the current value, we will skip over all the nodes with the same value
             */
            if (head.next != null && (head.val == head.next.val)) {

                while(head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                /*
                Link the previously distinct node to the node after the duplicates
                 */
                nodeBeforeDuplicates.next = head.next;
            } else {
                /*
                Move the head of the new linked list to the next node in the one containing duplicates
                 */
                nodeBeforeDuplicates = nodeBeforeDuplicates.next;
            }
            head = head.next;
        }

        return newList.next;
    }
}
