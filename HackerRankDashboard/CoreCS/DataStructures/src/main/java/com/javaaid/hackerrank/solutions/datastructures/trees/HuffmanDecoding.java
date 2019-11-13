/**
 * 
 * Problem Statement-
 * [Huffman Decoding](https://www.hackerrank.com/challenges/tree-huffman-decoding/problem)   
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.trees;

/**
 * @author Kanahaiya Gupta
 *
 */
public class HuffmanDecoding {
	class Node {
		public int frequency; // the frequency of this tree
		public char data;
		public Node left, right;
	}

	void decode(String S, Node root) {
		Node currentRoot = root;
		if (root == null)
			return;
		char[] a = S.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == '0')
				currentRoot = currentRoot.left;
			else
				currentRoot = currentRoot.right;
			if (currentRoot.left == null || currentRoot.right == null) {
				System.out.print(currentRoot.data);
				currentRoot = root;
			}

		}
	}
}
