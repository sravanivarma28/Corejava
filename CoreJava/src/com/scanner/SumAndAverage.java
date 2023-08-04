  package com.scanner;
 import java.util.Scanner;
 
public class SumAndAverage {

	//INPUT NUMBERS FROM KEYBOARD FIND SUM & AVERAGE
public static void main(String[] args) {
	int i,n=0,s=0;
	double avg;{
	System.out.println("enter 5 numbers");
	}
for( i=0;i<5;i++) {
 Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
	s +=n;
}
avg=s/5;
System.out.println("the sum of 5 no is:"+s+"\n the avg is :"+avg);

}}