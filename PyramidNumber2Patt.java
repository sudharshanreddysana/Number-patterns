package com.sudha.NumberPatterns;

import java.util.Scanner;

public class PyramidNumber2Patt {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size");
		int n=scn.nextInt();
		int sp=n/2;
		int st=1;
		for(int i=1;i<=n;i++) {
			int num=1;
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=st;k++) {
				System.out.print(num+"*");
				num+=1;
			}	
			System.out.println("");
			if (i<=n/2){
				sp--;
				st+=2;
			}
			else {
				sp++;
				st-=2;
			}
		}

	}

}
