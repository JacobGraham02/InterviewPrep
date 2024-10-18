package com.jacobdgraham.LeetcodeTopInterview150.LinkedList;

public class CopyListWithRandomPointer {
    /**
     * Creates a deep copy of a linked list where each node contains an additional random pointer.
     *
     * <p>The deep copy should consist of exactly <code>n</code> brand new nodes, where each new node has its value
     * set to the value of its corresponding original node. The <code>next</code> and <code>random</code> pointers of
     * the new nodes should point to new nodes in the copied list, maintaining the same list structure as the original.
     * None of the pointers in the new list should point to nodes in the original list.</p>
     *
     * <p>For example, if there are two nodes X and Y in the original list, where <code>X.random --> Y</code>, then
     * for the corresponding two nodes x and y in the copied list, <code>x.random --> y</code>.</p>
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: head = [[7, null], [13, 0], [11, 4], [10, 2], [1, 0]]
     * Output: [[7, null], [13, 0], [11, 4], [10, 2], [1, 0]]
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: head = [[1, 1], [2, 1]]
     * Output: [[1, 1], [2, 1]]
     * </pre>
     *
     * <p><strong>Example 3:</strong></p>
     * <pre>
     * Input: head = [[3, null], [3, 0], [3, null]]
     * Output: [[3, null], [3, 0], [3, null]]
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>0 <= n <= 1000</li>
     *   <li>-10<sup>4</sup> <= Node.val <= 10<sup>4</sup></li>
     *   <li><code>Node.random</code> is null or points to a node in the linked list.</li>
     * </ul>
     *
     * @param head the head node of the original linked list
     * @return the head of the deep-copied linked list
     * @see <a href="https://leetcode.com/problems/copy-list-with-random-pointer/">Leetcode problem</a>
     */
    public Node copyRandomList(Node head) {
        // Method implementation here
        return head;
    }
}
