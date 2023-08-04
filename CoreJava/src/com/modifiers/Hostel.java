package com.modifiers;

public class Hostel {
	String hostelname;
	int    strength;
	long hostelfee;
	int   rooms;
	public static void main(String[] args) {
		Hostel h=new Hostel("s.v prime",30,5000, 11);
		
		System.out.println("hostelname = "+h.hostelname);
		System.out.println("strength = "+h.strength);
		System.out.println("hostelfee = "+h.hostelfee);
		System.out.println("rooms = "+h.rooms);
		
		// THIS KEYWORD
		
	}
	public Hostel(String hostelname,int strength ,long hostelfee,int rooms) {
		this.hostelname=hostelname;
		this.strength=strength;
		this.hostelfee=hostelfee;
		this.rooms=rooms;
	}

}

