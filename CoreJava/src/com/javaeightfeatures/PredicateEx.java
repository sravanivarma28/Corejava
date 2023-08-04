package com.javaeightfeatures;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.ArrayList;

public class PredicateEx {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter name");
		String name = s.next();
		
		ArrayList<String> al = new ArrayList();
		al.add("sravani");
		al.add("chinna");
		al.add("java");
		
		//Predicate p = n->n.equals(name);
		Predicate p = n->name.equals(n);
		for(String n : al) {
			System.out.println(p.test(n));
			
		}
	} 

}
