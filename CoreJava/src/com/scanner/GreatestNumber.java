package com.scanner;
import java.util.Scanner;

public class GreatestNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("1st number");
		int a=s.nextInt();
		
		System.out.println("2nd number");
		int b=s.nextInt();
		
		System.out.println("3rd number");
		int c=s.nextInt();
		
		if(a>b)
		 if(a>c)
		System.out.println("greatest ::"+a);
		if(b>a)
		 if(b>c)
			 System.out.println("greatest ::"+b);	
		if(c>a)
		 if(c>b)
			 System.out.println("greatest ::"+c);
	}

}
