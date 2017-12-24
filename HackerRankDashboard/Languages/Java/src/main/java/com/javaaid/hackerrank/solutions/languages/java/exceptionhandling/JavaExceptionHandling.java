/**
 * 
 */
package com.javaaid.hackerrank.solutions.languages.java.exceptionhandling;

/**
 * @author Kanahaiya Gupta
 *
 */
public class JavaExceptionHandling {
	int power(int n, int p) throws Exception {

		if (n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
		} else {
			return (int) Math.pow(n, p);
		}

	}

}
