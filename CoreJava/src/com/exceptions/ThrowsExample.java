package com.exceptions;

public class ThrowsExample {
	public static void main(String[] args)throws Exception   {
		one();
	}
	public static void one()throws Exception {
		try {
      two();
  }catch(Exception e){
  System.out.println("catch");
  }
	System.out.println("one");  
  }
	public static void two()throws Exception  {
		System.out.println(10/0);
		
	}
}
