package com.scannerassignments;
import java.util.Scanner;

public class NumberOfDays {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int number_Of_Days_InMonth=0;
		String MonthOfName=" ";
		System.out.println("enter month number");
		int month =s.nextInt();
		
		System.out.println("enter year");
		int year =s.nextInt();
		
		switch(month) {
		case 1 :
		MonthOfName="January";
		number_Of_Days_InMonth=31; break;
		
		case 2 :
			MonthOfName="February";
			if((year%400==0)||(year%4==0)){
			number_Of_Days_InMonth=29; 
			}else {
				number_Of_Days_InMonth=28; 
			} break;
			
		case 3 :
			MonthOfName="March";
			number_Of_Days_InMonth=31; break;
			
		case 4 :
			MonthOfName="April";
			number_Of_Days_InMonth=30; break;
			
		case 5 :
			MonthOfName="May";
			number_Of_Days_InMonth=31; break;
			
		case 6 :
			MonthOfName="June";
			number_Of_Days_InMonth=30; break;
			
		case 7:
			MonthOfName="July";
			number_Of_Days_InMonth=31; break;
			
		case 8 :
			MonthOfName="August";
			number_Of_Days_InMonth=31; break;
			
		case 9 :
			MonthOfName="September";
			number_Of_Days_InMonth=30; break;
			
		case 10 :
			MonthOfName="October";
			number_Of_Days_InMonth=31; break;
			
		case 11 :
			MonthOfName="November";
			number_Of_Days_InMonth=30; break;
			
		case 12 :
			MonthOfName="December";
			number_Of_Days_InMonth=31; break;
		}
		
      System.out.println(MonthOfName + " " + year + " has " + number_Of_Days_InMonth + " days ");
	}}