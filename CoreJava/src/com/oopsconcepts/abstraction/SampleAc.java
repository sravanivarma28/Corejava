package com.oopsconcepts.abstraction;

public abstract class SampleAc implements Laptop {
	public abstract class lenovo implements Laptop  {
		public void copy() {
		System.out.println("copy code");
		}
		public void paste() {
			System.out.println("paste code");
		}
		public void cut() {
	System.out.println("cut code");
	}
		public void keyboard() {
			System.out.println("keyboard code");
		}
	}

}
