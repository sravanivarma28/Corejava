package com.oopsconcepts.inheritance;

public class InheritanceTwo {
public static void main(String[] args) {
teacher t=new teacher();
t.one();
t.two();

student s=new student();
s.two();
	
}
}
class teacher extends student {
public void one(){
System.out.println("names");	
}
}
class student{
public void two() {
	System.out.println("enter");	
}}
