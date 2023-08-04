package com.scannerassignments;
import java.util.Scanner;

public class CubeOfNumbers {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	System.out.println("Number of terms");
	int a=s.nextInt();
	
	for(int i=1;i<=a;i++) {
		System.out.println("Number is " +i+" and cube of " +i+ " is = "+(i*i*i));
	}
}
}
