package com.javaeightfeatures;
import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {


		ArrayList<Integer> a = new ArrayList();
		a.add(6);
		a.add(8);
		a.add(9);
		a.forEach((n)->{System.out.println(n*n*n);});

	}
}
