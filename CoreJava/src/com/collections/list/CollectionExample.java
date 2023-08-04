package com.collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExample {
	public static void main(String[] args) {
	
		 Collection c=new ArrayList();
		 c.add(22);
		 c.add("list 1 ");
		 c.add(55.67);
		 c.add(true);
		 c.add('g');
		 System.out.println(c);
		 Iterator i=c.iterator();
			while(i.hasNext()) {
				
				System.out.println(i.next());
				System.out.println(i.hasNext());
			}
			 Iterator it=c.iterator();
		 for(;it.hasNext();) {
			 System.out.println("for iterator "+it.next());
			 System.out.println("for iterator "+it.hasNext());
		 }
		
	}

}
