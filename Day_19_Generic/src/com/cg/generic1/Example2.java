package com.cg.generic1;

import java.util.LinkedList;

public class Example2 {

	public static void main(String[] args) {
		LinkedList<String>obj=new LinkedList<String>();
		obj.add("Pratik ");
		obj.add("Thakare");
		String res=obj.get(1);
		System.out.println(res);
	}

}
