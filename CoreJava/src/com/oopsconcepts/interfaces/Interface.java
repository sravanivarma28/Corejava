package com.oopsconcepts.interfaces;

public class Interface {
	public static void main(String[] args) {
	exampleone e=new exampletwo();
	e.one(4,5);
	e.two(3,9);
	
	example e1=new exampletwo();
	e1.one(33,55);
	}}
interface example{
	
 public void one (int a, long b)	;
}
interface exampleone extends example{
	
	public void two (int a,int b)	;	
}
class exampletwo implements exampleone{
	
	public void one (int a,long b)	{
		System.out.println(a+b);
		
		System.out.println(a-b);
}
	public void two (int a,int b)
	{
		System.out.println(a*b);
		
	}
	}