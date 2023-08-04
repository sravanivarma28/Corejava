package com.operators;

public class ArithmeticExample {

		public static void main(String[] args) {
			int a=88;
			int b=90;
			
			//INSTANCE METHOD
		
			//create object classname refname=new classname
			ArithmeticExample ae=new ArithmeticExample();
			ae.add(a,b);
			ArithmeticExample si =new ArithmeticExample();
			si.sub(a,b);
			ArithmeticExample mi=new ArithmeticExample();
			mi.multiply(a,b);
			
			ArithmeticExample di=new ArithmeticExample();
			di.division(a,b);
			ArithmeticExample md=new ArithmeticExample();
			md.module(a,b);
		}
		public void add(int a,int b){
		System.out.println("add="+(a+b));
		}
		
		public void sub(int a,int b){
			System.out.println("sub="+(a-b));
		}
		
		public void multiply(int a,int b){
			System.out.println("multiply="+(a*b));
		}
		public void division(int a,int b){
			System.out.println("division="+(a%b));
		}
		public void module(int a,int b){
			System.out.println("module="+(a%b));
		}}

