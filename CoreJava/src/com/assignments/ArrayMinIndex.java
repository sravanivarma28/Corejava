package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinIndex {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("enter arraysize");
		int arraysize = s.nextInt();
		
		System.out.println("enter array"); 
		String array [] = new String[arraysize];
		
		System.out.println("enter array values");
	   for(int i=0;i<arraysize;i++) {
		   array[i] = s.next();
	   }
	   System.out.println("input = "+Arrays.toString(array));
	   
	   String minLengthWord = array[0];
	   int minLengthWordIndex = 0;
	   
	   for(int i=0;i<array.length;i++) {
		   if (minLengthWord.length()<array[i].length()) {
			   minLengthWord = array[i];
			   minLengthWordIndex = i;
			   
			   
		   }}
	   System.out.println("minLengthWord = "+minLengthWord);
	   System.out.println("minLengthWordIndex = "+minLengthWordIndex);
			
	  
	   s.close();
	}}

