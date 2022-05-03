package com.cg.map;

import java.util.*;

public class Example6 {

	public static void main(String[] args) {
		NavigableMap<Integer, String> ss = new TreeMap<Integer,String>();
		ss.put(11, "pratik");
		ss.put(12, "akash");
		System.out.println(ss);
		System.out.println(ss.firstEntry());
		
	

	}

}
