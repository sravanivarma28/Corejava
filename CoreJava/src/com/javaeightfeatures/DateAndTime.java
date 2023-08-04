package com.javaeightfeatures;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTime {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);

		System.out.println("year ="+date.getYear());
		System.out.println("month ="+date.getMonth());
		System.out.println("date = "+date.getDayOfMonth());
		System.out.println("day ="+date.getDayOfWeek());

		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.getHour());
		System.out.println(time.getSecond());
		System.out.println(date.adjustInto(date));
		System.out.println("day start= "+date.atStartOfDay());
		System.out.println("given time = "+date.atTime(3,30));

		System.out.println(date.atTime(time));
		System.out.println("date equals to another date = "+date.equals(2023-05-19));
		System.out.println("plus year = "+date.plusYears(5));
		System.out.println("minus days = "+date.minusDays(3));

	}}
