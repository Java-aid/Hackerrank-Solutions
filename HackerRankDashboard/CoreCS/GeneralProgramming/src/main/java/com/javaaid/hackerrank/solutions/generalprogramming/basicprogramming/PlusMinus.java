/**
 * 
 * Problem Statement-
 * [Plus Minus](https://www.hackerrank.com/challenges/plus-minus)
 * [Tutorial](https://youtu.be/aLS4HYPfzUw) 
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * 
 * @author Kanahaiya Gupta
 *
 */
public class PlusMinus {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		float countPositive = 0;
		float countNegetive = 0;
		float countZero = 0;
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
			if (arr[arr_i] < 0) {
				countNegetive++;
			}
			if (arr[arr_i] > 0) {
				countPositive++;
			}
			if (arr[arr_i] == 0) {
				countZero++;
			}
		}
		System.out.printf("%1.6f \n", countPositive / n);
		System.out.printf("%1.6f \n", countNegetive / n);
		System.out.printf("%1.6f \n", countZero / n);
		in.close();
	}
}
