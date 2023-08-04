package com.arraypractice;

import java.util.Arrays;

public class SortingArray {
public static void main(String[] args) {
	int array[]= {78,4,67,54,234,4,56,22,25,789};
	
	String values[]= {"c","c++","java","python","AWS","Devops","Testing"};
	
	System.out.println("Original array = "+Arrays.toString(array));
	System.out.println();
	
	Arrays.sort(array);
	System.out.println("sorted  array = "+Arrays.toString(array));
	System.out.println();
	
	System.out.println("Original String array = "+Arrays.toString(values));
	System.out.println();
	
	Arrays.sort(values);
	System.out.println("sorted String array = "+Arrays.toString(values));
}
}
