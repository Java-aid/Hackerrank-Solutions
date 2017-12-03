/**
 * 
 */
package com.hackerrank.solutions.datastructures.trees;

/**
 * @author Kanahaiya Gupta
 *
 */
public class HeightOfABinaryTree {
	class Node {
		int data;
		Node left;
		Node right;
	}

	int height(Node root) {
		if (root == null)
			return 0;
		return (Math.max(height(root.left), height(root.right)) + 1);

	}

}
