/**
 * 
 * Problem Statement-
 * [Contacts](https://www.hackerrank.com/challenges/contacts)   
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.tries;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 
 * @author Kanahaiya Gupta
 *
 */
public class Contacts {

	public static void main(String[] args) {
		TST<Integer> tst = new TST<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String op = sc.next();
			String name = sc.next();
			if (op.equals("add")) {
				tst.put(name, i);
			} else {
				System.out.println(tst.keyWithPrefix(name).size());
			}
		}
		sc.close();
	}

}

class TST<Value> {
	private Node root;

	private class Node {
		private Value val;
		private char c;
		private Node left, mid, right;
	}

	public void put(String key, Value val) {
		root = put(root, key, val, 0);
	}

	/**
	 * @param x
	 * @param key
	 * @param val
	 * @param d
	 * @return
	 */
	private Node put(Node x, String key, Value val, int d) {
		char c = key.charAt(d);
		if (x == null) {
			x = new Node();
			x.c = c;
		}
		if (c < x.c)
			x.left = put(x.left, key, val, d);
		else if (c > x.c)
			x.right = put(x.right, key, val, d);
		else if (d < key.length() - 1)
			x.mid = put(x.mid, key, val, d + 1);
		else
			x.val = val;
		return x;
	}

	/**
	 * @param root2
	 * @param key
	 * @param i
	 * @return
	 */
	private Node get(Node x, String key, int d) {
		if (x == null)
			return null;
		char c = key.charAt(d);
		if (c < x.c)
			return get(x.left, key, d);
		else if (c > x.c)
			return get(x.right, key, d);
		else if (d < key.length() - 1)
			return get(x.mid, key, d + 1);
		else
			return x;
	}

	/**
	 * @param root2
	 * @param string
	 * @param queue
	 */
	private void collect(Node x, StringBuilder prefix, Queue<String> q) {
		if (x == null)
			return;
		collect(x.left, prefix, q);
		if (x.val != null)
			q.offer(prefix.toString() + x.c);
		collect(x.mid, prefix.append(x.c), q);
		prefix.deleteCharAt(prefix.length() - 1);
		collect(x.right, prefix, q);
	}

	public Queue<String> keyWithPrefix(String prefix) {
		Queue<String> queue = new LinkedList<String>();
		Node x = get(root, prefix, 0);
		if (x == null)
			return queue;
		if (x.val != null)
			queue.offer(prefix);
		collect(x.mid, new StringBuilder(prefix), queue);
		return queue;
	}

}
