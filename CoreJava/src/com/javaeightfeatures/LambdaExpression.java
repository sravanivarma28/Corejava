package com.javaeightfeatures;
import java.util.ArrayList;

public class LambdaExpression {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(6);
		a.add(34);
		a.add(2);
		a.add(9);
	System.out.println("from java 8 features");
		
		a.forEach((names)->{System.out.println(names);});
	}

}
