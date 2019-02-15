/**
 * 
 * Problem Statement-
 * [The Time in Words](https://www.hackerrank.com/challenges/the-time-in-words/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class TheTimeInWords {
	public static void main(String[] args) {
		String[] words = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fiveten", "sixten", "seventen", "eighten", "ninten",
				"twenty" };
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();
		String str = m < 10 ? "minute" : "minutes";
		if (m == 0) {
			System.out.println(words[h] + " o' clock");
		} else if (m == 15) {
			System.out.println("quarter past " + words[h]);
		} else if (m == 30) {
			System.out.println("half past " + words[h]);
		} else if (m > 0 && m < 30) {
			String tmp = m <= 20 ? words[m] : words[20] + " " + words[m % 10];
			System.out.println(tmp + " " + str + " past " + words[h]);
		} else if (m == 45) {
			System.out.println("quarter to " + words[++h]);
		} else if (m > 30 && m < 60) {
			m = 60 - m;
			String tmp = m <= 20 ? words[m] : words[20] + " " + words[m % 10];
			System.out.println(tmp + " " + str + " to " + words[++h]);
		}
		in.close();
	}
}
