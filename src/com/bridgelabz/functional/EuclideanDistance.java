package com.bridgelabz.functional;
import java.util.Scanner;
public class EuclideanDistance {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter x and y coordinates");
        int i = in.nextInt();
        int j = in.nextInt();

        System.out.println("Euclidean dist is:");
        // type casted to float
        //calculating euclidean distance from (0,0)
        float k= (float) Math.sqrt(i*i+j*j);

        System.out.println(k);
        }
    }