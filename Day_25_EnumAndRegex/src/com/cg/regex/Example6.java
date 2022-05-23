package com.cg.regex;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		String pattern = "Pratik Thakare";
		Scanner sc =new Scanner(System.in);
		String input = sc.nextLine();
		boolean result =pattern.matches(pattern);
		System.out.println(result);
        sc.close();
	}

}
