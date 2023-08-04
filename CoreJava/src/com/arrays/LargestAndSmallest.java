package com.arrays;
//LARGEST AND SMALLEST NUMBERS

public class LargestAndSmallest {

	public static void main(String[] args) {
		int a []= {7,3,55,67,89};
		int large=a[0];
		int small=a[0];
		for(int b=1;b<a.length;b++) {
			if(a[b]>large) 
				large=a[b];
			else if(a[b]<small) 
				small=a[b];
		}
		System.out.println("largest number is = "+large);
		System.out.println("smallest number is = "+small);
	}
}
