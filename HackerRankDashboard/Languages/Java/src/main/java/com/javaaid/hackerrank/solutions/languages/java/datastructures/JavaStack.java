/**
 * 
 */
package com.javaaid.hackerrank.solutions.languages.java.datastructures;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Kanahaiya Gupta
 *
 */
public class JavaStack {
	private static boolean matchParenthisis(String str) {
		Stack<Character> st = new Stack<Character>();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (c == '{' || c == '[' || c == '(') {
				st.push(c);
			} else {
				if (c == ']' && !st.isEmpty() && st.pop() == '[') {
					continue;
				} else if (c == '}' && !st.isEmpty() && st.pop() == '{') {
					continue;
				} else if (c == ')' && !st.isEmpty() && st.pop() == '(') {
					continue;
				} else {
					return false;
				}
			}
		}

		return st.isEmpty();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String s = in.next();
			System.out.println(matchParenthisis(s));
		}
		in.close();
	}
}
