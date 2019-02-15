/**
 * 
 * Problem Statement-
 * [Beautiful Binary String](https://www.hackerrank.com/challenges/beautiful-binary-string/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.strings;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class BeautifulBinaryString {
	 static int minSteps(int n, String strB){
	        int stepsCount=0;
	        String tmpStr=strB;
	        while(tmpStr.indexOf("010")!=-1){
	        	tmpStr=tmpStr.replaceFirst("010", "011");
	        	stepsCount++;
	        }
	        return stepsCount;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        String B = in.next();
	        int result = minSteps(n, B);
	        System.out.println(result);
	        in.close();
	    }
	}
