package com.arraypractice;

public class ArrayDifference {
public static void main(String[] args) {
	int array[]= {5,8,9,32,34,3,7,9};
	
	int largest = array[0];
	int smallest = array[0];
	for(int i=0;i<array.length;i++) {
		
		if(array[i]>largest)
			largest=array[i];
		else if(array[i]<smallest)
			smallest=array[i];
			
	}
	System.out.println("Difference between largest and smallest values of array is = "+(largest-smallest));
	
	
}
}
