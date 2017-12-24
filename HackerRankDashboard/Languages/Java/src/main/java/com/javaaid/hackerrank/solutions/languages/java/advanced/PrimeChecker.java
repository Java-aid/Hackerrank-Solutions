/**
 * 
 */
package com.javaaid.hackerrank.solutions.languages.java.advanced;

/**
 * @author Kanahaiya Gupta
 *
 */
public class PrimeChecker {
	public void checkPrime(int... num) {
		String str = "";
		for (int n : num) {
			boolean found = true;
			if (n <= 3 && n > 1) {
				str += n + " ";
			} else {
				for (int i = 2; i <= Math.sqrt(n); i++) {
					if (n % i == 0) {
						found = false;
						break;
					}
				}
				if (found && n != 1) {
					str += n + " ";
				}
			}
		}
		System.out.println(str);
	}
}
