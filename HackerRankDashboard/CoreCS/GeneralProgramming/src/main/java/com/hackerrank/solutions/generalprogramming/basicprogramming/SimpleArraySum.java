/**
 * 
 */
package com.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class SimpleArraySum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfElements = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < noOfElements; i++) {
			sum = sum + sc.nextInt();
		}
		System.out.println(sum);

	}
}