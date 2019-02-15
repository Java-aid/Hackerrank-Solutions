/**
 * 
 * Problem Statement-
 * [Save the Prisoner!](https://www.hackerrank.com/challenges/save-the-prisoner/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class SaveThePrisoner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int k = 0; k < T; k++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int S = sc.nextInt();
			int r = M % N;
			if ((S + r - 1) % N == 0) {
				System.out.println(N);
			} else {
				System.out.println((S + r - 1) % N);
			}
		}
		sc.close();
	}

}
