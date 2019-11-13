/**
 * 
 * Problem Statement-
 * [Merge two sorted linked lists](https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.linkedlists;

/**
 * @author Kanahaiya Gupta
 *
 */
public class MergeTwoSortedLinkedLists {
	class Node {
		int data;
		Node next;
	}

	Node MergeLists(Node headA, Node headB) {
		if (headA == null && headB == null)
			return null;
		else if (headA != null && headB == null)
			return headA;
		else if (headA == null && headB != null)
			return headB;
		else if (headA.data < headB.data) {
			headA.next = MergeLists(headA.next, headB);
			return headA;
		} else {
			headB.next = MergeLists(headA, headB.next);
			return headB;

		}
	}
}
