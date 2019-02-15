/**
 * 
 * Problem Statement-
 * [Largest Rectangle](https://www.hackerrank.com/challenges/largest-rectangle/problem)    
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Kanahaiya Gupta
 *
 */
public class LargestRectangle {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		int n = sc.nextInt();
		int maxArea = 0;
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}

		for (int i = 0; i <= a.length; i++) {
			int h = (i == a.length) ? 0 : a[i];
			if (st.isEmpty() || a[st.peek()] <= h) {
				st.push(i);

			} else {
				int tp = st.pop();
				maxArea = Math.max(maxArea, a[tp] * (st.isEmpty() ? i : i - st.peek() - 1));
				i--;
			}

		}

		System.out.println(maxArea);
		sc.close();
	}

}
