/**
 * 
 * Problem Statement-
 * [Cycle Detection](https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.linkedlists;

/**
 * @author Kanahaiya Gupta
 *
 */
public class CycleDetection {

	class Node {
		int data;
		Node next;
	}

	int HasCycle(Node head) {

		Node p1 = head, p2 = head;

		while (p1 != null && p1.next != null && p2 != null) {
			p1 = p1.next;
			p2 = p2.next.next;
			{
				if (p1 == p2)
					return 1;
			}
		}
		return 0;
	}
}
