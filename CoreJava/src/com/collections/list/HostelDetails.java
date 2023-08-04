package com.collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HostelDetails {
	public static void main(String[] args) {
		Collection c=new ArrayList();

		c.add("hostel name : laxmiSrinivasa");
		c.add( "hostel fee :5000");
		c.add(" members :60");
		c.add("5 floors");
		System.out.println(c);
		Iterator hostel=c.iterator();
		
		while(hostel.hasNext()) {
			System.out.println(hostel.next());
			System.out.println(hostel.hasNext());
	}
		Iterator details=c.iterator();
         for(;details.hasNext();) {
        	 System.out.println("for iterator ="+details.hasNext());
        	 System.out.println("for iterator = "+details.next());
         }
	}}
