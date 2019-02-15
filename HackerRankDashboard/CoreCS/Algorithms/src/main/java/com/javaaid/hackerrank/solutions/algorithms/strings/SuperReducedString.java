/**
 * 
 * Problem Statement-
 * [Super Reduced String](https://www.hackerrank.com/challenges/reduced-string/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.strings;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Kanahaiya Gupta
 *
 */
public class SuperReducedString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String value = getReducedString(s);
		System.out.println(value == "" ? "Empty String" : value);
		sc.close();
	}

	private static String getReducedString(String s) {
		char[] ch = s.toCharArray();
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < ch.length; i++) {
			if (st.empty()) {
				st.push(ch[i]);

			} else if (st.peek() == ch[i]) {
				st.pop();
			} else {
				st.push(ch[i]);

			}
		}
		String str = "";
		while (!st.isEmpty()) {
			str = st.pop() + str;
		}
		return str;
	}

}
