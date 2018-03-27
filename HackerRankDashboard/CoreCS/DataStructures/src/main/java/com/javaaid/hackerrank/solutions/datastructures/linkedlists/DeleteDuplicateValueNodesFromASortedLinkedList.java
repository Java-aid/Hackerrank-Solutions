/**
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.linkedlists;

/**
 * @author Kanahaiya Gupta
 *
 */
public class DeleteDuplicateValueNodesFromASortedLinkedList {
	class Node {
		int data;
		Node next;
	}

	Node RemoveDuplicates(Node head) {
		Node current = head;
		
		while (current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
				continue;
			} else {
				current = current.next;
			}
		}
		return head;
	}
}