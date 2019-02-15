/**
 * 
 * Problem Statement-
 * [Cats and a Mouse](https://www.hackerrank.com/challenges/cats-and-a-mouse/problem)     
 * [Tutorial](https://youtu.be/WyyirZT5oik)         
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class CatsAndAMouse {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			int x = in.nextInt();
			int y = in.nextInt();
			int z = in.nextInt();
			int a = Math.abs(x - z);
			int b = Math.abs(y - z);
			if (a == b) {
				System.out.println("Mouse C");
			} else if (a > b) {
				System.out.println("Cat B");
			} else if (a < b) {
				System.out.println("Cat A");
			}

		}
		in.close();
	}
}
