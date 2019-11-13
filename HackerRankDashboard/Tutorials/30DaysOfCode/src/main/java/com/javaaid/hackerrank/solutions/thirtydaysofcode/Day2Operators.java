/**
 * 
 * Problem Statement-
 * [Operators](https://www.hackerrank.com/challenges/30-operators/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.thirtydaysofcode;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Day2Operators {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double mealCost = scan.nextDouble(); // original meal price
		int tipPercent = scan.nextInt(); // tip percentage
		int taxPercent = scan.nextInt(); // tax percentage
		scan.close();

		// Write your calculation code here.
		double tC = mealCost + (mealCost * tipPercent) / 100 + (mealCost * taxPercent) / 100;

		// cast the result of the rounding operation to an int and save it as totalCost
		int totalCost = (int) Math.round(tC);
		System.out.println("The total meal cost is " + totalCost + " dollars.");
		// Print your result
	}
}
