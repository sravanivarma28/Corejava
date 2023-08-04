package com.scanner;

import java.util.Scanner;

public class ProgramOne {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("input the first number");
		int a=s.nextInt();
		
		System.out.println("input the second number");
		int b=s.nextInt();
		
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		System.out.println(a+"%"+b+"="+(a%b));

}
}