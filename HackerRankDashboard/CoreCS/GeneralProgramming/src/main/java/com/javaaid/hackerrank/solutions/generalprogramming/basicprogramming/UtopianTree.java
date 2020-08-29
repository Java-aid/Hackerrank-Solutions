/**
 * 
 * Problem Statement-
 * [Utopian Tree](https://www.hackerrank.com/challenges/utopian-tree/problem) 
 * [Tutorial](https://youtu.be/C0YaIr8_mQU) 
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class UtopianTree {

	// Complete the utopianTree function below.
	static int utopianTree(int n) {
		return (1 << ((n >> 1) + 1)) - 1 << n % 2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int cycle = sc.nextInt();
			System.out.println(utopianTree(cycle));

		}
		sc.close();
	}
}