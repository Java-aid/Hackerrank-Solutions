/**
 * 
 * Problem Statement-
 * [2D Array - DS](https://www.hackerrank.com/challenges/2d-array)  
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.arrays;

import java.util.Scanner;

/**
 * 
 * @author Kanahaiya Gupta
 *
 */
public class TwoDArrayDS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int arr_i = 0; arr_i < 6; arr_i++) {
			for (int arr_j = 0; arr_j < 6; arr_j++) {
				arr[arr_i][arr_j] = in.nextInt();
			}
		}

		int maxsum = Integer.MIN_VALUE;
		for (int arr_i = 0; arr_i < 6; arr_i++) {
			for (int arr_j = 0; arr_j < 6; arr_j++) {

				if ((arr_j + 2) < 6 && (arr_i + 2) < 6) {
					int sum = arr[arr_i][arr_j] + arr[arr_i][arr_j + 1] + arr[arr_i][arr_j + 2]
							+ arr[arr_i + 1][arr_j + 1] + arr[arr_i + 2][arr_j] + arr[arr_i + 2][arr_j + 1]
							+ arr[arr_i + 2][arr_j + 2];
					if (sum > maxsum) {
						maxsum = sum;
					}
				}

			}
		}
		System.out.println(maxsum);
		in.close();
	}

}
