package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxAndIndex {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("enter arraysize");
		int arraysize = s.nextInt();
		
		System.out.println("enter array"); 
		int array [] = new int[arraysize];
		
		System.out.println("enter array values");
	   for(int i=0;i<arraysize;i++) {
		   array[i] = s.nextInt();
	   }
	   System.out.println("input = "+Arrays.toString(array));
	   int largestNumber =array[0];
	   int largestNumberIndex = 0;
	   for(int i=0;i<array.length;i++) {
		   if (largestNumber<array[i]) {
			   largestNumber = array[i];
			   largestNumberIndex = i;   
		   }}
	   System.out.println("largestNumber = "+largestNumber);
	   System.out.println("largestNumberIndex = "+largestNumberIndex);
			
	  
	   s.close();

}}
