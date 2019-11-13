/**
 * 
 * Problem Statement-
 * [Angry Professor](https://www.hackerrank.com/challenges/angry-professor/problem)        
 * [Tutorial](https://youtu.be/3hvzKDJQypI)        
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class AngryProfessor {
	
	
	static String angryProfessor(int k, int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= 0) {
				count++;
			}
		}
		return ((count >= k) ? "NO" : "YES");

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int k = in.nextInt();
			int a[] = new int[n];
			for (int a_i = 0; a_i < n; a_i++) {
				a[a_i] = in.nextInt();
			}
			System.out.println(angryProfessor(k, a));
		}

		in.close();
	}
}
