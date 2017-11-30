package com.hackerrank.solutions.datastructures.linkedlists;

/**
 * @author Kanahaiya Gupta
 *
 */
public class InsertANodeAtHeadOfAList {

	class Node {
		int data;
		Node next;
	}

	Node Insert(Node head, int x) {

		Node newNode = new Node();
		newNode.data = x;
		newNode.next = null;

		if (head == null) {
			head = newNode;

		} else {

			newNode.next = head;
			head = newNode;
		}

		return head;

	}

}
