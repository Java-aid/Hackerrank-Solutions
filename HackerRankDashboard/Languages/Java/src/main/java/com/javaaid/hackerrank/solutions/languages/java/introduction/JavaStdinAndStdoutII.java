package com.javaaid.hackerrank.solutions.languages.java.introduction;

import java.util.Scanner;

/**
 * 
 * @author Kanahaiya Gupta
 *
 */
public class JavaStdinAndStdoutII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		double d = sc.nextDouble();
		sc.nextLine();
		String s = sc.nextLine();
		sc.close();
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}
}
