package com.abstraction;

public class School {
public static void main(String[] args) {
	StudentImpl s= new StudentImpl();
	s.registration();
	s.login();
	s.notes();
	s.interview();
	}}
	interface StudentService{
		public void videos();

		public void login();
		public void registration();
		public void notes();
		public void interview();
		public void quiz();
	}
	class StudentImpl implements StudentService {
		
		public void videos() {
		System.out.println("videos");
		}
		public void quiz() {
		}

		public void login() {
			System.out.println("student login");
		}
		public void registration() {
			System.out.println("registration");
		}
		public void notes() {
			System.out.println("notes");
		}
		public void interview() {
			System.out.println("interview");
          }}