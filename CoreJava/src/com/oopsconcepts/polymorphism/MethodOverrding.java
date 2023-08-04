package com.oopsconcepts.polymorphism;

public class MethodOverrding {
public static void main(String[] args) {
	parentM P=new parentM();
	P.one();
	 childM c=new  childM();
	 c.one();
	c.two();
	c.three();
	parentM pm=new  childM();
	pm.one();

	// childM c1 =new parentM(); not possible
}
}
class parentM{
	public void one() {
		System.out.println("parent");
	}
}
class childM extends parentM{
public void one() {
	System.out.println("hello");
}
	public void two() {
	System.out.println("child");
	
}
  public void three() {
	  System.out.println("running");
  }
}
