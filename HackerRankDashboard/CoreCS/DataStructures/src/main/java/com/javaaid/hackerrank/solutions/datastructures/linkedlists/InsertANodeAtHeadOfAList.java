/**
 * 
 * Problem Statement-
 * [Insert a node at the head of a linked list](https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list)
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.linkedlists;

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
