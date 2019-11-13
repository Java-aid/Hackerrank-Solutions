/**
 * 
 * Problem Statement-
 * [Cavity Map](https://www.hackerrank.com/challenges/cavity-map/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class CavityMap {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] grid = new String[n];
		for (int i = 0; i < n; i++) {
			grid[i] = in.next();
		}

		for (int i = 1; i < grid.length - 1; i++) {
			String str = grid[i];
			for (int j = 1; j < grid.length - 1; j++) {
				if (str.charAt(j - 1) < str.charAt(j) && str.charAt(j) > str.charAt(j + 1)
						&& grid[i - 1].charAt(j) < str.charAt(j) && str.charAt(j) > grid[i + 1].charAt(j)) {
					grid[i] = grid[i].substring(0, j) + "X" + grid[i].substring(j + 1);
				}
			}
		}
		printArray(grid);
		in.close();
	}

	/**
	 * @param grid
	 */
	private static void printArray(String[] grid) {
		int n = grid.length;
		for (int grid_i = 0; grid_i < n; grid_i++) {
			System.out.println(grid[grid_i]);
		}
	}
}
