package com.arrays;

// DECREASING ORDRWISE ELEMENTS 
public class OrderWise{
	public static void main(String[] args) {
		
	int b=0;	
int a[]= {55,22,5,6,77,1,};
for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		
	if(a[i]>a[j]) {
		b=a[i];
		a[i]=a[j];
	     a[j]=b;
	}}}
for(int i=0;i<a.length;i++) {

	System.out.print("  "+a[i]);
}}}