package com.scanner;
import java.util.Scanner;

// INCREASING OR DECREASING ORDER

public class IncreasingOrDecreasing {
	
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("first number");
	int a=s.nextInt();
	System.out.println("second number");
	int b=s.nextInt();
	System.out.println("third number");
	int c=s.nextInt();

if(a<b&&b<c) {
	System.out.println("increasing order");
}else if(a>b&&b>c) {
	System.out.println("decreasing order");
}else {
	System.out.println("neither increasing or decreasing");

}}}

