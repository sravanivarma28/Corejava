package com.arrays;

public class LowestValue {
public static void main(String[] args) {
	
	int a[]= {5,6,8,3,77};
	int min=a[0];
	for(int b=0;b<a.length;b++) {
		if(min>a[b]) {
			min=a[b];
			
		}
	}
System.out.println(min);
}
}
