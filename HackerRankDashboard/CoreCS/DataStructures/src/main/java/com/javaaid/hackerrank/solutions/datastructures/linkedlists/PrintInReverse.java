/**
 * 
 * Problem Statement-
 * [Print in Reverse](https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.linkedlists;

/**
 * @author Kanahaiya Gupta
 *
 */
public class PrintInReverse {
	class Node {
		int data;
		Node next;
	}

	void ReversePrint(Node head) {
		if (head != null) {
			ReversePrint(head.next);
			System.out.println(head.data);
		}
	}

}
