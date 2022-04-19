package com.assignment2;

import java.util.Scanner;

public class FibonacciSeries {
	
	 static int a=0,b=1,c=0;    
	 static void printFibonacci(int count){    
	    if(count>0){    
	       c = a + b;    
	        a= b;    
	         b= c;    
	         System.out.print(" "+c);   
	         printFibonacci(count-1);    
	     }    
	 }    
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter The Nth term");
		 int count=	 sc.nextInt();
        System.out.print(a+" "+b);
	  printFibonacci(count-2);
	 }  
	}  
		