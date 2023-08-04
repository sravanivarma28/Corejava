package com.scanner;
	import java.util.Scanner;

	public class ScannerExample {
		public static void main(String args[]) {
			//create object for scanner
			Scanner inputValues=new Scanner(System.in);
			System.out.println("enter byte value");
			byte a=inputValues.nextByte();
			System.out.println(" byte value ::"+a);
			
			System.out.println("enter int value");
			int b=inputValues.nextInt();
			System.out.println(" intvalue ::"+b);
			
			System.out.println("enter short value");
			short c=inputValues.nextShort();
			System.out.println(" short value ::"+c);
		
			
			System.out.println("enter float value");
			float e=inputValues.nextFloat();
			System.out.println("float value ::"+e);
			

			System.out.println("enter double value");
			double f =inputValues.nextDouble();
			System.out.println("double value ::"+f);
			
			System.out.println("enter boolean value");
			boolean g =inputValues.nextBoolean();
			System.out.println("booleanvalue ::"+g);
			
		System.out.println("enter String value");
		String h =inputValues.toString();
		System.out.println("string value ::"+h);
		if(a>b) {
			System.out.println("eligible");
		}}}

