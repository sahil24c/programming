package com.bridgelabz.functional;

import java.util.Scanner;

public class Gambler {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter number of plays");
        int i = in.nextInt();
        System.out.println("enter stack balance");
        int j = in.nextInt();
        System.out.println("enter winning amount");
        int k = in.nextInt();

        float win=0;
        float lose=0;
        for (int a = 0; a < i; a++) {
            float m = (float) Math.random();                //generates random number
            System.out.println(m);                             
            if (m >= .5) {                                    // number greater than .5 is a win
                j++;
                win++;
            } else if (m < .5) {                              // number less than .5 is a loss
                j--;
                lose++;
            }
            if (j>=k)                                      //if stack is equal or greater to winning amount, then win 
            {
                System.out.println("you have won");
            }
            if (j<=0)                                       //if stack is 0 then you have lost                 
            {
                System.out.println("you lost");
            }
        }
        System.out.println("win % :" + win/i *100);              // calculates win %
        System.out.println("lose % :" + lose/i *100);             // calculates loss %

    }