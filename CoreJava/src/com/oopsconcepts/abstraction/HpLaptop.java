package com.oopsconcepts.abstraction;

public abstract class HpLaptop {
	public abstract class lenovo implements Laptop  {
		public void copy() {
		System.out.println("hp copy code");
		}
		public void paste() {
			System.out.println("hp paste code");
		}
		public void cut() {
	System.out.println("hp cut code");
	}
		public void keyboard() {
			System.out.println("hp keyboard code");
		}
		public void printing() {
			System.out.println("printing code");
		}
		
	}

}
