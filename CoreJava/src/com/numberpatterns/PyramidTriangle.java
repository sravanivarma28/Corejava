package com.numberpatterns;
import java.util.Scanner;

public class PyramidTriangle {
	
	public static void main(String[] args) {
	
		System.out.print(" number of rows ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=n+4-1;
		for(int i=1;i<=n;i++){
			for(int x=s;x!=0;x--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
			s--;
		}
		
	}
	

}
