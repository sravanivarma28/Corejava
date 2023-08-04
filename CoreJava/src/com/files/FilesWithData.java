package com.files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class FilesWithData {
public static void main(String[] args) throws IOException {
	
	Scanner s =new Scanner(System.in);
	System.out.println("enter product size");
	int size=s.nextInt();
	
	double money[] = new double[size];
	for(int a=0;a<money.length;a++) {
	money[a]=s.nextDouble();	
	}
	for(double m:money)
		System.out.println(m);
	
	File f=new File("./notes.txt");
	if(f.createNewFile()) {
		System.out.println("file created");
		
	}else {
		FileWriter fw=new FileWriter("./notes.txt");
		System.out.println("file not create");
		fw.write(" product name          =  =   product price");
		fw.write("\nRedmi Mobile         =  =    15000");
		fw.write("\nLaptop               =  =    75000");
		fw.write("\nVivo charger         =  =    1200");
		fw.write("\nBluetooth Headset    =  =    2999");
		fw.write("\nMouse                =  =    200 ");
		fw.write("\nKeyboard             =  =    150");
		fw.close();
         }}}
