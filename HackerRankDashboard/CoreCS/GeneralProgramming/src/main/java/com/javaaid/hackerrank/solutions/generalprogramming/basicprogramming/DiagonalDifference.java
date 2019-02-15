/**
 * 
 * Problem Statement-
 * [Diagonal Difference](https://www.hackerrank.com/challenges/diagonal-difference)
 * [Tutorial](https://youtu.be/f6bTIsj9ne8) 
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

/**
 * 
 * @author Kanahaiya Gupta
 *
 */
public class DiagonalDifference {
	
	static int diagonalDifference(int[][] arr) {
		int leftSum = 0, rightSum = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			leftSum += arr[i][i];
			rightSum += arr[i][n - 1 - i];
		}
		return (Math.abs(leftSum - rightSum));
	}
}
