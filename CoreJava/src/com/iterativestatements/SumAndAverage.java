package com.iterativestatements;

public class SumAndAverage {
public static void main(String[] args) {
	int a[]= {2,4,5,66,78,89};
	int sum=0;
	for(int value:a) {
		sum+=value;
	}
	System.out.println(sum);
	System.out.println(sum/a.length);
	}
}
