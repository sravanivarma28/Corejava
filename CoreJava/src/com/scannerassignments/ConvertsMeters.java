package com.scannerassignments;

import java.util.Scanner;

public class ConvertsMeters {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	System.out.println("inch");
	double inch =s.nextDouble();
	//1 INCH = 0.0254m
	double meters =inch*0.0254;
	System.out.println(inch+"inch is "+meters+"meters");
}
}
