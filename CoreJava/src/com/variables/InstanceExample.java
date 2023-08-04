package com.variables;

	 public class InstanceExample {
		   int a=33;
		   byte b=22;
		   public static void main(String[] args) {
			   
			//create object classname refname=new classname()
			   InstanceExample ie=new InstanceExample();
			   
			   //use refnaname.variablename
			   System.out.println(ie.a);
			   System.out.println(ie.b);
		}

}
