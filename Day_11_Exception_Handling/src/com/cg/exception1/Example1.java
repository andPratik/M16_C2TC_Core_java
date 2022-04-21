package com.cg.exception1;

public class Example1 {

	
	public static void main(String[] args) {
		try
		{
			int x=12/0;
			System.out.println(x);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled " +e);
		}

	}

}
