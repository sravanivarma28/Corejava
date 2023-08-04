package com.javaeightfeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
	public static <count> void main(String[] args) {
		ArrayList<Student> a = new ArrayList<Student>();
		
		a.add(new Student("sravani",480,800,89));
		a.add(new Student("manasa",380,600,56));
		a.add(new Student("vinay",520,700,72));
		a.add(new Student("yaksha",420,750,62));
		
   List <Student> Marks = a.stream().filter(n->n.getAverage()<75).collect(Collectors.toList());
   long count  = a.stream().map(n->n).count();
   System.out.println(count);
   
   
 System.out.println(Marks.get(0).getName());
    for(Student values:Marks){
	
	} } }
class Student{
	private String name;
	private int ssc_marks;
	private int inter__marks;
	private int average;
	
	public Student(String name, int ssc_marks, int inter__marks, int average) {
		
		this.name = name;
		this.ssc_marks = ssc_marks;
		this.inter__marks = inter__marks;
		this.average = average;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSsc_marks() {
		return ssc_marks;
	}

	public void setSsc_marks(int inter_marks) {
		this.ssc_marks = inter_marks;
	}

	public int getInter__marks() {
		return inter__marks;
	}

	public void setInter__marks(int inter__marks) {
		this.inter__marks = inter__marks;
	}

	public int getAverage() {
		return average ;
	}

	public void setAverage(int average) {
		this.average = average;
	}}
