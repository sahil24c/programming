package com.bridgelabz.algorithm;

public class PrimeTill1000 {
    public static void main(String[] args) {
        System.out.println("prime numbers are: ");
        for(int i=2;i<1001;i++)
        {
            //flag to keep track of whether number is prime or not
            boolean flag=false;
            for(int j=2;j<i;j++)
            {
               // System.out.println("number "+i+" modulus "+j+" "+i%j);
                if(i%j==0)
                {
                    //if number gives zero remainder then number is composite and we break out of loop
                    flag = true;
                    break;
                }
            }
            //if number flag is false after the loop then the number is prime
            if (flag== false)
                System.out.println(i);
        }
    }
}