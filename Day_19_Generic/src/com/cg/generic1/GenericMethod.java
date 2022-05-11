package com.cg.generic1;

import java.util.Iterator;

public class GenericMethod {
	 public static <E>void display(E[]arr){
		 for (E e : arr) {
			System.out.println(e);
		}
		 System.out.println();
	 }
	public static void main(String[] args) {
		Integer [] a= {1,2,3,4,5,56};
		char ch [] = {'s','d','s'};
		
	}

}
