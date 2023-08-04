package com.oopsconcepts;

//HAS A RELATION
public class HasRelationOne {
public static void main(String[] args) {
	
	hospital h=new hospital();
	h.hospitalinformation();
}}
class hospital{
	public void hospitalinformation() {
specilists s =new specilists();

	s.cardialogy();
	s.gynacology();
	
pharmacy p= new pharmacy();
     p.medicines();
     
 reception r=new reception();
   r.details();
	}}
class specilists{
public void cardialogy(){
	System.out.println("doctor 1");
}
public void gynacology() {
	System.out.println("doctor 2");
}}
class pharmacy{
public void medicines() {	
	System.out.println("zicovit");
}}
class reception{
public void details() {
	System.out.println("cash");
}}
