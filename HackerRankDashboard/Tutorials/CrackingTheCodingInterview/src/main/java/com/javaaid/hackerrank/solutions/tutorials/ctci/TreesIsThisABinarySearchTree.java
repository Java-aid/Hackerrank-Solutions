/**
 * 
 * Problem Statement-
 * [Trees: Is This a Binary Search Tree?](https://www.hackerrank.com/challenges/ctci-is-binary-search-tree/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.tutorials.ctci;

/**
 * @author Kanahaiya Gupta
 *
 */
public class TreesIsThisABinarySearchTree {
	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	boolean checkBST(Node root) {
		return checkBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	/**
	 * @param root
	 * @param minValue
	 * @param maxValue
	 * @return
	 */
	private boolean checkBSTUtil(Node root, int minValue, int maxValue) {
		if (root == null)
			return true;
		return (root.data > minValue && root.data < maxValue && checkBSTUtil(root.left, minValue, root.data)&& checkBSTUtil(root.right, root.data, maxValue));
	}

}
