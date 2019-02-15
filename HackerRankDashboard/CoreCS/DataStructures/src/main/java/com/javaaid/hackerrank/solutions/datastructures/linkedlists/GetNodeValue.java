/**
 * 
 * Problem Statement-
 * [Get Node Value](https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.linkedlists;

/**
 * @author Kanahaiya Gupta
 *
 */
public class GetNodeValue {
	class Node {
		int data;
		Node next;
	}

	int GetNode(Node head, int n) {
		Node p1 = head;
		Node p2 = head;

		for (int i = 0; i < n; i++) {
			p1 = p1.next;
		}

		while (p1.next != null) {
			p2 = p2.next;
			p1 = p1.next;
		}
		return p2.data;

	}

}
