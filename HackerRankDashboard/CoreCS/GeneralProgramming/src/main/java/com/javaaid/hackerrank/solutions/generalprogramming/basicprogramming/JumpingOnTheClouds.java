/**
 * 
 * Problem Statement-
 * [Jumping on the Clouds](https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem)   
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class JumpingOnTheClouds {

	// version1- V1
	static int jumpingOnCloudsV1(int[] c) {
		int len = c.length;
		int count = -1;

		for (int i = 0; i < len;) {
			if (i + 2 < len && c[i + 2] == 0) {
				i = i + 2;
			} else {
				i++;
			}

			count++;
		}
		return count;
	}

	// version1- V2
	static int jumpingOnCloudsV2(int[] c) {
		int len = c.length;
		int count = -1;

		for (int i = 0; i < len;) {
			if (i + 2 < len && c[i + 2] == 0) {
				i++;
			}
			i++;
			count++;
		}
		return count;
	}

	// final version
	static int jumpingOnClouds(int[] c) {
		int len = c.length;
		int count = -1;

		for (int i = 0; i < len; i++, count++) {
			if (i + 2 < len && c[i + 2] == 0) {
				i++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c[] = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		int ans = jumpingOnCloudsV1(c);
		System.out.println(ans);
		sc.close();
	}
}
