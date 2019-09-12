package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Dater;
import java.util.Scanner;

public class Date {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();
        int m = in.nextInt();
        int y= in.nextInt();
        Date obj = new Date();
        
       Dater.date(d,m,y);

    }
}
