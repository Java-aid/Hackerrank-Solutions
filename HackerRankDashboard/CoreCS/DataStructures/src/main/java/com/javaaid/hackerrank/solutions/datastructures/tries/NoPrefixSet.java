/**
 * 
 * Problem Statement-
 * [No Prefix Set](https://www.hackerrank.com/challenges/no-prefix-set/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.tries;

import java.util.Scanner;
import com.javaaid.hackerrank.solutions.datastructures.tries.TSTPrefix.TrieNode;

/**
 * @author Kanahaiya Gupta
 *
 */

class TSTPrefix {

	static class TrieNode {
		char ch;
		int count;
		TrieNode[] children;
		boolean isCompleted = false;

		TrieNode(char ch) {
			this.ch = ch;
			children = new TrieNode[12];
		}

	}

	public boolean add(TrieNode root, String in) {
		TrieNode curr = root;
		for (int i = 0; i < in.length(); i++) {
			char c = in.charAt(i);
			int index = c - 'a';
			if (curr.children[index] == null)
				curr.children[index] = new TrieNode(c);
			if (curr.isCompleted)
				return false;
			curr.count++;
			curr = curr.children[index];
		}
		curr.isCompleted = true;
		return ++curr.count <= 1;

	}

}

public class NoPrefixSet {
	public static void main(String[] args) {
		TSTPrefix tst = new TSTPrefix();
		boolean found = false;
		TrieNode root = new TrieNode(' ');
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			String str = sc.next();
			if (!tst.add(root, str)) {
				System.out.println("BAD SET \n" + str);
				found = true;
				break;
			}

		}
		System.out.println(!found ? "GOOD SET" : "");
		sc.close();
	}
}
