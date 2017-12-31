/**
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class BirthdayCakeCandles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int a[] = new int[M];
		int max = Integer.MIN_VALUE;
		int maxCount = 0;
		for (int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
			if (a[i] >= max) {
				if (a[i] == max) {
					maxCount++;
				} else {
					max = a[i];
					maxCount = 1;
				}

			}
		}
		System.out.println(maxCount);
		sc.close();
	}

}
