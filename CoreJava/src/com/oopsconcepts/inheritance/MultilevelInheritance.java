package com.oopsconcepts.inheritance;
// MULTILEVEL INHERITANCE STATIC

public class MultilevelInheritance {
public static void main(String[] args) {
parentexample p=new parentexample();
p.one();
childexample c=new childexample();
c.two();
c.one();
childexample.two();

childone cd=new childone();
cd.three();
cd.one();
cd.two();
childone.two();

subchild sb=new subchild();
sb.four();
sb.two();
sb.one();
childone.two();
}}
class parentexample {
    public  void one() {
System.out.println("sravani");
  }}	
class childexample extends parentexample {
   public static void two() {
System.out.println("varma");
	}}
class childone extends childexample{
	public void three() {
		System.out.println("raji");
 }}
class subchild extends childone{
   public void four() {
 System.out.println("chinni");
}}
