package com.pojo;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentDetails {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter no of Students");
	
	ArrayList<StudentExample> a=new ArrayList<StudentExample>();
	int size=s.nextInt();
	for(int i=0;i<size;i++ )
		
	a.add(new StudentExample (s.next(),s.nextInt()));
	
	for(int i=0;i<a.size();i++) {
		System.out.println(a.get(i).getS_name());
		System.out.println(a.get(i).getS_mobile());
		System.out.println("=====================");
	}
}
}
