package com.scannerassignments;

import java.util.Scanner;

public class SwitchDayName {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter dayname");
		String dayName = scanner.next();
		switch(dayName) {
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
			System.out.println("It` a weekday");
			break;
			
		case "Saturday":
		case "Sunday":
			System.out.println("It`s weekend");
		break;
		default:
			System.out.println("Dayname is invalid");
		
		}

}}
