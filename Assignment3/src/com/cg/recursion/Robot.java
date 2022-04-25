package com.cg.recursion;

import java.util.Scanner;

public class Robot
{
	static int display(int m,int n)
	{
		if(m==1||n==1)
			return 1;
		return display(m-1, n)+display(m, n-1);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Row m = ");
		 int m=sc.nextInt();
		 System.out.print("Enter The Column n = ");
		 int n=sc.nextInt();
		 
		System.out.println(display(m, n));
	}

}