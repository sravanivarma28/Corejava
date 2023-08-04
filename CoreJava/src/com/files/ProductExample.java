package com.files;

public class ProductExample {
private String p_name;
private double p_price;
private double p_o_price;


 public ProductExample(String p_name,double p_price,double p_o_price){
	 this.p_name=p_name;
	 this.p_price=p_price;
	 this.p_o_price=p_o_price;
 }


public String getP_name() {
	return p_name;
}
public void setP_name(String p_name) {
	this.p_name = p_name;
}
public double getP_price() {
	return p_price;
}
public void setP_price(double p_price) {
	this.p_price = p_price;
}
public double getP_o_price() {
	return p_o_price;
}
public void setP_o_price(double p_o_price) {
	this.p_o_price = p_o_price;
}}