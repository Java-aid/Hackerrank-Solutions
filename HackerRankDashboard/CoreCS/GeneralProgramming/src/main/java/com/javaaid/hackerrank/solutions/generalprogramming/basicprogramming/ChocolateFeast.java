/**
 * 
 * Problem Statement-
 * [Chocolate Feast](https://www.hackerrank.com/challenges/chocolate-feast/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class ChocolateFeast {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int c = sc.nextInt();
			int m = sc.nextInt();
			int q = n / c;
			int sum = 0;
			sum = q;
			while (q >= m) {
				int w = q / m;
				int r = q % m;
				sum += w;
				q = w + r;
			}
			System.out.println(sum);
		}
		sc.close();
	}

}
