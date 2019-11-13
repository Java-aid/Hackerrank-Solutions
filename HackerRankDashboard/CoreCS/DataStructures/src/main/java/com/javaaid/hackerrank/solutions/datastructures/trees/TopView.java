/**
 * 
 * Problem Statement-
 * [Top View](https://www.hackerrank.com/challenges/tree-top-view/problem)   
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.trees;

/**
 * @author Kanahaiya Gupta
 *
 */
public class TopView {
	class Node {
		int data;
		Node left;
		Node right;
	}

	void topView(Node root) {
		Node rootNode = root;

		if (rootNode == null)
			return;
		printLeft(rootNode.left);
		System.out.print(rootNode.data + " ");
		printright(rootNode.right);

	}

	void printLeft(Node rootNode) {
		if (rootNode == null)
			return;
		printLeft(rootNode.left);
		System.out.print(rootNode.data + " ");
	}

	void printright(Node rootNode) {
		if (rootNode == null)
			return;
		System.out.print(rootNode.data + " ");
		printright(rootNode.right);

	}

}
