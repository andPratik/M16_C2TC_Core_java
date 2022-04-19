package com.cg.interface1;

public interface A {
	 void print();
}
 class B implements A{
	public void print() 
	{
		System.out.println(" hello world");
	}
	public static void main(String[] args) {
		B abc =new B();
		abc.print();
	}
}
 