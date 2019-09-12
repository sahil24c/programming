package com.bridgelabz.algorithm;
import java.util.Scanner;

class Myutil {
    int binarysearchInt(int ele) {
        Scanner in = new Scanner(System.in);
        int start = 0;
        int end = ele - 1;
        while (start <= end) {
            int mid = (end + start) / 2;
            System.out.println("is this your number " + mid);
            String s = in.next();

            if (s.equals("yes"))
                return 0;
            else if (s.equals("no")) {
                System.out.println("is element greater?");
                String t = in.next();
                if (t.equals("no")) {
                    end = mid - 1;
                } else if (t.equals("yes")) {
                    start = mid + 1;
                }
            }
        }
        return 0;
    }
}
public class FindNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("hello stranger, I will guess your number");
        System.out.println("input your range");
        int n = in.nextInt();
        System.out.println("I will guess your number now");
        Myutil obj = new Myutil();
        int k = obj.binarysearchInt(n);


    }
}
