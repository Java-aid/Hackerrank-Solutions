/**
 * 
 * Problem Statement-
 * [Queue using Two Stacks](https://www.hackerrank.com/challenges/queue-using-two-stacks)  
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.queues;

import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * @author Kanahaiya Gupta
 *
 */
public class QueueUsingTwoStacks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		QueueWithTwoStack q = new QueueWithTwoStack();
		for (int i = 0; i < N; i++) {
			int qType = sc.nextInt();
			switch (qType) {
			case 1:
				q.enqueue(sc.nextInt());
				break;
			case 2:
				q.dequeue();
				break;
			case 3:
				q.front();
				break;

			default:
				break;
			}

		}
		sc.close();
	}

}

class QueueWithTwoStack {
	Stack<Integer> s1;
	Stack<Integer> s2;

	public QueueWithTwoStack() {
		super();
		this.s1 = new Stack<Integer>();
		this.s2 = new Stack<Integer>();
	}

	public void enqueue(int data) {
		s1.push(data);
	}

	public int dequeue() {
		if (s2.isEmpty()) {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		return s2.pop();

	}

	public void front() {
		if (s2.isEmpty()) {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		System.out.println(s2.peek());
	}

}
