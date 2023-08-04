package com.iterativestatements;

	public class PrimeNumbers{
		
		public static void main(String[] args) {
		for(int a=50;a<=150;a++) {
			int count=0;
			for(int b=1;b<=a;b++) {
				if(a%b==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(a+",");
			}
		}

		}
}
