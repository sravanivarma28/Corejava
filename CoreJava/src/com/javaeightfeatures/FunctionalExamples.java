package com.javaeightfeatures;

import java.util.function.Function;
import java.util.ArrayList;

public class FunctionalExamples {
	public static void main(String[] args) {
		Function<String,Integer> f = s->s.length();
		
		ArrayList<String> a =new ArrayList();
		a.add("sravas");
		a.add("manasa");
		a.add("manvita");
		a.add("yaksha");
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i)+" : "+f.apply(a.get(i)));
			
			
	}
}

}