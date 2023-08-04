package com.assignments;

public class CircleArea {
public static void main(String[] args) {
	double radius=7.5;
	
	//PERIMETER OF CIRCLE FORMULA == > 2(PI)r
	//AREA OF CIRCLE FORMULA ==> (PI)r(square)
	
	double perimeter=2*Math.PI* radius ;
	double area= Math.PI* radius*radius ;
	
	System.out.println("perimeter is = "+perimeter);
	System.out.println("area = "+area);
}
}
