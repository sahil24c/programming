package com.bridgelabz.functional;

import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {
        System.out.println("enter number for prime factors");
        Scanner in = new Scanner(System.in);            
        int i = in.nextInt();                           //user input
        System.out.print("Prime factors are : ");
        for (int j=2;j*j<=i;j++)                        // 1 is neither prime nor composite     
        {
            while(i%j==0)                               // checking for factors
            {
               // System.out.println("i = "+i);
                System.out.println(j+",");                //print factors
                i=i/j;                                    //divide number by factors
            }
        }
        if(i>2)                                            //print all thats left of original number
        System.out.println(i);

    }
}