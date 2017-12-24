package com.javaaid.hackerrank.solutions.datastructures.linkedlists;

/**
 * 
 * @author Kanahaiya Gupta
 *
 */
class PrintTheElementsOfALinkedList {

	class Node {
		int data;
		Node next;
	}

	void Print(Node head) {
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}

	}
}
