/**
 * 
 * Problem Statement-
 * [Simple Text Editor](https://www.hackerrank.com/challenges/simple-text-editor/problem)   
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Kanahaiya Gupta
 *
 */
public class SimpleTextEditor {
	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = "";
		st.push("");
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			int op = sc.nextInt();
			switch (op) {
			case 1:
				str = st.peek() + sc.next();
				st.push(str);
				break;
			case 2:
				if (!st.isEmpty()) {
					str = st.peek().substring(0, st.peek().length() - sc.nextInt());
					st.push(str);
				}
				break;
			case 3:
				if (!st.isEmpty()) {
					str = st.peek();
					char c = str.charAt(sc.nextInt() - 1);
					System.out.println(c);
				}
				break;
			case 4:
				if (!st.isEmpty()) {
					st.pop();
				}
				break;

			}
		}
		sc.close();
	}

}
