/**
 * 
 * Problem Statement-
 * [Encryption](https://www.hackerrank.com/challenges/encryption/problem)
 * 
 */
package org.javaaid.hackerrank.solutions.implementation.bruteforce;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Encryption {

	 static String encryption(String s) {
	        int length=s.length();
	        double rows=Math.floor(Math.sqrt(length));
	        double cols=Math.ceil(Math.sqrt(length));
	        int len=(int) (rows>cols?rows:cols);
	        String result="";
	        for(int i=0;i<len;i++) {
	        	for(int j=i;j<s.length();j=(int) (j+cols)) {
	        		char ch=s.charAt(j);
	        		result+=ch;
	        	}
	        	result+=" ";
	        }
			return result;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        String result = encryption(s);
	        System.out.println(result);
	        in.close();
	    }
	}
