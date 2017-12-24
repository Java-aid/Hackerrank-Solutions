/**
 * 
 */
package com.javaaid.hackerrank.solutions.languages.java.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Kanahaiya Gupta
 *
 */
interface PerformOperation {
	boolean check(int a);
}

class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	// Write your code here
	public static PerformOperation isOdd() {
		return n -> ((n & 1) == 1);
	}

	public static PerformOperation isPrime() {
		return n -> {
			if (n < 2) {
				return false;
			} else {
				int k = (int) Math.sqrt(n);
				for (int i = 2; i <= k; i++) {
					if (n % i == 0)
						return false;
				}
				return true;
			}
		};
	}

	public static PerformOperation isPalindrome() {
		return n -> {
			String org = n + "";
			String newString = new StringBuffer(org).reverse().toString();
			return org.equals(newString);
		};
	}
}

public class JavaLambdaExpressions {
	public static void main(String[] args) throws IOException {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T-- > 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.isOdd();
				ret = ob.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.isPrime();
				ret = ob.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.isPalindrome();
				ret = ob.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		}
	}
}
