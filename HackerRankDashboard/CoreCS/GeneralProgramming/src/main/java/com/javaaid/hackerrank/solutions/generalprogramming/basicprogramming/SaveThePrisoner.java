/**
 * 
 * Problem Statement-
 * [Save the Prisoner!](https://www.hackerrank.com/challenges/save-the-prisoner/problem)  
 * [Tutorial](https://youtu.be/LeNU3WjrV_w) 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class SaveThePrisoner {

	static int saveThePrisoner(int n, int m, int s) {
		int r = m % n;
		if ((r + s - 1) % n == 0) {
			return n;
		} else {
			return ((r + s - 1) % n);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int k = 0; k < T; k++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int S = sc.nextInt();
			System.out.println(saveThePrisoner(N, M, S));
		}
		sc.close();
	}

}
