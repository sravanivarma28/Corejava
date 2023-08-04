package com.oopsconcepts.polymorphism;

//METHOD OVERLOADING

public class MethodOverloading {
	public static void main(String[] args) {
		
		MethodOverloading mo=new MethodOverloading();
		mo.sravani("hlo",6);
		mo.sravani(22,5);
		mo.sravani();
	
	}
	public void sravani() {
	System.out.println("hi");	
	}
	
    public void sravani (int a, int b) {	
System.out.println("sravani");


     }
    public void sravani (String a,int b) {
    	System.out.println("varma");
	
}}
