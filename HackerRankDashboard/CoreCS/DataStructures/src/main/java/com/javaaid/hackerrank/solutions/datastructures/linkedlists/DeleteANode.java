/**
 * 
 * Problem Statement-
 * [Delete a Node](https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.linkedlists;

/**
 * @author Kanahaiya Gupta
 *
 */
public class DeleteANode {

	class Node {
		int data;
		Node next;
	}

	Node Delete(Node head, int position) {

		Node current = head;
		Node prev = current;
		int counter = 0;

		if (head == null && position == 0) {
			return null;
		}
		if (position == 0 && head != null) {
			head = head.next;
			return head;
		} else {

			current = head.next;
			while (current != null) {

				if (++counter == position) {
					prev.next = current.next;
					break;
				}
				prev = current;
				current = current.next;
			}

		}
		return head;

	}

}
