/**
 * 
 * Problem Statement-
 * [Stacks: Balanced Brackets](https://www.hackerrank.com/challenges/ctci-balanced-brackets/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.tutorials.ctci;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Kanahaiya Gupta
 *
 */
public class BalancedBrackets {
	private static String matchParenthisis(String str) {
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
					return "NO";
				}

			}
		}
		if (!st.isEmpty()) {
			return "NO";
		}

		return "YES";

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String s = in.next();
			System.out.println(matchParenthisis(s));
		}
		in.close();
	}
}
