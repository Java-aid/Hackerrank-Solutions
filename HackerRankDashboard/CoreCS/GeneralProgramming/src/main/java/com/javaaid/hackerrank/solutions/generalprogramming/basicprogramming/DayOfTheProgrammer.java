/**
 * 
 * Problem Statement-
 * [Day of the Programmer](https://www.hackerrank.com/challenges/day-of-the-programmer/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class DayOfTheProgrammer {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		int d = 243;
		if (y >= 1700 && y <= 1917) {
			if (y % 4 == 0) {
				d = 244;
			}
		} else if (y >= 1919 && y <= 2700) {
			if (y % 400 == 0 || (y % 100 != 0 && y % 4 == 0)) {
				d = 244;
			}
		} else if (y == 1918) {
			d = 230;
		}
		int r = 256 - d;
		String date = r + "." + 9 + "." + y;
		System.out.println(sdf.format(sdf.parse(date)));
		sc.close();
	}
}
