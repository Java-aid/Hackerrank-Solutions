/**
 * 
 * Problem Statement-
 * [Fair Rations](https://www.hackerrank.com/challenges/fair-rations/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class FairRations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int B[] = new int[N];
		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		int result = getMinLoaveCount(B);
		System.out.println(result != -1 ? result : "NO");
		sc.close();
	}

	/**
	 * @return
	 */
	private static int getMinLoaveCount(int B[]) {
		int minLovesCount = 0, sum = 0;
		for (int i = 0; i < B.length; i++) {
			sum += B[i];

			if (sum % 2 == 1) {
				minLovesCount += 2;
			}
		}

		return ((sum & 1) == 1) ? -1 : minLovesCount;
	}
}
