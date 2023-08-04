package com.starpatterns;

public class ReverseCross {
	public static void main(String[] args) {
		for(int a=1;a<=3;a++) {
			for(int b=3;b>=a;b--) {
				if(a==b)
				System.out.print(" *");
		
			else
				System.out.print("  ");
		}
		System.out.println();
	}

}
}
