package com.javaeightfeatures;

import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {
		 Function <String,Integer> f = s->s.length();
			
			  System.out.println("length = "+ f.apply("sravani"));
	}
public int lengthOfString(String a) {
	return a.length();

}
}
