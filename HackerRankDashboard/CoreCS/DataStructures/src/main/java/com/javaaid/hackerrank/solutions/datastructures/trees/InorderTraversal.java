/**
 * 
 * Problem Statement-
 * [Inorder Traversal](https://www.hackerrank.com/challenges/tree-inorder-traversal)   
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.trees;

import java.util.Stack;

/**
 * 
 * @author Kanahaiya Gupta
 *
 */

public class InorderTraversal {

	class Node {
		int data;
		Node left;
		Node right;
	}

	void inOrder(Node root) {
		Stack<Node> st = new Stack<Node>();
		while (true) {
			while (root != null) {
				st.push(root);
				root = root.left;
			}
			if (st.empty())
				return;
			root = st.pop();
			System.out.print(root.data + " ");
			root = root.right;
		}
	}
}
