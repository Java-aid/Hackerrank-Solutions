/**
 * 
 * Problem Statement-
 * [Compare two linked lists](https://www.hackerrank.com/challenges/compare-two-linked-lists/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.linkedlists;

/**
 * @author Kanahaiya Gupta
 *
 */
public class CompareTwoLinkedLists {
	class Node {
		int data;
		Node next;
	}

	int CompareLists(Node headA, Node headB) {
		while (headA != null && headB != null) {
			if (headA.data != headB.data) {
				return 0;

			} else {
				headA = headA.next;
				headB = headB.next;
			}

		}

		if ((headA == null) && (headB == null)) {
			return 1;
		} else {
			return 0;

		}
	}
}
