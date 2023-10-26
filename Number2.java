package com.sudha.NumberPatterns;

import java.util.Scanner;

public class Number2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size");
		int n= scn.nextInt();
		int st=1;
		int num=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=st;j++) {
				System.out.print(num+" ");
				num++;
			}
			st++;
			System.out.println("");
		}

	}

}
