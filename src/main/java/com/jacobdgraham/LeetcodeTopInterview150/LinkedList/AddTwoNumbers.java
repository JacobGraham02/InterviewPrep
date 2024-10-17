package com.jacobdgraham.LeetcodeTopInterview150.LinkedList;

public class AddTwoNumbers {

    /**
     * Adds two non-empty linked lists representing two non-negative integers, where the digits are stored in reverse order.
     * Each node contains a single digit. The method returns the sum as a new linked list, with digits also stored in reverse order.
     *
     * <p>You may assume that the two numbers do not contain any leading zeros, except for the number 0 itself.</p>
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: l1 = [2, 4, 3], l2 = [5, 6, 4]
     * Output: [7, 0, 8]
     * Explanation: 342 + 465 = 807.
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: l1 = [0], l2 = [0]
     * Output: [0]
     * </pre>
     *
     * <p><strong>Example 3:</strong></p>
     * <pre>
     * Input: l1 = [9, 9, 9, 9, 9, 9, 9], l2 = [9, 9, 9, 9]
     * Output: [8, 9, 9, 9, 0, 0, 0, 1]
     * Explanation: 9999999 + 9999 = 10009998.
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>The number of nodes in each linked list is in the range [1, 100].</li>
     *   <li>0 <= Node.val <= 9</li>
     *   <li>It is guaranteed that the linked list represents a number that does not have leading zeros.</li>
     * </ul>
     *
     * @param l1 the head node of the first linked list
     * @param l2 the head node of the second linked list
     * @return the head node of the new linked list representing the sum of the two numbers
     * @see <a href="https://leetcode.com/problems/add-two-numbers/">Leetcode problem</a>
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultList = new ListNode(0);
        ListNode tail = resultList;
        int carryDigit = 0;
        int digit = 0;

        while (l1 != null || l2 != null || carryDigit != 0) {
            int digit1 = 0, digit2 = 0;
            if (l1 != null) {
                digit1 = l1.val;
            }
            if (l2 != null) {
                digit2 = l2.val;
            }

            int sum = digit1 + digit2 + carryDigit;
            digit = sum % 10;
            carryDigit = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        /*
        * resultList and tail both point to the same list. resultList points to the head of the linked list (where value is 0),
        * and tail points to the last value. We only have to return resultList
        */
        ListNode resultLinkedList = resultList.next;
        /*
        resultList.next is assigned the value of null to inform the garbage collector that this memory space can be reclaimed, as it has no more
        references to it.
         */
        resultList.next = null;
        return resultLinkedList;
    }
}
