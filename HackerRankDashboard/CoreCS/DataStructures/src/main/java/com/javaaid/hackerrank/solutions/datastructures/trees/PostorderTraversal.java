/**
 * 
 * Problem Statement-
 * [Postorder Traversal](https://www.hackerrank.com/challenges/tree-postorder-traversal)   
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.trees;

/**
 * @author Kanahaiya Gupta
 *
 */
public class PostorderTraversal {
	class Node {
		int data;
		Node left;
		Node right;
	}

	void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");

		}
	}
}
