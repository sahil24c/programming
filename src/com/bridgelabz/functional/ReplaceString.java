package com.bridgelabz.functional;

import java.util.Scanner;  //scanner class
public class ReplaceString {

    public static void main(String[] args) {
        System.out.println("Enter name");
        Scanner in = new Scanner(System.in);   //object of scanner class
        String str1 = in.nextLine();           //ask for input
        if (str1.length()>3)		       //check condition
        System.out.println("Hello: "+ str1);   //prints name
        else
            System.out.println("Provided name is too small");  //invalid condition
    }
}
