package com.multithreading;

public class ThreadExample {
	public static void main(String[] args) {
		
		ExampleThread et = new ExampleThread();
		et.start();
		for(int i=0;i<6;i++) {
			System.out.println("main method");	
		
	}}}

	class ExampleThread extends Thread{
		public void run() {
			for(int i=0;i<3;i++) {

			System.out.println("example thread");
			
		}}
	}
		
	

