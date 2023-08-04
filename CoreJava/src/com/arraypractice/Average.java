package com.arraypractice;

public class Average {
public static void main(String[] args) {
	int numbers[] ={23,56,77,-79,3,56,78,200};
	
	//Calculate the sum of array
	
	int sum=0;
	for(int a=0;a<numbers.length;a++) 
	sum=sum+numbers[a];
	
	//calculate average value
	
	 int avarage=sum/numbers.length;
	System.out.println("Avarage value of array elements is = "+avarage);
}
}
