package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrrayListOne {
	public static void main(String[] args) {
	List l=new ArrayList();
//ADD METHOD
	l.add(34);
	l.add(67);
	l.add(true);
	l.add(59);
	l.add(2,44);
	l.add(1,90);
	System.out.println("add method of l "+l);
	System.out.println();
	
//ADD METHOD(INDEX ,ELEMENT)
	List lt=new ArrayList();

	lt.add(100);
	lt.add("sravani");
	lt.add(false);
	System.out.println("add method of lt "+lt);
	System.out.println();
	//SIZE
		System.out.println("size of l : "+l.size());
		System.out.println("size of lt : "+lt.size());
		System.out.println();
		
//ADD ALL METHOD
	l.addAll(lt);
	System.out.println("add all "+l);
	System.out.println();
	
//ADD ALL INDEX
	l.addAll( lt);
	System.out.println("add all index "+l);
	System.out.println();
	
//CONTAINS
	System.out.println("contain :: "+l.contains(59000));
	System.out.println();
	
//CONTAINS ALL
	System.out.println("contains all :: "+l.containsAll(lt));
	System.out.println();
	
//EQUALS
	System.out.println("equals :: "+lt.equals(l));
	System.out.println();
	
//SET
	l.set(1,"student");
	System.out.println("set"+l);
	System.out.println();
	
//GET
	System.out.println("get ::"+l.get(1));
	System.out.println();
	
//HASHCODE
	System.out.println("hashcode ::  "+lt.hashCode());
	System.out.println();
	
//INDEX OF ELEMENT
	System.out.println("index of lt :: "+lt.indexOf("sravani"));
	System.out.println("index of l ::"+lt.indexOf(59));
	System.out.println();
	
//IS EMPTY
	System.out.println("empty :: "+l.isEmpty());
	System.out.println();
	
//LAST INDEX OF ELEMENT	
	System.out.println("last index of lt ::"+l.lastIndexOf(lt));
	System.out.println();
	
 //REMOVE
	System.out.println("remove of l in 1 ::"+lt.remove(1));
	System.out.println();
	
//REMOVE ALL
	System.out.println("remove all ::"+l.removeAll(l));
	System.out.println();
	
//RETAIN ALL
	System.out.println("retain all::"+lt.retainAll(l));
	System.out.println();
	
//CLEAR
	l.clear();
	System.out.println("clear (): "+l);
	}}