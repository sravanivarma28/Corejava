package com.String;

public class StringReplace {
public static void main(String[] args) {
	String a="The quick brown fox jumps over the lazy dog";
	String b=a.replace('d', 'f');
	String c=a.replaceAll("dog", "cat");
	
	System.out.println("original string = "+a);
	System.out.println("New string = "+b);
	System.out.println();
	
	System.out.println("original string = "+a);
	System.out.println("New string = "+c);

}
}
