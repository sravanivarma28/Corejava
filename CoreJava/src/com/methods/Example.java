package com.methods;

	public class Example {

		public static void main(String[] args) {
		//INSTANCE METHOD
			//Object
			Example e=new Example();
			e.OneExample();
			
			//STATIC METHOD
			//direct methodname(parameter)
			OneExample();
			
			//classname.methodname()
			Example.OneExample();
			System.out.println(twoExample());
			
		}static void OneExample() {
			System.out.println("miss universe");
		}
			static int twoExample() {
				return 55;
			}

}
