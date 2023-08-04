package com.scannerassignments;

import java.util.Scanner;

public class PrimeNumberFor {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
			
			System.out.println("Enter ending numeber");
			int number= scanner.nextInt();
			
			int noOfDividents=0;
			if(number!=1&&number!=2) {
			
			for(int i=1;i<=number;i++) {
				if(number%i==0)
					noOfDividents++;
			}}
	if(noOfDividents>2 || noOfDividents==0){
		System.out.println("given number is not a prime number");
	}else {
		System.out.println("given number  is prime number");
		
			}}}
