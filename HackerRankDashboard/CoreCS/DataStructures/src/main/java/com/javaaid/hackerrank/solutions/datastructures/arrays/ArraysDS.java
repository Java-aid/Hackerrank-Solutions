/**
 * 
 * Problem Statement-
 * [Arrays - DS](https://www.hackerrank.com/challenges/arrays-ds)  
 * [Tutorial](https://youtu.be/u_oUMtj7C3k) 
 */
package com.javaaid.hackerrank.solutions.datastructures.arrays;

import java.util.Scanner;

/**
 * 
 * @author Kanahaiya Gupta
 *
 */
public class ArraysDS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		for (int arr_i = n - 1; arr_i >= 0; arr_i--) {
			System.out.print(arr[arr_i] + " ");
		}
		in.close();
	}
}
