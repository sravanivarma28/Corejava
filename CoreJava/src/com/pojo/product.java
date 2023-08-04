package com.pojo;
import java.util.*;
public class product {


	public static void main(String[] args) {
		ArrayList<product> a=new ArrayList<product>();
		a.add(new product(87,"sravani"));
		a.add(new product(22,"varma"));
		a.add(new product(56,"raji"));
		a.add(new product(56,"yaksha"));
		a.add(new product(87,"raji"));
		
		
	}
	public product(int id, String name) {
		System.out.println(id+" = "+name);
}}
