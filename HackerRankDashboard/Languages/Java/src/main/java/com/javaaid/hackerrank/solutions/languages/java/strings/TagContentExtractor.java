/**
 * 
 */
package com.javaaid.hackerrank.solutions.languages.java.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Kanahaiya Gupta
 *
 */
public class TagContentExtractor {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String line = in.nextLine();
			String regex = "<(.+)>([^<>]+)(</\\1>)";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(line);
			int counter = 0;
			while (m.find()) {
				if (m.group(2).length() != 0) {
					System.out.println(m.group(2));
					counter++;
				}

			}
			if (counter == 0)
				System.out.println("None");
			testCases--;
		}
		in.close();
	}
}
