package com.cg.array1;
class Employee1
{
	public int ID;
	public String emp_name;
	Employee1(int ID,String emp_name)
	{
		this.ID=ID;
		this.emp_name=emp_name;
	}
}
public class Example4 {
	
	public static void main(String[] args) {
		Employee1[] arr;
		arr=new Employee1[3];
		arr[0]=new Employee1(101,"Ram");
		arr[1]=new Employee1(102,"Pratik");
		arr[2]=new Employee1(103,"Srutik");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Element at "+i+":"+arr[i].ID+" "+arr[i].emp_name);
		}
		
		

	}
}