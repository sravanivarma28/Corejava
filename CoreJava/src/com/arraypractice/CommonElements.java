package com.arraypractice;

public class CommonElements {
public static void main(String[] args) {
	int array[]= {2,3,45,65,32,45,6};
	int array1[]= {6,78,2,3,65,43};

	System.out.println("common elements");
	for(int i=0;i<array.length;i++) {
		for(int j=0;j<array1.length;j++) {
			
			if(array[i]==array1[j]) {
				System.out.print(array[i]+",");
			}
		
	}
}
}}
