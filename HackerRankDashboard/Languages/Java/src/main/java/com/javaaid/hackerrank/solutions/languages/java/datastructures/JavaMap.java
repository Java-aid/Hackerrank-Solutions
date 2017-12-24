/**
 * 
 */
package com.javaaid.hackerrank.solutions.languages.java.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class JavaMap {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		Map<String, Integer> hmap = new HashMap<String, Integer>();
		int n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			hmap.put(name, phone);
			in.nextLine();
		}
		while (in.hasNext()) {
			String s = in.nextLine();
			if (hmap.containsKey(s)) {
				System.out.println(s + "=" + hmap.get(s));
			} else {
				System.out.println("Not found");
			}
		}
		in.close();
	}
}
