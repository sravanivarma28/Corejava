package com.pojo;

import java.util.ArrayList;

public class Example {
public static void main(String[] args) {
	ArrayList<PostExample> al=new ArrayList<PostExample>();
	al.add(new PostExample("java","average"));
	al.add(new PostExample("HTML","good"));
	
	for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i).getP_title());
		System.out.println(al.get(i).getP_comments());
	}
}}

class PostExample{
	private String p_title;
	private String p_comments;

	 public PostExample(String p_title, String p_comments) {
		 this.p_title=p_title;
		 this.p_comments=p_comments;
		 
	 }
	public String getP_title() {
		return p_title;
	}
	public String getP_comments() {
		return p_comments;
	}
}

