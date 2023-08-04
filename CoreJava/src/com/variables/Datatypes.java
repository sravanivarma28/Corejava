package com.variables;
	public class Datatypes {
		static byte a=1;
		static int b=2;
		static short c=44;
		static long d=100;
		static float e=6.7f;
		static double f=3;
		static boolean g=false;
		static char h='5';
		static String i="chinna";
		
		public static void main(String[] args) {
			Datatypes d=new Datatypes();
			d.one();
			Datatypes dt=new Datatypes();
			dt.two();
			
		}public void one(){
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				System.out.println(e);
				System.out.println(f);
				System.out.println(g);
				System.out.println(h);
				System.out.println(i);
			System.out.println("using static method");}
		
			public static void two() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				System.out.println(e);
				System.out.println(f);
				System.out.println(g);
				System.out.println(h);
				System.out.println(i);
			}}

