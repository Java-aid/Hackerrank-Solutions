/**
 * 
 */
package com.hackerrank.solutions.datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Kanahaiya Gupta
 *
 */
public class EqualStacks {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		int h1[] = new int[n1];
		for (int h1_i = 0; h1_i < n1; h1_i++) {
			h1[h1_i] = in.nextInt();
		}
		int h2[] = new int[n2];
		for (int h2_i = 0; h2_i < n2; h2_i++) {
			h2[h2_i] = in.nextInt();
		}
		int h3[] = new int[n3];
		for (int h3_i = 0; h3_i < n3; h3_i++) {
			h3[h3_i] = in.nextInt();
		}

		Stack<Long> st1 = new Stack<Long>();
		Stack<Long> st2 = new Stack<Long>();
		Stack<Long> st3 = new Stack<Long>();
		long sum1 = 0, sum2 = 0, sum3 = 0;
		for (int i = h1.length - 1; i >= 0; i--) {
			sum1 += h1[i];
			st1.push(sum1);
		}
		for (int i = h2.length - 1; i >= 0; i--) {
			sum2 += h2[i];
			st2.push(sum2);
		}
		for (int i = h3.length - 1; i >= 0; i--) {
			sum3 += h3[i];
			st3.push(sum3);
		}

		boolean found = false;
		if (n1 <= n2 && n1 <= n3) {
			while (!st1.isEmpty()) {
				long top = st1.pop();
				if (st2.contains(top) && st3.contains(top)) {
					System.out.println(top);
					found = true;
					break;
				}
			}

		} else if (n2 <= n3 && n2 <= n1) {
			while (!st2.isEmpty()) {
				long top = st2.pop();
				if (st1.contains(top) && st3.contains(top)) {
					System.out.println(top);
					found = true;
					break;
				}
			}

		} else if (n3 <= n1 && n3 <= n2) {
			while (!st3.isEmpty()) {
				long top = st3.pop();
				if (st2.contains(top) && st1.contains(top)) {
					System.out.println(top);
					found = true;
					break;
				}
			}
		}
		if (!found) {
			System.out.println("0");
		}

	}
}
