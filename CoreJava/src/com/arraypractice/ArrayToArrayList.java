package com.arraypractice;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
public static void main(String[] args) {
	
	String a[]= {"hlo","world","java","python","c"};
	ArrayList<String> list=new ArrayList<String>(Arrays.asList(a));
	
	System.out.println(list);
	
}
}
