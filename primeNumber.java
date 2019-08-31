package com.bridgelabz.utility;

import java.util.ArrayList;
import java.util.List;

public class primeNumber {

    public static List<Integer> prime(int start,int rear){
     //   System.out.println("prime numbers are: ");
        List<Integer> li = new ArrayList<Integer>();
        for(int i=start;i<rear;i++)
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
            { //System.out.println(i);
            li.add(i);
            }
        }
		return li;
    }
}