/**
 * 
 * Problem Statement-
 * [Grading Students](https://www.hackerrank.com/challenges/grading/problem)          
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class GradingStudents {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int a0 = 0; a0 < n; a0++) {
			int grade = in.nextInt();
			System.out.println(grade < 38 || grade % 5 < 3 ? grade : grade + (5 - grade % 5));
			in.close();
		}
	}
}
