package com.javaeightfeatures;
import java.util.*;
import java.util.stream.Collectors;

public class ExampleOne {
	public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList();
	for(int i=0;i<=100;i++) {
		a.add(i);
	}
		List<Integer>num =a.stream().filter(n->n%2!=0).collect(Collectors.toList());
		System.out.print(num+",");
		System.out.println();
		List<Integer> add =a.stream().map(n->n+3).collect(Collectors.toList());
		System.out.print(add+",");
	
		
	}}