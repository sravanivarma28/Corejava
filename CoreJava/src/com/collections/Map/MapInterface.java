package com.collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
	public static void main(String[] args) {
		Map m=new HashMap();
		m.put(878,"hlo");
		m.put(38,"chinna");
		m.put(242, "sravani");
		m.put(8838,"varma");
		m.put(5674, "sravani");
		m.put("hd",59);
		
		System.out.println("put method"+m);
	   System.out.println();
	   
		Map m2=new HashMap();
	     m2.put("one",99);
	     m2.put(2,"hlo");
	     m2.put("true",45);
	     
	     System.out.println("put method = "+m2);
	     System.out.println();
	     
	  //PUTALL
	    m.putAll(m2);
	    System.out.println("put all = "+m);
	    System.out.println();
	    
	    // REMOVE KEY
	     System.out.println("remove object key  = "+m.remove(242));
	     
	     //REMOVE VALUE
	     System.out.println("remove object key value = "+m.remove("chinna"));
	     System.out.println();
	     
	//  SIZE
	  System.out.println("size of m = "+m.size());
	  System.out.println("size of m2 = "+m2.size());
	  System.out.println();
	  
	 // EQUALS
	  System.out.println("equals = "+m.equals("puppy"));
	  System.out.println();
	  
	  // CONTAINS KEY
	     System.out.println("contains key value = "+m.containsKey(42));
	     System.out.println();
	     
	     //CONTAINS VALUE
	     System.out.println("contains object value = "+m.containsValue("chinna"));
	     System.out.println();
	  
	  //INSERT A VALUE
	   m.put(38, "puppy");
	   System.out.println("insert a value = "+m);
	   System.out.println();
	     
	  // IS EMPTY
	  System.out.println("m is empty = "+m.isEmpty());
	  System.out.println();
	  
	   // CLEAR
	   m2.clear();
	  System.out.println("clear m2 = "+m2);
	}}
