package com.cg.interface1;

public interface Mother 
{
	void display();
}
 interface Father
{
	void display();
}
class son implements Mother,Father{
	public void display() {
		System.out.println("mother ");
	}
	public void display1() {
		System.out.println("father");
	}
	public static void main(String[] args) {
		son s = new son();
		s.display();
		s.display1();
	}
}
