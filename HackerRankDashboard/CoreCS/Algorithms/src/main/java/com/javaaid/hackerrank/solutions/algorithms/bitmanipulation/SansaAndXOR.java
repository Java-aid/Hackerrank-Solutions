/**
 * 
 * Problem Statement-
 * [Sansa and XOR](https://www.hackerrank.com/challenges/sansa-and-xor/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.bitmanipulation;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class SansaAndXOR {
	static int sansaXor(int[] arr) {
		int res = 0;
		int len = arr.length;
		if ((len ^ 1) == 0)
			return 0;
		for (int i = 0; i < arr.length; i++) {
			if ((i & 1) == 1)
				res ^= arr[i];
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int[] arr = new int[n];
			for (int arr_i = 0; arr_i < n; arr_i++) {
				arr[arr_i] = in.nextInt();
			}
			int result = sansaXor(arr);
			System.out.println(result);
		}
		in.close();
	}
}
