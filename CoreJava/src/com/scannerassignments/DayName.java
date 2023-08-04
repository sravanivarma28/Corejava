package com.scannerassignments;

import java.util.Scanner;

public class DayName {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter a number");
		String dayName =scanner.next();
		      if(dayName.equals("Monday")||
				dayName.equals("Tuesday")||
				dayName.equals("Wednesday")||
				dayName.equals("Thursday")||
				dayName.equals("Friday"))
				
				System.out.println("Uff it`s a weekday");
				
				else 
					System.out.println("It`s weekend");
				
                    }}
