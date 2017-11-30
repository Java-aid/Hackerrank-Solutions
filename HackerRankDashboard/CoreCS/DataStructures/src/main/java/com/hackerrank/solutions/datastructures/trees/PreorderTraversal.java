package com.hackerrank.solutions.datastructures.trees;


/**
 * @author Kanahaiya Gupta
 *
 */
class PreorderTraversal {

	class Node {
		int data;
		Node left;
		Node right;
	}

	void preOrder(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);

	}
}
