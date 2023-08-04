package com.String;

public class StringBufferExample {
	public static void main(String[] args) {
		
		String a="Example.com";
		String b= "example.com";
		StringBuffer strbfr= new StringBuffer(a);
		int length=a.length();
	
		System.out.println("The string length of '"+a+"' is = "+length);  
		
         System.out.println();
		
		System.out.println("comparing "+a+" and "+strbfr+"="+a.contentEquals(strbfr));
		System.out.println("comparing "+b+" and "+strbfr+"="+b.contentEquals(strbfr));
		
	}

}
