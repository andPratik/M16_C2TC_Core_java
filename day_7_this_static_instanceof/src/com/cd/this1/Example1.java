package com.cd.this1;
class Parent
	{
		int a;
		void print(int a)
		{
			this.a=a;
		}
		void disply() {
			System.out.println("the value of a "+a);
		}
	}

public class Example1 {

	public static void main(String[] args) {
		Parent p = new Parent ();
		p.print(10); 
		p.disply();
		
		

	}

}
