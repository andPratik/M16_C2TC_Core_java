package com.cg.absreact1;
	abstract class A
	{
			abstract void print();
			int a;
	
	}
		class B extends A
		{
			void print()
			{
				System.out.println("Welcome to abstract program");
			}
		}
		public class Example {

	public static void main(String[] args) {
		B obj=new B();
		obj.print();

	}

}


