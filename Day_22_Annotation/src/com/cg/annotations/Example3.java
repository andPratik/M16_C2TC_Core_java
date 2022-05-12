package com.cg.annotations;
class Animal
{
	@Deprecated
	void sound()
	{
		System.out.println("roar");
	}
}

public class Example3 {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.sound();
	}

}
