/**
 * 
 * Problem Statement-
 * [Insert a Node at the Tail of a Linked List](https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list)
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.linkedlists;

/**
 * @author Kanahaiya Gupta
 *
 */
public class InsertANodeAtTheTailOfALinkedList {
	class Node {
		int data;
		Node next;
	}

	Node Insert(Node head, int data) {
		Node current = head;
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;

		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;

		return head;
	}

}
