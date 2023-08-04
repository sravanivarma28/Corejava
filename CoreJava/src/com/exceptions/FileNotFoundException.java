package com.exceptions;

import java.io.FileReader;
import java.io.BufferedReader;

public class FileNotFoundException {
	public static void main(String[] args) throws Exception {
		
		FileReader f = new FileReader("/notes.txt");
		BufferedReader b = new BufferedReader(f);
		String data = null;
		
		while((data = b.readLine())!=null) {
			System.out.println(data);
		}
		
		
	}

     }
