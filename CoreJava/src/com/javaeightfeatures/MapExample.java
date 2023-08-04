package com.javaeightfeatures;
import java.util.Map;
import java.util.HashMap;

public class MapExample {
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put(2,"java");
		m.put(1,"html");
		m.put(4,"python");
		m.put(3,"c");
		System.out.println("java 8 feature map key and value");
		m.forEach((k,v)->{System.out.println(k+" = "+v);});
		
		
	}

}
