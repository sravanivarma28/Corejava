package com.files;

import java.util.Scanner;

public class EmployeeDetails {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("Number of Employes");
	
	int a= s.nextInt();
	Employes employe[]=new Employes[a];
	
     for(int i=0;i<a;i++) {
	employe[i] = new Employes();
	
	System.out.println("Enter "+(i+1)+" Employee data");
	
	System.out.println("Employee name");
	employe[i].name=s.next();
	
	System.out.println("Employee mobile");
	employe[i].mobile=s.nextInt();
	
	System.out.println("Employee email");
	employe[i].email=s.next();
	
	System.out.println("Employee salary");
	employe[i].salary=s.nextLong();
	
	System.out.println("Employee bonus");
	employe[i].bonus=s.nextInt();
	
	System.out.println("Employee joiningDate");
	employe[i].joiningDate=s.next();
	
	System.out.println("Employee designation");
	employe[i].designation=s.next();
   
	}}}
	
	class Employes{
		 String name;
		 int    mobile;
		 String email;
		 long   salary;
		 int   bonus;
		 String   joiningDate;
		 String designation;
	}
