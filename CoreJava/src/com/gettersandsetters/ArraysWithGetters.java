package com.gettersandsetters;

public class ArraysWithGetters {
	public static void main(String[] args) {
		StudentClass s1=new	StudentClass();
		s1.setName("sravani");
		s1.setRank(2);
		s1.setRegno(123);
		
		StudentClass s2=new	StudentClass();
		
		s2.setName("varma");
		s2.setRank(5);
		s2.setRegno(154);
		StudentClass  studentclass []= {s1,s2};
		
		for(int a=0;a<studentclass.length;a++) {
			System.out.println(studentclass [a].getName());
			System.out.println(studentclass [a].getRank());
			System.out.println(studentclass [a].getRegno());
		}
		}
}
