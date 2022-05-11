package com.cg.unit;


import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class JUintTesting5 
{	@Test
	void accecpt()
	{
		System.setProperty("1", "pratik");
		Assumptions.assumeTrue("pratik".equals(System.getProperty("1")));
	}
}
