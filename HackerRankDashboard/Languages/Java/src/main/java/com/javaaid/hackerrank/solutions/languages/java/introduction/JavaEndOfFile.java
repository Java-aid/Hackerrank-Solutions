/**
 * 
 */
package com.javaaid.hackerrank.solutions.languages.java.introduction;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class JavaEndOfFile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while (sc.hasNext()) {
			System.out.println(i++ + " " + sc.nextLine());
		}
		sc.close();
	}
}