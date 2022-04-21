package com.cg.exception1;

public class Example3 {

	public static void main(String args[])
	   {
	      System.out.println(Example3.myMethod());  
	   }
	   public static int myMethod(){
	       try {
	                int x = 63;
	                int y = 0;
	                int z=x/y;
	                System.out.println("We are in try block");
	                System.exit(0);
	        }
	        catch (Exception exp){
	            System.out.println(exp);
	        }
	       
	        finally{
	            System.out.println("We are in finally block");
	            return 0;
	        }
	   }
}
