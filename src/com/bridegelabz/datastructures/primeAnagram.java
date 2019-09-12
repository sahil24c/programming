package com.bridegelabz.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bridgelabz.utility.primeNumber;
import com.bridgelabz.utility.Anagram;

public class primeAnagram {
	public static void main(String[] args) {
		System.out.println("Here is your matrix of all prime numbers which are also anagram between 0 to 1000");
		List<List<Integer>> outer = new ArrayList<List<Integer>>();
		List<Integer> inner = new ArrayList<Integer>();
		List <String> ana = new ArrayList<String>();
 		int first=0;
		int m=2;
		int n=100;
		for(int i=0;i<10;i++)
		{
			inner = primeNumber.prime(m, n);
			ana = Anagram.primeAnagram(inner);
			System.out.println(ana);
			outer.add(inner);

			if(first==0) {
				m+=98;
				first++;}
			else {
				m+=100;}
			n+=100;
		}
	}
}
