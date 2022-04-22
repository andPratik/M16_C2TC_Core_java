package com.cg.multithreading;

public class Example1 {
	public static void main(String args[])
	{
		Thread th=Thread.currentThread();
		System.out.println("Current Thread:"+th);
		try
		{
			Thread.sleep(1);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

}
