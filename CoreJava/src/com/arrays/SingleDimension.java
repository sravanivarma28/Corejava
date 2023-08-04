package com.arrays;

	public class SingleDimension {
		public static void main(String[] args) {
			byte teacher[]= {6,9,44,55,};
			
			System.out.println(teacher.length);
			System.out.println(teacher[0]);
			System.out.println(teacher[1]);
			System.out.println(teacher[2]);
			System.out.println(teacher[3]);
		

			System.out.println("arr with forloop");
			for(byte v=0; v<teacher.length-1;v++) {
				System.out.println(teacher[v]);
			}
			System.out.println("arr with foreach");
			for(byte teachername:teacher) {
				System.out.println(teachername);
			}}
}
