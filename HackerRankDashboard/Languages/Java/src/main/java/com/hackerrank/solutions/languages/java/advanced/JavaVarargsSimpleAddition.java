/**
 * 
 */
package com.javaaid.hackerrank.solutions.languages.java.advanced;

/**
 * @author Kanahaiya Gupta
 *
 */
public class JavaVarargsSimpleAddition {
	public void add(int... a) {
		String b = "";
		int c = 0;
		for (int i : a) {
			b += i + "+";
			c += i;
		}
		System.out.print(b.substring(0, b.length() - 1));
		System.out.println("=" + c);

	}
}
