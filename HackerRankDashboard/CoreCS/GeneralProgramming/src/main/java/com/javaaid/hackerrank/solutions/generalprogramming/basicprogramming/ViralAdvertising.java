/**
 * 
 * Problem Statement-
 * [Viral Advertising](https://www.hackerrank.com/challenges/strange-advertising/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class ViralAdvertising {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int p = 5;
		for (int i = 0; i < n; i++) {
			p = (int) Math.floor(p / 2);
			sum += p;
			p = p * 3;
		}
		System.out.println(sum);
		sc.close();
	}
}
