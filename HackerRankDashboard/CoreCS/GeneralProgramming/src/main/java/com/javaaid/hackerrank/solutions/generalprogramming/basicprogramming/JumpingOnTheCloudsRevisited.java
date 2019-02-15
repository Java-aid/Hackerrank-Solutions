/**
 * 
 * Problem Statement-
 * [Jumping on the Clouds: Revisited](https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class JumpingOnTheCloudsRevisited {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int E = 100;
		int k = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		if (k == n) {
			E = E - 3;
		} else {
			if (a[k] == 1) {
				E = E - 3;
			} else {
				E = E - 1;
			}
			for (int i = k; (i + k) % n != 0; i = (i + k)) {
				if (a[(i + k) % n] == 1) {
					E = E - 3;
				} else if (a[(i + k) % n] == 0) {
					E = E - 1;
				}
			}
			if (a[0] == 1) {
				E = E - 3;
			} else {
				E = E - 1;
			}
		}
		System.out.println(E);
		sc.close();
	}
}
