package com.bridgelabz.functional;

import java.util.Scanner;

public class HarmonicSeries {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();    //enters user input
        float k=0;
        if(i==0) {
            System.out.println("invalid");          //no harmonic series for 0
        }
        else {
            for (int j=1;j<=i;j++)
            {
                k=(float)1/j+k;             //calculates harmonic values
                System.out.println(k);
            }
            }
    }
}
