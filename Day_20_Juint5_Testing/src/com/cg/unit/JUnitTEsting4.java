package com.cg.unit;

import org.junit.jupiter.api.*;


public class JUnitTEsting4
{	@BeforeAll // it will test this case first then other,make static 
	// @AfterAll --> this test will excute last 
	static void display()
	{
		System.out.println("Pratik");
	}
	@Tag("me")
	//@Disabled
	@Test
	void display1()
	{
		System.out.println("raj");
	}
	
	
}
