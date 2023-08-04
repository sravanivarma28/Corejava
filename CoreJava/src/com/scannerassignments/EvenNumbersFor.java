package com.scannerassignments;

import java.util.Scanner;

public class EvenNumbersFor {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
			
			System.out.println("Enter starting numeber");
			int startingNumber= scanner.nextInt();
			
			System.out.println("Enter ending numeber");
			int endingNumber= scanner.nextInt();
			int sum=0;
			for(int i=startingNumber;i<=endingNumber;i++)
				if(i%2==0)
					sum=sum+i;
				System.out.print("sum = "+sum);

		}

}
