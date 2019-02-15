/**
 * 
 * Problem Statement-
 * [Level Order Traversal](https://www.hackerrank.com/challenges/tree-level-order-traversal/problem)   
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Kanahaiya Gupta
 *
 */
public class LevelOrderTraversal {
	class Node {
		int data;
		Node left;
		Node right;
	}

	void levelOrder(Node root) {

		Queue<Node> q = new LinkedList<Node>();
		q.add(root);

		while (!q.isEmpty()) {

			Node currentNode = q.poll();
			System.out.print(currentNode.data + " ");
			if (currentNode.left != null)
				q.add(currentNode.left);
			if (currentNode.right != null)
				q.add(currentNode.right);
		}

	}
}
