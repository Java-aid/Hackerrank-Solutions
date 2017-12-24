/**
 * 
 */
package com.javaaid.hackerrank.solutions.languages.java.advanced;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class JavaSHA256 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(getSHAHEX(s));
		sc.close();
	}

	private static String getSHAHEX(String s) {
		StringBuffer sb = new StringBuffer();
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] result = digest.digest(s.getBytes());
			for (int i = 0; i < result.length; i++) {
				String hex = Integer.toHexString(0xff & result[i]);
				if (hex.length() == 1)
					sb.append('0');
				sb.append(hex);
			}

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return sb.toString();
	}

}
