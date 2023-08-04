package com.collections.list;
import java.util.Vector;

public class VectorListExample {
	public static void main(String[] args) {
	Vector v=new Vector();
		//ADD METHOD
	v.add(45);
	v.add("sravani");
	v.add(0,22);
	v.add(45);
	System.out.println("add "+v);
	System.out.println();
	
	Vector v2=new Vector();
	v2.add("chinna");
	v2.add(33);
	
	//SIZE METHOD
	System.out.println("size: "+v.size());
	System.out.println();
	
	//CAPACITY
	System.out.println("capacity:"+v.capacity());
	System.out.println();
	
	//ADD ALL
	System.out.println(v);
	v.addAll(0,v2);
	System.out.println("add all"+v);
	System.out.println();
	
	//RETRIVAL METHOD
	System.out.println("retrival method :: "+v.get(1));
	System.out.println();
	
	//CONTAINS
	System.out.println("contains::"+v.contains(22));
	System.out.println();
	System.out.println("contains::"+v.contains(78));
	System.out.println();
	
	//CONTAIN ALL
	System.out.println("contains all::"+v2.containsAll(v));
	System.out.println();
	
	//SET
	v.set(1, "mummy");
	System.out.println();
	
	//GET
	System.out.println(v);
	System.out.println("set value::"+v.get(1));
	System.out.println();
	
	//INDEX OF OBJECT
	System.out.println("index of object ::"+v.indexOf(45));
	System.out.println();
	
	//LAST INDEX OF ELEMENT
	System.out.println("last index of element::"+v2.lastIndexOf("chinna"));
	System.out.println();
	
	//FIRST ELEMENT
	System.out.println("first index of element::"+v.firstElement());
	System.out.println();
	
	//LAST ELEMENT
	System.out.println("last element::"+v.lastElement());
	System.out.println();
	
	//REMOVE
	v.remove("sravani");
	System.out.println("remove::"+v);System.out.println();
	
	//REMOVE ALL
	
	v.removeAll(v2);
	System.out.println("remove all::"+v);
	System.out.println();
	
	//CLEAR
	v.clear();
	System.out.println("clear::"+v);
	}
}
