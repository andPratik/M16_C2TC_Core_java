package com.cg.scanner;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		double b=s.nextDouble();
		String str=s.nextLine();
		System.out.println(a);
		System.out.println(b);
		System.out.println(str);
		s.close();
	}

}
