package com.scanner;
import java.util.Scanner;
public class floatingnumber {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("value");
	double a =s.nextDouble();
	if(a>0) {
	if(a<1)	{
		System.out.println("positive small number");
	}else if(a>1000000) {
		System.out.println("positive large number");
	}else {
		System.out.println("positive number");
	}
	}else if(a<0) {
		if(Math.abs(a)>1000000) {
			System.out.println("negative small number");
		}
		else {
			System.out.println("negative number");
		}
	}else {
		System.out.println("zero");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
