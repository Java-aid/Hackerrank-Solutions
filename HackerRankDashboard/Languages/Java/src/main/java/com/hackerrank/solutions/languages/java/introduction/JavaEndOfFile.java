/**
 * 
 */
package com.hackerrank.solutions.languages.java.introduction;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class JavaEndOfFile {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = 1;
		while (s.hasNext()) {
			System.out.println(i++ + " " + s.nextLine());
		}
	}
}