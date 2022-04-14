package com.cg.inhertance;
class Vehiacls{
	void print()
	
	{
		System.out.println("vehical type ");
	}
}
class Car extends Vehiacls{
	void display()
	{
		System.out.println("tesela");
	}
}
class Bike extends Vehiacls{
	void display1()
	
	{
		System.out.println("r15 ");
	}
}

public class HirerchaicalInhertiance {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.print();
		b1.display1();
		

	}

}
