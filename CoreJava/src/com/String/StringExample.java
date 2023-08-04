package com.String;

import java.lang.invoke.*;

public class StringExample {
public static void main(String[] args) {
	 String s="hlo"; 
	 String s1= new  String("hlo");
	 System.out.println(s);
	 System.out.println(s==s1);
	 System.out.println(s.equals(s1));
	 
	 String s2="hlo";
	 
	 String s3=new String("hlo");
	 String s4=new String("hlo");
	 System.out.println(s3.equals(s4));
	 System.out.println(s3==s4);
	System.out.println(s==s2);
	System.out.println(s2.equals(s4));	
	String s5 =s.concat("sravani");
	System.out.println(s5);
	
	
               }}
