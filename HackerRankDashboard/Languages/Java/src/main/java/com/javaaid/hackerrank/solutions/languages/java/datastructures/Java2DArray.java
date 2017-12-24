/**
 * 
 */
package com.javaaid.hackerrank.solutions.languages.java.datastructures;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Java2DArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		int maxSum = Integer.MIN_VALUE, sum = 0;
		;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if ((i + 2 < 6) && (j + 2) < 6) {
					sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
							+ arr[i + 2][j + 1] + arr[i + 2][j + 2];
					if (sum > maxSum)
						maxSum = sum;
				}
			}
		}
		System.out.println(maxSum);
		in.close();
	}
}
