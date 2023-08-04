package com.pojo;

public class StudentExample {
private String s_name;
private int    s_mobile;

public StudentExample(String s_name,int s_mobile) {
 this.s_name=s_name;
 this.s_mobile=s_mobile;
	
}

public String getS_name() {
	return s_name;
}

public void setS_name(String s_name) {
	this.s_name = s_name;
}

public int getS_mobile() {
	return s_mobile;
}

public void setS_mobile(int s_mobile) {
	this.s_mobile = s_mobile;
}
}
