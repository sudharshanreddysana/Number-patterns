package com.sudha.NumberPatterns;

import java.util.Scanner;

public class SnakePattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter");
		int n=scn.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				int num= ((i-1)*n)+1;
				for(int j=1;j<=n;j++) {
				System.out.print(num+"\t");
				num++;
				}
			}
			else {
				int num=i*n;
				for(int k=1;k<=n;k++) {
					System.out.print(num+"");
					num--;
				}
			}
			System.out.println();
		}
	}

}
