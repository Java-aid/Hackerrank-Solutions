/**
 * 
 * Problem Statement-
 * [Insert a node at a specific position in a linked list](https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.linkedlists;

/**
 * @author Kanahaiya Gupta
 *
 */
public class InsertANodeAtASpecificPositionInALinkedList {

	class Node {
		int data;
		Node next;
	}

	Node InsertNth(Node head, int data, int position) {
		Node newNode = new Node();
		newNode.data = data;
		Node current = head;
		Node prev = current;
		int counter = 0;

		if (position == 0) {
			newNode.next = head;
			return newNode;

		} else {
			current = head.next;
			while (current != null) {
				if (++counter == position) {
					newNode.next = prev.next;
					prev.next = newNode;
					break;
				}
				prev = current;
				current = current.next;
			}

			if (current == null) {
				newNode.next = prev.next;
				prev.next = newNode;
			}
		}
		return head;

	}

}
