package com.files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class FilesWithProduct {
public static void main(String[] args) throws IOException {
	
	//FOR INPUTS USING SCANNER CLASS
	Scanner s=new Scanner(System.in);
	System.out.println("enter product size");
	
	//ARRAY SIZE TAKING FROM USER
	int size=s.nextInt();
	
	//based on size we are creating array products
	ProductExample products[]=new ProductExample[size];
	
	//based on array size repeating loop taking product information
	for(int a=0;a<size;a++) {//0<2 ==> true
		String p_name=s.next();
		double p_price=s.nextDouble();
		double p_o_price=s.nextDouble();
		
	//based on position we are inserting product information in array
		products[a]=new ProductExample(p_name,p_price,p_o_price);
	}
    String filepath="C:\\Users\\fde\\Documents\\varma\\src\\com\\product.txt";
    
    //file class object for file creation
    File file=new File(filepath);
    
    if(file.createNewFile()) {
    	System.out.println("file created");
    }else {
    	System.out.println("file not created");
    	FileWriter fw=new FileWriter(filepath);
    	fw.write("   Product name    ||   product price   ||   procuct offer price   ||  \n");
    	
    	for(ProductExample Product:products) {
    		fw.write("   ||   "   +Product.getP_name() +"   ||   "    + Product.getP_price()+"   ||   "    +Product.getP_o_price()+"   ||  \n");
    	}
    	fw.close();
    }}}
    	
