package com.bridgelabz.functional;

import java.util.Scanner;

class mymaths {             //class for user defined function
    public void mymath(int i)       //i is the exponent
    {
        int j,p=1;

        if(i==0)
        {
            System.out.println(1);
        }
        if(i==1) {
            System.out.println(2);
        }
        if(i>1)
        {
            for(j=1;j<=i;j++)
            {
                p=p*2;
                System.out.println(p);
            }
        }
    }
}
public class PowerOf2 {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();    //enters user input

        if(i<=0 || i>31)
        {
            System.out.println("invalid");
        }
        else {
            mymaths mathobj= new mymaths();         //creating obj from mymaths class 
            mathobj.mymath(i);                      //calling user defined function by passing integer
            }
    }
}
