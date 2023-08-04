package com.scannerassignments;
import java.util.Scanner;
public class PrimeNumbersFor {
		public static void main(String[] args) {
			Scanner scanner =new Scanner(System.in);
			
			System.out.println("Enter startig numeber");
			int startingNumber= scanner.nextInt();
			
			System.out.println("Enter ending numeber");
			int endingNumber= scanner.nextInt();
			
			//System.out.println("Enter ending numeber");
		//	int number= scanner.nextInt();
			
			for(int number=startingNumber;number<=endingNumber;number++) {
				
				int noOfDividents=0;
				if(number!=1&&number!=2) {
				
				for(int i=1;i<=number;i++) {
					if(number%i==0)
						noOfDividents++;
				}}
		if(noOfDividents<=2 && noOfDividents!=0){
			System.out.print(number+",");
			
		}}}}
