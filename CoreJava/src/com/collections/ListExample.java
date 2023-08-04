package com.collections;

import java.util.LinkedList;
import java.util.List;

public class ListExample {
public static void main(String[] args) {
	List l=new LinkedList();
	l.add(900);
	l.add("sravani");
	l.add(33);
	l.add("chinna");
	for(int i=0;i<l.size();i++){
	
		System.out.println(l.get(i));
}}
}
