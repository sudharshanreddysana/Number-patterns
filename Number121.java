package com.sudha.NumberPatterns;

import java.util.Scanner;

public class Number121 
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Etner nubmer");
		int n=scn.nextInt();
		int str=1;
		int sp=n-1;
		int num=1;
		for(int i=1;i<=n;i++)
		{
			num=1;
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=str;k++)
			{
				System.out.print(num);
				if(k<=str/2)
				{
					num++;
				}
				else {
					num--;
				}
			}
			System.out.println();
			if(sp>=i)
			{
				sp--;
				str+=2;
			}
			else {
				sp++;
				str-=2;
			}
		}

	}

}
