package com.cg.regex;

import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String str ="M1-16 \r\n pratik thakare\r \n";
		String[]res=str.split("a",3);
		for (String i : res) {
			System.out.println(i);
		}

	}

}
