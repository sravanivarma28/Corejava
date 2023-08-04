package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySquareValues {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter number of rows");
		int rowSize = s.nextInt();
		int [][] arr = new int [rowSize][];
		for(int i=0;i<arr.length;i++) {
			
			System.out.println("column size in row number : = "+i);
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
		int [][] outputArr = new int [arr.length][];
		for(int i=0;i<arr.length;i++) {
			outputArr[i] = new int[arr[i].length];
			
			for(int j=0;j<arr[i].length;j++) {
				outputArr[i][j] = (int)Math.pow(arr[i][j], 2);
			}}
		System.out.println("output");
		for(int i=0;i<outputArr.length;i++) {
          System.out.println(Arrays.toString(outputArr[i]));
		}
		s.close();
	}}

