package com.bridgelabz.functional;

import java.util.Scanner;

public class LeapYear {
	 public static void main(String[] args) {
	        System.out.println("Enter the year you want to check for leap year");
	        Scanner in = new Scanner(System.in);
	        int i = in.nextInt();

	        int j= i/10000;
	        int k= i/1000;
	      //  System.out.println(j);
	      //  System.out.println(k);
	        if(j>=1 || k<=1)
	        {
	            System.out.println("Please enter 4 digits");
	        }
	        else
	        {
	            if(i%4==0)
	                System.out.println("Voila!, Leap year");
	            else
	                System.out.println("Not a leap year");
	        }
	    }
	}
	/* other logic
	type caste the year to string
	String s= String.valueOf(i);
	System.out.println(s.length());

	 */
