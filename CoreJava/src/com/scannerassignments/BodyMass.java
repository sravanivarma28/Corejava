package com.scannerassignments;
import java.util.Scanner;

public class BodyMass {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	System.out.println("input weight in pounds");
	double weight =s.nextDouble();
	
	System.out.println("input height in inches");
	double inche =s.nextDouble();
	
	double BMI = weight*0.45359237/(inche*0.0254*inche*0.0254);
	System.out.println("body mass index is = "+BMI);
	
}
}
