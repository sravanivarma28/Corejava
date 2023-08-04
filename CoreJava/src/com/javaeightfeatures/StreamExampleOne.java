package com.javaeightfeatures;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleOne {
public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList();
	for(int i=0;i<=100;i++)
		a.add(i);
	
	//filter
	List<Integer> oddNumbers = a.stream().filter(n->n%2!=0).collect(Collectors.toList());
	System.out.println(oddNumbers);
	System.out.println();
	
	//map
	long count = a.stream().map(n->n).count();
	System.out.println(count);
	List<Integer> addThree= a.stream().map(n->n+3).collect(Collectors.toList());
	System.out.println(addThree);
}
}
