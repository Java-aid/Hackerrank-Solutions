/**
 * 
 * Problem Statement-
 * [QueuesAndStacks](https://www.hackerrank.com/challenges/30-queues-stacks/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.thirtydaysofcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Day18QueuesAndStacks {
	Stack<Character> st = new Stack<Character>();
	Queue<Character> q = new LinkedList<Character>();

	void pushCharacter(char ch) {
		st.push(ch);
	}

	void enqueueCharacter(char ch) {
		q.add(ch);
	}

	char popCharacter() {
		return st.pop();
	}

	char dequeueCharacter() {
		return q.poll();
	}
}
