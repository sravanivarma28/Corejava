
package com.oopsconcepts.carapplications;
  import java.util.Scanner;
  
public class Car {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	
		System.out.println("input values");
		String values =s.next();
		//create objects 
		Engine engine=new Engine();
		EngineType enginetype =new EngineType();
		Dicky dicky =new Dicky();
		
		Doors doors=new Doors();
		
		Gear gear =new Gear();
		Seats seats =new Seats();
		
		Steering steering =new Steering();
		Tyres tyres =new Tyres();
		
		switch(values) {
		case "start":
			engine.start();
			break;
		case "stop":
			engine.stop();
			break;
		case "working":
			engine.working();
			break;
		case "petrol":
			enginetype.petrol();
			break;
		case"diesel":
			enginetype.diesel();
			break;
		case"electric":
			enginetype.electric();
			break;
		case"wheel":
			dicky.wheel();
			break;
		case"kit":
			dicky.kit();
			break;
		case"kit1":
			dicky.kit1();
			break;
		case"Adoor":
			doors.Adoor();
			break;
		case"mdoor":
			doors.mdoor();
			break;
		case"mwindow":
			doors.mwindow();
			break;
		case"manualtype":
			gear.manualtype();
			break;
		case "first":
			gear.first();
			break;
		case"second":
			gear.second();
			break;
		case"third":
			gear.third();
			break;
		case"automatic":
			gear.automatic();
			break;
		case"one":
			gear.one();
			break;
		case"two":
			gear.two();
			break;
		case"car1":
			seats.car1();
			break;
		case"car2":
			seats.car2();
			break;
		case"car3":
			seats.car3();
			break;
		case"steering":
			steering.steering();
			break;
		case"steering1":
			steering.steering1();
			break;
		case"steering2":
			steering.steering2();
			break;
		case"steering3":
			steering.steering3();
			break;
		case"type1":
			tyres.type1();
			break;
		case"type2":
			tyres.type2();
			break;
			default:
				System.out.println("data is invalid");
		}
	}

}
