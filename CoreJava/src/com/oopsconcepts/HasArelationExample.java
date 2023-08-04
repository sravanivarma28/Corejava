package com.oopsconcepts;

public class HasArelationExample {
public static void main(String[] args) {
	car c=new car();
	c.carfunctionalities();

}
}
//USING STATIC
class car{
	static engine e=new engine();
	public void carfunctionalities() {
	e.start();
	e.stop();

}}
class engine{
	public static void start() {
		System.out.println("start engine");
}
	public void stop() {
		System.out.println("stop engine");
		
	}}
