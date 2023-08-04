package com.starpatterns;

public class StarExample {
	public static void main(String[] args) {
		for(int a=1;a<=3;a++) {
			for(int b=1;b<=3;b++) {
				if(a==1&&b==2||a==2&&b==1||a==2&&b==3||a==3&&b==2)
				System.out.print(" ");
		
			else
				System.out.print("*");
		}
		System.out.println();
	}

}

}
