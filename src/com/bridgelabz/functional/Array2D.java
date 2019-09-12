package com.bridgelabz.functional;
import java.util.Scanner;
public class Array2D {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter array size");
        int n= in.nextInt();
        int [] array1 = new int[n];
        System.out.println("enter numbers");
        //loop to accept array values
        for(int i=0;i<n;i++)
        {
            array1[i]= in.nextInt();
        }
        System.out.println("triplets with zero sum are: ");
        //counter to count number of triplets
        int count = 0;
        //loop with n cube complexity that finds sum=0 between distinct elements
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for (int k=0;k<n;k++) {
                    if ((array1[i] + array1[j] + array1[k] == 0) && i != j && i != k && j != k) {

                        count++;
                        System.out.println(array1[i] +","+array1[j] +","+ array1[k] );
                    }
                }
            }
        }
        System.out.println("total triplets with zero sum are: "+ count);
    }
}
