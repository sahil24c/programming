package com.bridgelabz.functional;
import java.util.Scanner;
public class QuadraticRoots {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a");
        int a = in.nextInt();

        System.out.println("enter b");
        int b = in.nextInt();

        System.out.println("enter c");
        int c = in.nextInt();
        System.out.println("roots of equation are");
        int delta= b*b - 4*a*c;
        double root1= (double)(-b + Math.sqrt(delta))/(2*a);
        double root2 = (double)(-b - Math.sqrt(delta))/(2*a);
        System.out.println(root1 +" "+ root2);
    }
}