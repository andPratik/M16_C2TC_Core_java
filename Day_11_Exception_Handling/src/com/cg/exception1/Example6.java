package com.cg.exception1;
import java.io.IOException;

class Sample
{
	void print(int num)throws ClassNotFoundException,IOException
	{
		if(num==1)
		{
			throw new IOException("Exception handled");
		}
		else
		{
			throw new ClassNotFoundException("Exception occurred and handled");
		}
	}
}
public class Example6 {
	public static void main(String[] args) {
		try
		{
			Sample s=new Sample();
			s.print(11);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
