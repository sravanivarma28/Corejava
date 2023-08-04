package com.collections.list;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample{
	public static void main(String[] args) {
	
		ArrayList a=new ArrayList();
		a.add(87);
		a.add("like");
		LinkedList l=new LinkedList();
		
		//ADD
         l.add(44);
         l.add("yatiksha");
         l.add(22);
         l.add("chinna");
         l.add(1,10);
         System.out.println("add"+l);
         System.out.println();
         
         //ADD ALL
        l.addAll(0,a);
        System.out.println("add all"+l);
        System.out.println();
        
        //REMOVE
        l.remove(2);
        System.out.println(l);
        System.out.println("remove of index number = "+l.remove(3));
        System.out.println();
        
        //GET
        System.out.println(l);
        System.out.println("get ::"+l.get(3));
        System.out.println();
        
        //CONTAINS
        System.out.println("contains :: "+l.contains("anjali"));
        System.out.println();
        
        //SET
        l.set(2, "teacher");
        System.out.println("Set ::"+l);
        System.out.println();
        
        //CLEAR
        a.clear();
        System.out.println("clear ::"+a);
	}}

