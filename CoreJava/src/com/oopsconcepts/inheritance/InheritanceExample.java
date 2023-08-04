package com.oopsconcepts.inheritance;

public class InheritanceExample {
	public static void main(String[] args) {
		sravani s=new sravani();
		
		s.hlo();
		sravani.hlo();
		
		varma v= new varma();
		v.world();
		v.hlo();
		varma.hlo();
		sravani.hlo();
	}}
class sravani {
	public static void hlo() {
	System.out.println("raji");	
	}
}
class varma extends sravani{
	public void world() {
	System.out.println("chinna");	
	}
}