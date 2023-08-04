package com.operators;

  public class AssignmentExample {
	public static void main(String args[]) {
		int a=6;
		int b= 5;
		//addition
		a+=b;
		System.out.println("assignment with sum ::"+(a+=b));
		System.out.println("assignment with sub ::"+(a-=b));
		System.out.println("assignment with multiply ::"+(a*=b));
		System.out.println("assignment with di ::"+(a/=b));
		System.out.println("assignment with module ::"+(a%=b));
	}

}
