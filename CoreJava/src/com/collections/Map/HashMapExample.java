package com.collections.Map;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {
	public static void main(String[] args) {
		Map students =new HashMap();
		students.put(4,"manasa");
		students.put(1,"sravani");
		students.put(3,"raji");
		students.put(2,"manvi");
		
		System.out.println(students);
		//Map convert to set to get individual values
		
		Set s = students.entrySet();
		Iterator i= s.iterator();
		while(i.hasNext()) {
			Map.Entry keyvalues =(Map.Entry) i.next();
			
			System.out.println("Key = "+keyvalues.getKey()+" , "+"value = "+keyvalues.getValue());
			
		}
		
	}

}
