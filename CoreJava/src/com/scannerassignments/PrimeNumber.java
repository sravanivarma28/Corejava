package com.scannerassignments;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter number"); 
		int number =s.nextInt();
		
		boolean isprime=true;
		if(number!=1||number !=2) {
			int i=2;
			while(i<number) {
				
				if(number %i==0) {
					isprime=false;
					break;
				}
				i++;
			}
			if(isprime) {
				System.out.println("given number is prime number");
					
				}else {
					System.out.println("given number is not prime number");
				
			}
		}
	}

}
