/**
 * 
 * Problem Statement-
 * [Service Lane](https://www.hackerrank.com/challenges/service-lane/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class ServiceLane {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < q; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			int min = Integer.MAX_VALUE;
			for (int k = b; k <= c; k++) {
				min = Math.min(min, a[k]);
			}
			System.out.println(min);
		}
		sc.close();
	}

}
