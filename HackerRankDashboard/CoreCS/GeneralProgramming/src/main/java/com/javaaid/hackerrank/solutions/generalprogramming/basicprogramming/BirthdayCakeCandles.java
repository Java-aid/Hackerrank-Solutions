/**
 * 
 * Problem Statement-
 * [Birthday Cake Candles](https://www.hackerrank.com/challenges/birthday-cake-candles/problem)    
 * [Tutorial](https://youtu.be/1gxFE9EfanE)  
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class BirthdayCakeCandles {
	static int birthdayCakeCandles(int[] ar) {
		int maxCandleHeight = Integer.MIN_VALUE;
		int maxCandleFreqCount = 0;

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == maxCandleHeight) {
				maxCandleFreqCount++;
			}

			if (ar[i] > maxCandleHeight) {
				maxCandleHeight = ar[i];
				maxCandleFreqCount = 1;
			}

		}
		return maxCandleFreqCount;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int a[] = new int[M];
		for (int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(birthdayCakeCandles(a));
		sc.close();
	}

}
