/**
 * 
 */
package com.javaaid.hackerrank.solutions.languages.java.strings;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class JavaStringTokens {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		boolean found = false;
		for (int i = 0; i < s.length(); i++) {
			int t = s.charAt(i);
			if (65 <= t && t <= 90 || t >= 97 && t <= 112) {
				found = true;
				break;
			}
		}
		if (found) {
			String[] str = s.split("[, '@_.?!]+");
			int length = str.length;
			if (str[0].length() == 0 || str[str.length - 1].length() == 0) {
				length--;
			}
			System.out.println(length);
			for (String s1 : str)
				if (s1.length() != 0)
					System.out.println(s1);
		} else {
			System.out.println(0);
		}
	}
}
