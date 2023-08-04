package com.numberpatterns;

public class LeftTg {
	public static void main(String[] args) {
		for(int a=1;a<=3;a++) {
			for(int b=1;b>=a;b--) {
				if(a==1&&a==1&&a==1&&b==2&&a==1&&b==3||a==2&&b==2&&b==3||a==3&&b==3) {
					System.out.print(" ");
				}else {
					System.out.println(a+" ");
				}
				
			System.out.println();
		}
		}
	}

}
