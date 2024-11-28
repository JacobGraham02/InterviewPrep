package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import com.jacobdgraham.Utils.ListNode;

public class RemoveDuplicatesFromSortedList {
    /**
     * Removes duplicates from a sorted linked list such that each element appears only once.
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: head = [1,1,2]
     * Output: [1,2]
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: head = [1,1,2,3,3]
     * Output: [1,2,3]
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>The number of nodes in the list is in the range [0, 300].</li>
     *   <li>-100 <= Node.val <= 100</li>
     *   <li>The list is guaranteed to be sorted in ascending order.</li>
     * </ul>
     *
     * @param head the head of the sorted linked list
     * @return the head of the modified linked list with duplicates removed
     * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list/" title="A link to the leetcode problem 'Remove Duplicates from Sorted List">Leetcode</a>
     */
    public ListNode deleteDuplicates(ListNode head) {
        /*
        Because the ListNode 'head' is already sorted, we can iterate through the LinkedList sequentially without worrying about
        scrambling any nodes out of order. Because we might need support for operations such as inserting, deleting, or rearranging nods in the linked list,
        we will maintain a dummy node so that we have the flexibility to maintain a pointer to the previous node.
        We do not need to use a dummy node if the linked list does not need
         */
        ListNode dummyListNode = new ListNode(0);
        dummyListNode.next = head;
        ListNode currentPointer = dummyListNode.next;

        /*
        We can effectively remove duplicate values from the linked list by skipping over them. We do this by reassigning
        the 'next' pointer for a ListNode element to the ListNode after the one we are removing.
        If the elements are not the same, we can iterate the LinkedList pointer forwards so check the next ListNode
        Because currentPointer and dummyListNode are pointing to the same memory location, any changes with either variable
        will affect the other
         */
        while (currentPointer != null && currentPointer.next != null) {
            if (currentPointer.val == currentPointer.next.val) {
                currentPointer.next = currentPointer.next.next;
            } else {
                currentPointer = currentPointer.next;
            }
        }

        return dummyListNode.next;
    }
}
