package com.bridegelabz.datastructures;
import java.util.Scanner;

import com.bridgelabz.utility.calender;


		public class Calender {
			/*
			* The main function is written to take input from the user
			* and print the calendar
			*/
			public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				int month = in.nextInt();
				int year = in.nextInt();
				String[] months = { "","January", "February", "March", "April", "May", "June", "July", "August", "September",
						"October", "November", "December" };
				int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
				
				if (month == 2 && calender.isLeapYear(year)) {
					days[month] = 29;
				}
				System.out.println("\t\t " + months[month] + " " + year);
				System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
				
				int d = calender.dayWeek(month, 1, year);
				for (int i = 0; i < d; i++)
					System.out.print(" \t");
				for (int i = 1; i <= days[month]; i++) {
					System.out.print(i + "\t");
					if (((i + d) % 7 == 0) ) {
						System.out.println();
					}
				}
			}
		
	}

