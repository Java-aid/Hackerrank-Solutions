/**
 * 
 * Problem Statement-
 * [MoreLinkedLists](https://www.hackerrank.com/challenges/30-linked-list-deletion/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.thirtydaysofcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Day24MoreLinkedLists {
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

	}

	public static Node removeDuplicates(Node head) {
		if (head == null)
			return head;
		Set<Integer> s = new HashSet<Integer>();
		Node node = head;
		s.add(node.data);
		Node newNode = new Node(node.data);
		node = node.next;
		Node newHead = newNode;
		while (node != null) {
			if (!s.contains(node.data)) {
				s.add(node.data);
				newNode.next = new Node(node.data);
				newNode = newNode.next;
			}
			node = node.next;
		}
		return newHead;

	}

	public static Node insert(Node head, int data) {
		Node p = new Node(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			Node start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);
		sc.close();
	}
}
