package com.assignments;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
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
   int sum=0;
   for(int i=0;i<array.length;i++) {
	   sum += array[i];
	   
   }
   System.out.println("sum of arrays = "+sum);
   System.out.println("avarage = "+sum/array.length);
   
   s.close();
   }
	
	
}