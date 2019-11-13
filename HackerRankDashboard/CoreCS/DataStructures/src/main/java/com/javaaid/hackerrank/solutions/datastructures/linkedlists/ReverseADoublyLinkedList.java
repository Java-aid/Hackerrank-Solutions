/**
 * 
 * Problem Statement-
 * [Reverse a doubly linked list](https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.linkedlists;

/**
 * @author Kanahaiya Gupta
 *
 */
public class ReverseADoublyLinkedList {
	class Node {
		int data;
		Node next;
		Node prev;
	}

	Node Reverse(Node head) {
		Node current = head;

		Node temp = new Node();

		while (current != null) {

			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			head = current;
			current = current.prev;
		}

		return head;
	}
}
