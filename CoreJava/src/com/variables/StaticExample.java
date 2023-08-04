package com.variables;

	public class StaticExample {
		static int a=33;
		static boolean b=true;
		
		public static void main(String[] args) {
			//create object classname refname=new classneme()
			StaticExample se=new StaticExample();
			
			//use refname.variablename
			System.out.println(se.a);
			System.out.println(se.b);
			
			//use static variable by using classname
			System.out.println(StaticExample.a);
			System.out.println(StaticExample.b);
			
			//use direct variablename
			System.out.println(a);
			System.out.println(b);
		}}


