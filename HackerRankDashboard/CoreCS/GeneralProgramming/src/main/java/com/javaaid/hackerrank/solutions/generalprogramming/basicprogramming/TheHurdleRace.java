/**
 * 
 * Problem Statement-
 * [The Hurdle Race](https://www.hackerrank.com/challenges/the-hurdle-race/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class TheHurdleRace {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int sum = 0;
		for (int height_i = 0; height_i < n; height_i++) {
			int temp = in.nextInt();
			if (temp > k) {
				sum += (temp - k);
				k = temp;
			}
		}
		System.out.println(sum);
		in.close();
	}
}
