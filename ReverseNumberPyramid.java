package com.sudha.NumberPatterns;

import java.util.Scanner;

public class ReverseNumberPyramid {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size");
		int n=scn.nextInt();
		int sp=1;
		int st=n*2-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<sp;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=st;k++) {
				System.out.print(k);
			}
			sp++;
			st-=2;
			System.out.println("");
		}

	}

}
