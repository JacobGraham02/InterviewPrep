package com.jacobdgraham.DailyCodingProblem;

public class RemoveKthLastElement {

    Node createNodes() {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node node5 = new Node(50);
        Node node6 = new Node(60);
        Node node7 = new Node(70);
        Node node8 = new Node(80);
        Node node9 = new Node(90);
        Node node10 = new Node(100);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = null;

        Node currentNode = node1;
        return currentNode;
    }

    /**
     * Given a singly linked list and an integer k, remove the kth last element from the list. k is guaranteed to be smaller than the length of the list.
        The list is very long, so making more than one pass is prohibitively expensive.
        Do this in constant space and in one pass.
        Because k is guaranteed to be smaller than the list, we do not need to do any boundary checks before we begin to traverse the list
        @param k the kth Node to remove from the list of Nodes
     */
    Node removeKthNode(Node nodes, final int k) {
        Node firstNode = nodes;
        Node kthLastNode = nodes;
        Node previousNode = null;

        /*
         * Move the first Node k steps ahead, which will let us have the node right before the one we want to remove
         */
        for (int i = 0; i < k; i++) {
            firstNode = firstNode.next;
        }

        /*
         * Traverse the Node list until firstNode reaches the end of the list, allowing us to fetch the Node we want to remove, and the Node previous to that
         */
        while (firstNode != null) {
            firstNode = firstNode.next;
            previousNode = kthLastNode;
            kthLastNode = kthLastNode.next;
        }

        /*
         * kthLastNode is the kth last node, previousNode is the node before the kth node. We have to remove kthLastNode from the list.
         * If previousNode is null, that means the head node must be removed
         */
        if (previousNode != null) {
            previousNode.next = kthLastNode.next;
        } else {
            nodes = nodes.next;
        }
        return nodes;
    }

    String listToString(Node head) {
        StringBuilder sb = new StringBuilder();
        Node currentNode = head;
        while (currentNode != null) {
            sb.append(currentNode.value).append(" -> ");
            currentNode = currentNode.next;
        }
        sb.append("null");
        return sb.toString();
    }
}
