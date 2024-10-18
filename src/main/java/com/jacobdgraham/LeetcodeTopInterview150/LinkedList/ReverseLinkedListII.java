package com.jacobdgraham.LeetcodeTopInterview150.LinkedList;

import java.util.Stack;

public class ReverseLinkedListII {
    /**
     * Reverses the nodes of a singly linked list from position <code>left</code> to position <code>right</code>, inclusive.
     *
     * <p>The method takes the head of a singly linked list and two integers <code>left</code> and <code>right</code>
     * such that <code>left <= right</code>, and returns the head of the list after reversing the specified portion.</p>
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: head = [1, 2, 3, 4, 5], left = 2, right = 4
     * Output: [1, 4, 3, 2, 5]
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: head = [5], left = 1, right = 1
     * Output: [5]
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>The number of nodes in the list is <code>n</code>.</li>
     *   <li>1 <= n <= 500</li>
     *   <li>-500 <= Node.val <= 500</li>
     *   <li>1 <= left <= right <= n</li>
     * </ul>
     *
     * <p><strong>Follow-up:</strong> Could you do it in one pass?</p>
     *
     * @param head the head node of the singly linked list
     * @param left the starting position of the portion to reverse (1-based index)
     * @param right the ending position of the portion to reverse (1-based index)
     * @return the head of the linked list after reversing the specified portion
     * @see <a href="https://leetcode.com/problems/reverse-linked-list-ii/">Leetcode problem</a>
     */
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || (left >= right)) {
            return head;
        }

        /*
        Dummy node to handle any edge cases where left == 1.
         */
        ListNode newList = new ListNode(0);
        newList.next = head;
        /*
        We have pointers for the start and end of the reversal
         */
        ListNode previousNode = newList;

        /*
        First, we will traverse the linked list and assign the previousNode pointer to just before where the variable 'left' is pointing to
        This will allow us to add future nodes to the end of 'previousNode'. We start at 1 to avoid the head of the linked list
         */
        for (int i = 1; i < left; i++) {
            previousNode = previousNode.next;
        }

        ListNode start = previousNode.next;
        Stack<ListNode> nodeStack = new Stack<>();

        /*
        For our first pass, we traverse from the 'left' pointer to the 'right' pointer and push nodes onto the stack
        This, at the end of the pass, will assign the value of 'start' to the end of the linked list. This will allow us to combine the
        modified linked list together at the end of the algorithm
         */
        for (int i = left; i <= right; i++) {
            nodeStack.push(start);
            start = start.next;
        }

        /*
        For our second pass, we pop nodes from the stack and reassign them in reverse order. Because previousNode is currently pointing at the
        start of 'left', we only have to pop each of the stack elements off the stack and attach them as subsequent nodes onto previousNode
         */
        while (!(nodeStack.isEmpty())) {
            previousNode.next = nodeStack.pop();
            previousNode = previousNode.next;
        }

        previousNode.next = start;

        return newList.next;
    }
}
