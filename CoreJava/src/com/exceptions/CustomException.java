package com.exceptions;

public class CustomException {
public static void main(String[] args) throws ClassNotComeException {
		
		one();
		
		throw new ClassNotComeException("fever");
		
	}

  static void one() {
	System.out.println("one");

}
}
   class ClassNotComeException extends Exception {
	public ClassNotComeException(String a) {
		System.out.println(a);
	
	}

}