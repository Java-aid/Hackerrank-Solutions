/**
 * 
 * Problem Statement-
 * [Inserting a Node Into a Sorted Doubly Linked List](https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.linkedlists;

/**
 * @author Kanahaiya Gupta
 *
 */
public class InsertingANodeIntoASortedDoublyLinkedList {

	class Node {
		int data;
		Node next;
		Node prev;
	}

	Node SortedInsert(Node head, int data) {
		Node header = head;
		Node newNode = new Node();
		newNode.data = data;
		newNode.prev = null;
		Node current = head;
		Node previous = current;

		if (header == null) {
			newNode.next = null;
			newNode.prev = null;
			header = newNode;
			return header;

		} else if (header.data > data) {
			newNode.next = header;
			header.prev = newNode;
			newNode.prev = null;
			header = newNode;
			return header;

		} else {
			while (current.next != null) {

				if (current.data < data) {

					previous = current;
					current = current.next;
					continue;
				}
				newNode.next = current;
				current.prev = newNode;
				previous.next = newNode;
				newNode.prev = previous;

			}

			if (current.next == null && current.data > data) {

				newNode.next = current;
				current.prev = newNode;
				previous.next = newNode;
				newNode.prev = previous;
			} else {
				newNode.next = null;
				current.next = newNode;
				newNode.prev = current;
			}

		}
		return header;
	}
}