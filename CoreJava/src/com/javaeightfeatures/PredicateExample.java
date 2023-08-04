package com.javaeightfeatures;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateExample {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("enter value");
	int a = s.nextInt();
	ArrayList<Integer> al = new ArrayList();
	al.add(6);
	al.add(9);
	al.add(20);
	
	Predicate<Integer> p = n->n==(a);
	for(int name : al) {
	
		System.out.println(p.test(name));
		
	}
}
}
