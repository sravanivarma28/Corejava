package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverseOrder {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter arraysize");
		int arraysize = s.nextInt();

		System.out.println("enter array"); 
		int array [] = new int[arraysize];

		System.out.println("enter array values");
		for(int i=0;i<arraysize;i++) {
			array[i] = s.nextInt();
		}
		System.out.println("input = "+Arrays.toString(array));
		int [] revArr = new int[array.length];

		for(int i=0;i<array.length;i++) {
			revArr[array.length-i-1] = array[i];
		}
		System.out.println("revArr = "+Arrays.toString(revArr));

		s.close();

	}
}
