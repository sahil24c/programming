package com.bridgelabz.utility;

public class calender {

	public static int dayWeek(int month, int i, int year)
	{ 
	int y = year - (14 - month) / 12;
	System.out.println("y= " +y);
	int x = y + y/4 - y/100 + y/400;
	int m = month + 12 * ((14 - month) / 12) - 2;
	int d = (i + x + (31*m)/12) % 7;
	return d;
	}
	
	public static boolean isLeapYear(int year)
	{
	        if  (((year % 4 == 0) && (year % 100 != 0))||year % 400 == 0) return true;
	        else return false;
}	
}
