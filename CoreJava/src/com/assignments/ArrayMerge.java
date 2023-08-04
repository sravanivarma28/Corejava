package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMerge {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter array1 size");
		int array1size = s.nextInt();
		
		String array1 [] = new String [array1size];
		System.out.println("enter array1 values"); 
		  for(int i=0;i<array1size;i++) {
			   array1[i] = s.next();
		  }
		System.out.println("enter array2 size");
		int array2size = s.nextInt();
		
		String array2 [] = new String [array2size];
		System.out.println("enter array2 values");
	   for(int i=0;i<array2size;i++) {
		   array2[i] = s.next();
	   }
	  System.out.println("input 1 = "+Arrays.toString(array1));
	  System.out.println("input 2 = "+Arrays.toString(array2));
	  
	  String array3 []= new  String [array1.length + array2.length];
	  for(int i=0;i<array1.length;i++) {
		  array3[i]=array1[i];
	  }
	  for(int i=0;i<array2.length;i++) {
		  array3[i+array1.length] = array2[i];
	  }
		  System.out.println("arary 1 & array 2 = "+ Arrays.toString(array3));
	  }}
