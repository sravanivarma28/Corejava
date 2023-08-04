package com.arrays;
//REMOVE DUPLICATE ELEMENTS

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		int a[]= {5,7,8,5,6,7,8,9};

		System.out.println("remove duplicate elements");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {

				if(a[i]==a[j]) {
					System.out.println(a[j]);	
				}
			}}
	}}
