package com.scannerassignments;

import java.util.Scanner;

public class Years {
public static void main(String[] args) {
	
	double minutesInYear= 60*24*365;
	Scanner s =new Scanner(System.in);
	System.out.println("input number of minutes");
	double min=s.nextDouble();
	
	long years =(long)(min/minutesInYear);
	int days =(int)(min/60/24)%365;
	
	System.out.println((int) min + " minutes is approximately "+ years + " years and " + days + " days ");	
	
                           }}
