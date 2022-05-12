package com.cg.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Annotation1
{
	int sound();
}
 class p 
 {	@Annotation1(sound =12)
	 void display()
	 {
		 System.out.println("Annotation");
	 }
 }
public class Example4 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException 
	{
		p obj = new p ();
		Method m = obj.getClass().getMethod("display");
		Annotation1 a = m.getAnnotation(Annotation1.class);
		System.out.println(a.sound());
	}

}
