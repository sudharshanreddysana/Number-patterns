package com.sudha.NumberPatterns;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String");
		int n = scn.nextInt();
		int sp = 0;
		int st = n;
		int num = n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= st; k++) {
				if (i % 2 != 0) {
					System.out.print(num--);
				}
				else {
					System.out.print(num++);
				}
			}
			System.out.println();
			if(i%2!=0)num++;
			else num--;
			sp++;
			st--;
		}
	}

}
