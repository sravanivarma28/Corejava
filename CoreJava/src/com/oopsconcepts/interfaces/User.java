package com.oopsconcepts.interfaces;

public class User {
	public static void main(String[] args) {
		Lenovo l=new Lenovo();
			l.copy();
		l.cut();
		l.paste();
	//	l.security();
	//	laptop.audio();
		
		HpLaptop h=new HpLaptop();
		h.printing();
		h.copy();
		//h.security();
	}

}
