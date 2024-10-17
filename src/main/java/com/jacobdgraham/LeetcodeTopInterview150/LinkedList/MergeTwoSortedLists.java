package com.jacobdgraham.LeetcodeTopInterview150.LinkedList;

public class MergeTwoSortedLists {
    /**
     * Merges two sorted linked lists into one sorted list by splicing together the nodes of the first two lists.
     *
     * <p>The method takes the heads of two sorted linked lists, <code>list1</code> and <code>list2</code>, and returns
     * the head of the merged linked list, which contains all the nodes from both lists in sorted order.</p>
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: list1 = [1, 2, 4], list2 = [1, 3, 4]
     * Output: [1, 1, 2, 3, 4, 4]
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: list1 = [], list2 = []
     * Output: []
     * </pre>
     *
     * <p><strong>Example 3:</strong></p>
     * <pre>
     * Input: list1 = [], list2 = [0]
     * Output: [0]
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>The number of nodes in both lists is in the range [0, 50].</li>
     *   <li>-100 <= Node.val <= 100</li>
     *   <li>Both <code>list1</code> and <code>list2</code> are sorted in non-decreasing order.</li>
     * </ul>
     *
     * @param list1 the head node of the first sorted linked list
     * @param list2 the head node of the second sorted linked list
     * @return the head node of the merged linked list, sorted in non-decreasing order
     * @see <a href="https://leetcode.com/problems/merge-two-sorted-lists/">Leetcode problem</a>
     */
    public ListNode mergeTwoListsRecursive(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            list1.next = mergeTwoListsRecursive(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoListsRecursive(list1, list2.next);
            return list2;
        }
    }

    /**
     * Merges two sorted linked lists into one sorted list by splicing together the nodes of the first two lists.
     *
     * <p>The method takes the heads of two sorted linked lists, <code>list1</code> and <code>list2</code>, and returns
     * the head of the merged linked list, which contains all the nodes from both lists in sorted order.</p>
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: list1 = [1, 2, 4], list2 = [1, 3, 4]
     * Output: [1, 1, 2, 3, 4, 4]
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: list1 = [], list2 = []
     * Output: []
     * </pre>
     *
     * <p><strong>Example 3:</strong></p>
     * <pre>
     * Input: list1 = [], list2 = [0]
     * Output: [0]
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>The number of nodes in both lists is in the range [0, 50].</li>
     *   <li>-100 <= Node.val <= 100</li>
     *   <li>Both <code>list1</code> and <code>list2</code> are sorted in non-decreasing order.</li>
     * </ul>
     *
     * @param list1 the head node of the first sorted linked list
     * @param list2 the head node of the second sorted linked list
     * @return the head node of the merged linked list, sorted in non-decreasing order
     * @see <a href="https://leetcode.com/problems/merge-two-sorted-lists/">Leetcode problem</a>
     */
    public ListNode mergeTwoListsIterative(ListNode list1, ListNode list2) {
        ListNode newList = new ListNode(0);
        ListNode newTail = newList;

        while(list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                newTail.next = list1;
                list1 = list1.next;
            } else {
                newTail.next = list2;
                list2 = list2.next;
            }
            /*
            Move the tail pointer to the last node in the merged list
             */
            newTail = newTail.next;
        }

        /*
        At this point, at least one of the linked lists is empty. Therefore, we must attach the remaining part of the non-empty list
        to the merged list
         */
        if (list1 != null) {
            newTail.next = list1;
        } else {
            newTail.next = list2;
        }

        /*
        newList points to the head of the merged linked list. Because the head value is 0, we must return the .next() value of the linked list
         */
        return newList.next;
    }
}
