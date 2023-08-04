package com.scannerassignments;
import java.util.Scanner;

public class AverageOfNumbers {
public static void main(String[] args) {
	int n,i,sum=0;
	{
	Scanner s= new Scanner(System.in);
	
	System.out.println("Input number");
         n =s.nextInt();
}
	System.out.println("The first n natural numbers is = " + n);
	for( i=0;i<=n;i++) {
		System.out.println(i);
		sum+=i;
	}
  System.out.println("The sum of natural numbers = "+sum);
}
}


