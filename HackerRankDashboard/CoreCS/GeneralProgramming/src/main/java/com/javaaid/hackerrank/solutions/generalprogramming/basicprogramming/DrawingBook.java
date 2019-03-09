/**
 * 
 * Problem Statement-
 * [Drawing Book](https://www.hackerrank.com/challenges/drawing-book/problem)        
 * [Tutorial](https://youtu.be/aM2Y2PeXrhk)
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class DrawingBook {

	static int pageCount(int n, int p) {

		int totalPageTurnCountFromFront = n / 2;
		int targetPageTurnCountFromFront = p / 2;
		int targetPageTurnCountFromBack = totalPageTurnCountFromFront - targetPageTurnCountFromFront;

		return Math.min(targetPageTurnCountFromFront, targetPageTurnCountFromBack);

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		System.out.println(pageCount(n, p));
		in.close();
	}
}
