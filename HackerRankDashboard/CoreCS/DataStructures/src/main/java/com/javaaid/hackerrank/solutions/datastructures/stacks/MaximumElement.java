package com.javaaid.hackerrank.solutions.datastructures.stacks;

import java.util.Scanner;

/**
 * 
 * @author Kanahaiya Gupta
 *
 */
public class MaximumElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		int b[] = new int[N];
		int top = -1;
		int bTop = -1;

		for (int i = 0; i < N; i++) {
			int op = sc.nextInt();
			switch (op) {
			case 1:
				int item = sc.nextInt();
				a[++top] = item;
				if (bTop >= 0) {
					if (item >= b[bTop])
						b[++bTop] = item;
				} else {
					b[++bTop] = item;
				}

				break;
			case 2:
				item = a[top];
				a[top--] = -1;
				if (item == b[bTop])
					b[bTop--] = -1;
				break;

			case 3:

				System.out.println(b[bTop]);
				break;
			}
		}
		sc.close();
	}
}
