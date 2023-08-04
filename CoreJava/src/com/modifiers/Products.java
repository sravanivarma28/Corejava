package com.modifiers;

//THIS KEYWORD

public class Products{
	String productname;
	int quantity;
    String colour;
    double cprice;
    public static void main(String[] args) {
    	Products p=new Products("earphones",3,"black",3000.33);
    	
		System.out.println("product name = "+p.productname);
		System.out.println("product quantity = "+p.quantity);
		System.out.println("product colour = "+p.colour);
		System.out.println("product price = "+p.cprice);
	}
       public Products(String productname,int quantity, String colour,double price) {
    	//this.variablename=argmentname
    	
    	this.productname=productname;
    	this.quantity=quantity;
    	this.colour=colour;
    	//variable name and argmentname different not required this keyword
    	cprice=price;
    }

}
