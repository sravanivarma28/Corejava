package com.methods;

public class Bank {
	public static void main(String[] args) {
		Bank b= new Bank();
		greeCustomer();
		System.out.println("currentbalace :"+b.getCurrentBalance());
		b.deposit(500);
		System.out.println("currentbalace :"+b.getCurrentBalance());
		withdrawl(200);
		System.out.println("currentbalace :"+b.getCurrentBalance());
		
	}
   static int currentBalance=1000;	
	public static void greeCustomer() {
		System.out.println("welcome to bank");
	}
	public void deposit(int amount) {
		currentBalance=currentBalance+amount;
		System.out.println("amount deposited");
		
	}
	public static void withdrawl(int amount) {
		currentBalance= currentBalance-amount;
		System.out.println("amount withdrawn");
		
	}
	public int getCurrentBalance() {
		return currentBalance;
		
	}
	}
		