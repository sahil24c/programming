package com.bridgelabz.functional;
import java.util.Random;
import java.util.Scanner;

class Randomno {
    //function to generate random number
    public static int func(int n) {

        int rand = (int) (Math.random()* n); //((100 - 10) + 1)) + 10;
        //random numbers till 10 will be generated
        System.out.println("your random number: "+rand);
        return rand;
    }


    public static int total(int n) {
        boolean[] occured = new boolean[n];
        //boolean array initialized
        int distinct = 0;
        int total = 0;
        //2 counters
        while (distinct < n) {
            int value = Randomno.func(n);
            //getting random values
            total++;
            //if index is false then enter the loop
            if (!occured[value]) {
                distinct++;
                System.out.println("distinct " +distinct);
                occured[value] = true;
                //value at index changed from false to true
            }
        }

        return total;
    }
}


public class CouponGenerate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of coupons");
        int n= in.nextInt();
        // number of random numbers required
        int total = Randomno.total (n);
        System.out.println(total);

    }

}
