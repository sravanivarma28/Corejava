package com.scannerassignments;

import java.util.Scanner;

public class SumEqual {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter 1st number");
	int a=s.nextInt();
	
	System.out.println("enter 2nd number");
	int b=s.nextInt();
	
	System.out.println("enter 3rd number");
	int c=s.nextInt();
	System.out.println("the result is = "+sumOfTwo(a,b,c));
}
public static boolean sumOfTwo(int x,int y,int z) {
	return ((x+y)==z||(y+z)==x||(z+x)==y);

}
}
