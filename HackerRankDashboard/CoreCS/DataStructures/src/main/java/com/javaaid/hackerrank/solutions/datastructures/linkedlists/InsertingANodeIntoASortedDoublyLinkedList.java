/**
 * 
 * Problem Statement-
 * [Inserting a Node Into a Sorted Doubly Linked List](https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.linkedlists;

/**
 * @author Kanahaiya Gupta
 *
 */
public class InsertingANodeIntoASortedDoublyLinkedList {

	class Node {
		int data;
		Node next;
		Node prev;
	}

	Node SortedInsert(Node head, int data) {
		Node temp = head;//have a copy of head, to return the DLL,after changes
		
		Node newNode = new Node();//create a new node
		newNode.data = data;//add data to it

		if (head == null) {//if DLL is empty,make newNode as head
			
			newNode.next = null; 
			newNode.prev = null;
			return newNode;

		} 
		
		if (head.data > data) {//if new_node is to be added in front of head
			
			newNode.next = head;
			head.prev = newNode;
			newNode.prev = null;
			return newNode;

		}
		
		
		//in while loop have null checking as first condition to prevent NullPointerException
		while (head.next != null && head.next.data<data) 
			head=head.next; 
			
		newNode.next=head.next;
		head.next=newNode;
		newNode.prev=head;
		
		return temp;
	}
}
