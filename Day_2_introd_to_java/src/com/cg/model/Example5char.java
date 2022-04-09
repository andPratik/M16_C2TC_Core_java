package com.cg.model;

import java.util.Scanner;

public class Example5char {

	public static void main(String[] args) {
		char a = 's';
		System.out.println(a);
		System.out.println("enter the charectar");
		Scanner sc = new Scanner(System.in);
		char b = sc.next().charAt(0);
		System.out.println(b);

	}

}
