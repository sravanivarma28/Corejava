package com.arraypractice;
import java.util.ArrayList;

public class ArrayListToArray {
	public static void main(String[] args) {
		ArrayList<String> a= new ArrayList<String>();
		
		a.add("Hlo");
		a.add("Welcome");
		a.add("to");
		a.add("new");
		a.add("world");
		a.add("sravani");
		
		String array[]=new String[a.size()];
		
		a.toArray(array);
		for(String values: array) {
			System.out.println(values);
			
                  }}}
