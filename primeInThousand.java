package com.bridegelabz.datastructures;

import java.util.ArrayList;
import java.util.List;
import com.bridgelabz.utility.primeNumber;

public class primeInThousand {
	public static void main(String[] args)
	{
		System.out.println("Here is your matrix of all prime numbers between 0 to 1000");
		 List<List<Integer>> outer = new ArrayList<List<Integer>>();
	        List<Integer> inner = new ArrayList<Integer>();
	        int first=0;
	        int m=2;
	        int n=100;
	        for(int i=0;i<10;i++)
	        {
	        	inner = primeNumber.prime(m, n);
outer.add(inner);
System.out.println(inner);
if(first==0) {
m+=98;
first++;}
else {
	m+=100;}
n+=100;
}
	        }
}
