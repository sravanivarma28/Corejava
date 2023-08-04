package com.numberpatterns;

public class TrianglePattern {
	
public static void main(String[] args) {
	for(int a=1,c=1;a<6;a++,c++) {
		for(int b=a;b<=5;b++) {
			System.out.print(" ");
		}
		for(int b=1;b<a;b++) {
			System.out.print(c+"");
        }
		for(int b=1;b<=a;b++) {
			System.out.print(c+"");

}
		System.out.println();
}}}
