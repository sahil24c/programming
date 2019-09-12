package com.bridgelabz.functional;

import java.util.Scanner;

public class CoinFlip {
	public static void main(String[] args) {
        System.out.println("Enter number of times you want to flip the coin");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int k = Math.abs(i);   //convert negative number to positive
        float tails=0,heads=0;
        System.out.println("So you want to flip coin for " + k + " times");

        //loop for number of times the coin has to be flipped
        for(int m =0;m<k;m++) {
            float j = (float) Math.random(); // type caste
            System.out.println(j);
            if (j < 0.5) {
                tails++;
                System.out.println("Its tails");
            }
            else {
                heads++;
                System.out.println(("Its heads"));
            }
        }

        System.out.println("Percentage of heads= " + (heads/k)*100);   //calculates % of heads
        System.out.println("Percentage of tails= " + (tails/k)*100);   //calculates % of tails
    }
}

