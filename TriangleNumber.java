package com.sudha.NumberPatterns;

import java.util.Scanner;

public class TriangleNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size");
		int n=scn.nextInt();
		int sp=n-1;
		int num=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=num;k++) {
				System.out.print(" "+i);
			}
			System.out.println("");
			sp--;
			num++;
		}

	}

}
