package com.cg.exception1;

public class Example2 {

	public static void main(String[] args){ 
        System.out.println("First Number");
        System.out.println("Second Number");
        int[] myIntArray = new int[]{1, 2, 3};
        try
        {
        	print(myIntArray);
        	System.out.println("Third Number");
        }
        catch(Exception e)
        {
        	System.out.println("Exception handled "+e);
        }
        finally
        {
        	
        	System.out.println("Finally Block");
        }
        
        System.out.println("Welcome to Amravati");
    } 
    public static void print(int[] arr) {
        System.out.println(arr[3]);
        System.out.println("Fourth Number");
    }

	
}
