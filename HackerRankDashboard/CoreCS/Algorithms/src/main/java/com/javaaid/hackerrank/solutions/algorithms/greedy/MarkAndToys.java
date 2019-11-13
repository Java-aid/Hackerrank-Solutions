/**
 * 
 * Problem Statement-
 * [Mark and Toys](https://www.hackerrank.com/challenges/mark-and-toys/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class MarkAndToys {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int K = in.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		int toyCount = 0, sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			if (sum <= K) {
				toyCount++;
			} else {
				break;
			}
		}
		System.out.println(toyCount);
		in.close();
	}
}
