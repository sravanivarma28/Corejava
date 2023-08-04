package com.multithreading;

public class RunnableExample {
	public static void main(String[] args) {
		Example e =new Example();
		
		Thread t =new Thread(e);
		t.start();
		e.run2();
	     }
            }
class Example implements Runnable{
	
	public void run() {
		System.out.println("runnable");
		
	}
	public void run2() {
		System.out.println("example two");
	}
    }
