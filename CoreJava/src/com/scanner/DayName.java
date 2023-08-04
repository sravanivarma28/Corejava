package com.scanner;

import java.util.Scanner;
//NAME OF THE DAY

public class DayName {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter day number");
	
	int day=s.nextInt();
	switch(day) {
	case 0:
	System.out.println("sunday"); break;
	
	case 1:
		System.out.println("monday");  break;
		
	case 2:
		System.out.println("tuesday");  break;
		
	case 3:
		System.out.println("wednesday");   break;
		
	case 4:
		System.out.println("thursday");   break;
		
	case 5:
		System.out.println("friday");   break;
		
	case 6:
		System.out.println("saturday");   break;
		
	default:
		System.out.println("invalid day ");  break;
	
	}}}
