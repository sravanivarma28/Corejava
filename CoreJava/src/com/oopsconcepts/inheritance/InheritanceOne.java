package com.oopsconcepts.inheritance;

public class InheritanceOne {
public static void main(String[] args) {
parent p=new parent();
 p.one();
parent.one();
//PARENT TYPE CHILD OBJECT CAN USE ONLY PARET CLASS
parent p1=new child();
p1.one();
//CHILD TYPE PARENT OBJECT NOT POSSIBLE
//child c1=new parent();
child c =new child();
c.two();
child.two();
c.one();
p1.one();
}
}
class parent{
public static void one() {	
System.out.println("one");	
}
}
class child extends parent{
public static void two() {
	System.out.println("world");

}}