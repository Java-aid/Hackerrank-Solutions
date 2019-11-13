/**
 * 
 * Problem Statement-
 * [Designer PDF Viewer](https://www.hackerrank.com/challenges/designer-pdf-viewer/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class DesignerPDFViewer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[26];
		for (int i = 0; i < 26; i++) {
			a[i] = sc.nextInt();
		}
		int maxHeight = 0;
		String word = sc.next();
		for (int i = 0; i < word.length(); i++) {
			int index = word.charAt(i) - 'a';
			if (a[index] > maxHeight) {
				maxHeight = a[index];
			}
		}
		System.out.println(maxHeight * word.length());
		sc.close();
	}
}
