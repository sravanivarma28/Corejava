package com.javaeightfeatures;
import java.util.ArrayList;

public class LambdaExample {
	public static void main(String[] args) {
		ArrayList<StudentExample> a= new ArrayList<StudentExample>();
		a.add(new StudentExample(1,"sravani",9876435));
		a.add(new StudentExample(2,"chinna",84737457));
		a.add(new StudentExample(3,"raji",787485864));
		
		a.forEach((list)->{System.out.println(list.getId());});
		System.out.println();
		a.forEach((list)->{System.out.println(list.getName());});
		System.out.println();
		a.forEach((list)->{System.out.println(list.getMobile());});
	}  }
	class StudentExample{
		private int id;
		private String name;
		private int mobile;
		public StudentExample(int id, String name, int mobile) {
			
			this.id = id;
			this.name = name;
			this.mobile = mobile;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getMobile() {
			return mobile;
		}
		public void setMobile(int mobile) {
			this.mobile = mobile;
		}}
