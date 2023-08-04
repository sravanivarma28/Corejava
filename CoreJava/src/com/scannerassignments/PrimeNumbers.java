package com.scannerassignments;
import java.util.Scanner;

public class PrimeNumbers {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			
			System.out.println("starting number");
			int startingNumber = s.nextInt();
			
			System.out.println("ending number");
			int endingNumber = s.nextInt();
			
			int number = startingNumber;
			while(number<=endingNumber) {
			
			boolean isprime=true;
			if(number!=1||number !=2) {
				int i=2;
				while(i<number) {
					
					if(number %i==0) {
						isprime=false;
						break;
					}
					i++;
				}}
				else
					isprime=false;
				
				if(isprime)
					System.out.print(number+",");
				number++;
			
				}}}

            