package com.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileaWithText{
public static void main(String[] args) throws Exception {
	File f=new File("./resume.txt");
	
  
    if(f.createNewFile()) {
    System.out.println("file created");
   }else {
	System.out.println("file not created");
}
   // FileWriter fw=new FileWriter("./resume.txt");
    FileWriter fw=new FileWriter("./resume.pdf");
    fw.write("file creation");
    fw.write("\njava technology");
    fw.write("\nhlo");
   
    fw.close();
}}
