/**
 * 
 * Problem Statement-
 * [Pangrams](https://www.hackerrank.com/challenges/pangrams/problem)
 * 
 */
package org.javaaid.hackerrank.solutions.implementation.bruteforce;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Pangrams {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine().toLowerCase();
		boolean found = true;
		for (int i = 97; i <= 122; i++) {
			char ch = (char) i;
			if (line.indexOf(ch) == -1) {
				found = false;
				break;
			}
		}
		System.out.println(found ? "pangram" : "not pangram");
		sc.close();
	}

}
