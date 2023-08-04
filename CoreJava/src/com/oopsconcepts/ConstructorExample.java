package com.oopsconcepts;

public class ConstructorExample {
	
public static void main(String[] args) {
	ConstructorExample c=new ConstructorExample(33,"miss");	
	ConstructorExample ct=new ConstructorExample(22);	
	ConstructorExample ct1=new ConstructorExample("hlo");	
	ConstructorExample ct2=new ConstructorExample();	

}
public ConstructorExample() {
	
}
public ConstructorExample(float a) {
	System.out.println("constructor is called = "+a);
}

public ConstructorExample(String b) {
	System.out.println("constructor = "+b);
}
public ConstructorExample(int c,String b) {
	System.out.println("constructor name = "+b);
	System.out.println("constructor type = "+c);
}}
