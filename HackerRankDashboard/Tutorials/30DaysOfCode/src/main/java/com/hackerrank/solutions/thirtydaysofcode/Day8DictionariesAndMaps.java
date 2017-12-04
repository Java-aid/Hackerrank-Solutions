/**
 * 
 */
package com.hackerrank.solutions.thirtydaysofcode;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Day8DictionariesAndMaps {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		HashMap<String, Integer> hmap = new HashMap();
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			hmap.put(name, phone);
			// Write code here
		}
		while (in.hasNext()) {
			String s = in.next();

			if (hmap.containsKey(s)) {
				System.out.println(s + "=" + hmap.get(s));

			} else {
				System.out.println("Not found");
			}

			// Write code here
		}
		in.close();
	}
}
