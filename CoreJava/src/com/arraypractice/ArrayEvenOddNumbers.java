package com.arraypractice;

public class ArrayEvenOddNumbers {
public static void main(String[] args) {
	int array[]= {3,4,67,22,5,9,23,4,5,6};
	
	int a=0;
	for(int i=0;i<array.length;i++) {
		if(array[i]%2==0)
			a++;
	}
	System.out.println("Even numbers = "+a++);
	System.out.println("odd numbers = "+(array.length-a));
}
}
