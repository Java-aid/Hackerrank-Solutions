/**
 * 
 * Problem Statement-
 * [Hello, World](https://www.hackerrank.com/challenges/30-hello-world)
 * 
 */
//No need of package on hackerrank else it will throw do comment this by putting// this package staement.
package com.javaaid.hackerrank.solutions.thirtydaysofcode;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Day0HelloWorld {
	public static void main(String[] args) {
		// Create a Scanner object to read input from stdin.
		Scanner scan = new Scanner(System.in);

		// Read a full line of input from stdin and save it to our variable,
		// inputString.
		String inputString = scan.nextLine();

		// Close the scanner object, because we've finished reading
		// all of the input from stdin needed for this challenge.
		scan.close();

		// Print a string literal saying "Hello, World." to stdout.
		System.out.println("Hello, World.");

		System.out.println(inputString);

	}
}
