/**
 * 
 */
package com.javaaid.hackerrank.solutions.languages.java.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class JavaExceptionHandlingTryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = x / y;
			System.out.println(z);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (InputMismatchException e) {
			System.out.println(e.getClass().getName());
		} finally {
			sc.close();
		}
	}
}
