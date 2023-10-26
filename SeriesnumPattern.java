package com.sudha.NumberPatterns;

import java.util.Scanner;

public class SeriesnumPattern {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("ENter value");
		int n=scn.nextInt();
		int num=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(num+"\t");
				num++;
			}
			System.out.println("");
		}

	}

}
