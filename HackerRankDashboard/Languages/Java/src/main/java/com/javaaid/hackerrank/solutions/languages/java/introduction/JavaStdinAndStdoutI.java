package com.javaaid.hackerrank.solutions.languages.java.introduction;

import java.util.Scanner;

/**
 * 
 * @author Kanahaiya Gupta
 *
 */
public class JavaStdinAndStdoutI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}
}
