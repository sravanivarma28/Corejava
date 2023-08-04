package com.javaeightfeatures;

public class DefaultMethod {
	public static void main(String[] args) {
		E1 e = new E1();
		e.one();
		e.two();
		e.three();
		
	}}
	interface Example{
		public void one();
		public void two();
		public default void three (){
			System.out.println("sravani");
		}
	}
	class E1 implements Example{
		public void one() {
		System.out.println("hi");
		}
		public void two() {
			System.out.println("hlo");
			
		}
		
		
	}


