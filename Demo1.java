package com.sudha.NumberPatterns;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("ENter");
		int num = scn.nextInt();
		int str=num;
		int sp=0;
		int x=num;
		int y=0;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=sp;j++) 
			{
				System.out.print(" ");
			}
			for(int k=1;k<=str;k++)
			{
				if(i%2!=0)
				{
					y=x;
					System.out.print(x);
					x--;
				}else {
					x=y;
					System.out.print(y);
					y++;
				}
			}
			System.out.println();
			sp++;
			str--;
		}
	}
}
