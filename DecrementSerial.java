package com.sudha.NumberPatterns;

import java.util.Scanner;

public class DecrementSerial {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Size");
		int n=scn.nextInt();
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}

	}

}
