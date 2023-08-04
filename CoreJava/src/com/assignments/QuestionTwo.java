package com.assignments;

public class QuestionTwo {
public static void main(String[] args) {
	
	String s1= "Java";
	String s2 ="Programming";
	String s3 = s1=s2;
	
	System.out.println(s3=="JavaProgramming");
	System.out.println();
	System.out.println("another question");
	int a= 10,b=20,c=5;
	c+= ++a +b--;
	System.out.println("a = "+a+ ",b ="+b+",c "+c);  

	System.out.println();
	System.out.println("another question");
	int arr[]= {1,2,3,4,5};
	for(int i=0;i<arr.length;i++) {
		arr[1]*=2;
	}
	System.out.println(arr[3]);
}}
