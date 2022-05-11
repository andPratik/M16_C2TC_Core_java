package com.cg.generic1;

import java.util.ArrayList;
import java.util.Iterator;

public class Example3 {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("saujan");
		list.add("shashank");
		//list.add(30);
		String res= list.get(0);
		System.out.println(res);
		Iterator<String> itr =list.iterator();
		 while (itr.hasNext()) {
			 System.out.println(itr);
		 }
		
		
	}

}
