package com.pojo;

public class PojoExample {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(1);
		e.setName("sravani");
		e.setSlary(70000);
		
		Employee e2=new Employee();
		e2.setId(2);
		e2.setName("chinna");
		e2.setSlary(60000);
		
		Employee employee[]= {e,e2};
		for(int a=0;a<employee.length;a++) {
			
			System.out.println(employee[a].getId());
			System.out.println(employee[a].getName());
			System.out.println(employee[a].getSlary());
		}
	}

}
