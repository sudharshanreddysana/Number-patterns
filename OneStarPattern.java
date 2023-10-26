package com.sudha.NumberPatterns;

import java.util.Scanner;

public class OneStarPattern {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size");
		int n=scn.nextInt();
		int m=5;
		for(int i=1;i<=n;i++) {
			for(int j=m;j>=1;j--) {
				System.out.print(j);
				if(j==1)System.out.print("*");
			}
			System.out.println("");
			m--;
		}

	}

}
