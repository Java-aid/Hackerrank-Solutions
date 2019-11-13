/**
 * 
 * Problem Statement-
 * [Find Merge Point of Two Lists](https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.linkedlists;

/**
 * @author Kanahaiya Gupta
 *
 */
public class FindMergePointOfTwoLists {
	class Node {
		int data;
		Node next;
	}

	int FindMergeNode(Node headA, Node headB) {
		Node currentA = headA;
		Node currentB = headB;

		int lenA = 0, lenB = 0, d;

		while (currentA != null) {
			lenA++;
			currentA = currentA.next;
		}
		while (currentB != null) {
			lenB++;
			currentB = currentB.next;
		}

		if (lenA > lenB) {
			d = lenA - lenB;
		} else {
			d = lenB - lenA;
		}

		currentA = headA;
		currentB = headB;
		for (int i = 0; i < d; i++) {
			if (lenA > lenB) {
				currentA = currentA.next;
			} else {
				currentB = currentB.next;
			}

		}

		while (currentA != currentB) {
			currentA = currentA.next;
			currentB = currentB.next;
		}

		return currentA.data;
	}
}