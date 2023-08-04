package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class SecondDimensionArraySum {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of rows");
		int rowSize = s.nextInt();
		
		int [][] arr = new int [rowSize][];
		for(int i=0;i<rowSize;i++) {
			
			System.out.println("column size in row : = "+i);
			int colSize = s.nextInt();
			arr[i] = new int[colSize];
			
			System.out.println("enter column values for rows : "+i);
			for(int j=0;j<colSize;j++) {
				arr[i][j] = s.nextInt();	
			}}
		System.out.println("input");
		for(int i=0;i<arr.length;i++) {
          System.out.println(Arrays.toString(arr[i]));
		}
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum +=arr[i][j];
			}
		}
		System.out.println("output = sum of arrays"+sum);
		s.close();
	}}

