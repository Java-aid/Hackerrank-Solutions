/**
 * 
 * Problem Statement-
 * [Generics](https://www.hackerrank.com/challenges/30-generics/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.thirtydaysofcode;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */

class Printer<T> {
	void printArray(T[] inputArray) {

		for (T t : inputArray) {

			System.out.println(t);
		}
	}
}

public class Day21Generics {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] intArray = new Integer[n];
		for (int i = 0; i < n; i++) {
			intArray[i] = sc.nextInt();
		}

		n = sc.nextInt();
		String[] stringArray = new String[n];
		for (int i = 0; i < n; i++) {
			stringArray[i] = sc.next();
		}

		Printer<Integer> intPrinter = new Printer<Integer>();
		Printer<String> stringPrinter = new Printer<String>();
		intPrinter.printArray(intArray);
		stringPrinter.printArray(stringArray);
		if (Printer.class.getDeclaredMethods().length > 1) {
			System.out.println("The Printer class should only have 1 method named printArray.");
		}
		sc.close();
	}
}