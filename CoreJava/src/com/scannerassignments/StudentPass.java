package com.scannerassignments;

import java.util.Scanner;

public class StudentPass {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter a number");
		
		int marks = scanner.nextInt();
	if(marks<35) 
		   System.out.println(" student failed");
	   else if  (marks==35)
		   System.out.println("student is just passed");
	
	   else if  (marks>35 && marks<70)
		   System.out.println("student passed in third class");
	
	   else if  (marks>70 && marks<85)
		   System.out.println("student passed second class");
	
	   else
		   System.out.println("student passed first class");
	   }


}
