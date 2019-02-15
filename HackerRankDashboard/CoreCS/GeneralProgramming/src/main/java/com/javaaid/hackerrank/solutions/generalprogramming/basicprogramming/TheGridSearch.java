/**
 * 
 * Problem Statement-
 * [The Grid Search](https://www.hackerrank.com/challenges/the-grid-search/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class TheGridSearch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int R = in.nextInt();
			int C = in.nextInt();
			String[] G = new String[R];
			for (int G_i = 0; G_i < R; G_i++) {
				G[G_i] = in.next();
			}
			int r = in.nextInt();
			int c = in.nextInt();
			String[] P = new String[r];
			for (int P_i = 0; P_i < r; P_i++) {
				P[P_i] = in.next();
			}

			System.out.println(patternExist(R, G, P) ? "YES" : "NO");

		}
		in.close();
	}

	/**
	 * @param n
	 * @param grid
	 * @param pattern
	 */
	private static boolean patternExist(int n, String[] grid, String[] pattern) {
		int pLen = pattern.length;
		int gLen = grid.length;

		if (pLen > gLen)
			return false;

		for (int gRow = 0; gRow < gLen - pLen + 1; gRow++) {
			String p = pattern[0];
			String text = grid[gRow];
			for (int gCol = 0; gCol < grid[gRow].length() - p.length() + 1; gCol++) {
				int index = text.indexOf(p, gCol);
				if (index != -1) {
					if (validateStringRecursivelly(grid, pattern, index, p.length(), gRow, 0)) {
						return true;
					}
				} else {
					break;
				}

			}
		}

		return false;
	}

	/**
	 * @param grid
	 * @param pattern
	 * @param index
	 * @param length
	 * @return
	 */
	private static boolean validateStringRecursivelly(String[] grid, String[] pattern, int index, int length, int gRow,
			int pRow) {
		if (!grid[gRow].substring(index, index + length).equals(pattern[pRow]))
			return false;
		if (pattern.length - 1 == pRow)
			return true;
		return validateStringRecursivelly(grid, pattern, index, length, gRow + 1, pRow + 1);
	}

}
