package com.oopsconcepts.interfaces;

public class SingleInterface {
	
public static void main(String[] args) {
	
	 parentsex p=new  parentsex(); 
p.two();
 students s=new parentsex();
s.one();

 teachers t= new parentsex();
 t.one();
 t.two();
 //CREATE OBJECT IS NOT POSSIBLE FOR INTERFACE
 //teachers t1=new teachers();
}
}
interface students{
	public void one();
}
interface teachers {
	public void two();
	public void one();
}
class parentsex implements students,teachers{
	public void one() {
	System.out.println("keep");
	}
public void two() {
	System.out.println("smiling");
	}}