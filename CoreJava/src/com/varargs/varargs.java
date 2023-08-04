package com.varargs;
	public class varargs {
		public static void main(String[] args) {
			z(8,6,4);
			z(5,6,8,9);
		}
		static void z(int a,int b,int...m) {
			System.out.println("hlo::" +a);
        	System.out.println("hlo::"+b);
			for(int c:m)
				System.out.println(c);
		}
}
