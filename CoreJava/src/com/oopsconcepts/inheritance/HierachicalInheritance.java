package com.oopsconcepts.inheritance;
//HIERACHICAL INHERITANCE
  public class HierachicalInheritance {
	  
	 public static void main(String[] args) {
	parents p=new parents();
 p.one();
parents.one();
  //PARENTS TYPE CHILDONES OBJECT CAN USE ONLY PARET CLASS
parents p1=new childones();
p.one();
p1.one();
   //CHILDONES TYPE PARENTS OBJECT NOT POSSIBLE
//childones c2=new parents();
childones c=new childones();
c.two();
childones.one();
p.one();
p1.one();

childtwo cd =new childtwo();
cd.one();
childtwo.one();
cd.three();
}}
class parents{
	//USING STATIC METHOD PARENTS CLASS ONLY
	public static void one(){
	System.out.println("sravani");	
	}}
class childones extends parents{
	public void two() {
		System.out.println("varma");	
	}}
class childtwo extends parents{
	public void three() {
		System.out.println("golla");	
	}}