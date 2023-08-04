package com.methods;

public class MethodOne {
public static void main(String[] args) {
	MethodOne m=new MethodOne();
	
     m.one(5,6);
    m.sub(4,9);
    System.out.println("sum");
    System.out.println(m.sub(9,44));
     
 }
//INSTANCE METHOD

public void one(int a,int b) {
	System.out.println("sum "+(a+b));
}
	public int sub (int c,int d) {
		return c-d;
	
}
}
