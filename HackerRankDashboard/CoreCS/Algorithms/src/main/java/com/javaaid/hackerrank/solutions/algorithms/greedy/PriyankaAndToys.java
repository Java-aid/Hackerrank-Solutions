/**
 * 
 * Problem Statement-
 * [Priyanka and Toys](https://www.hackerrank.com/challenges/priyanka-and-toys/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class PriyankaAndToys {
	static int toys(int[] w) {
		Arrays.sort(w);
		int containerCouter = 1, weightLimit = w[0];
		for (int i = 0; i < w.length; i++) {
			if (w[i] > weightLimit + 4) {
				weightLimit = w[i];
				containerCouter++;
			}
		}
		return containerCouter;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] w = new int[n];
		for (int w_i = 0; w_i < n; w_i++) {
			w[w_i] = in.nextInt();
		}
		int result = toys(w);
		System.out.println(result);
		in.close();
	}
}
