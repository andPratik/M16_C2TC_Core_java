package com.cg.generic1;

public class GenericClass <T>{
	T val;
	void print() {
		System.out.println(val.getClass());
	}

	public static void main(String[] args) {
		GenericClass <Integer>obj = new GenericClass<>();//if we give intger here so it can only take intger value;
		obj.val=68;
		obj.print();
	}

}
