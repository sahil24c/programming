package com.bridgelabz.algorithm;


import java.util.*;

class Palin {
    static void checkpalin(int i) {
        int temp = i;
        while (i >= 10) {
            i = i / 10;
        }
        if (temp % 10 == i) {
            System.out.println(temp + " is palindrome");
        }
    }

    static void primeAnagram(List<String> primeList) {

        for (int i = 0; i < primeList.size(); i++) {
            for (int j = i + 1; j < primeList.size(); j++) {
                String s1 = primeList.get(i);
                String temp1 = s1;
                System.out.println(temp1);
                char[] arr1 = s1.toCharArray();

                String s2 = primeList.get(j);
                String temp2 = s2;
                System.out.println(temp2);

                char[] arr2 = s2.toCharArray();

                Arrays.sort(arr1);
                Arrays.sort(arr2);

                String t1 = Arrays.toString(arr1);
                System.out.println(t1);
                String t2 = Arrays.toString(arr2);
                System.out.println(t2);
                if (t1.equals(t2)) {
                    System.out.println("yaayy, anagram" + temp1 + "&" + temp2);
                }

                //System.out.println(primeList.get(i)+"    "+primeList.get(j) );
            }
        }
        //System.out.println(primeAnagramSet);
    }
}


public class PrimePalinAna {
	  public static void main(String[] args) {

	        System.out.println("prime numbers are: ");
	        for (int i = 2; i < 1001; i++) {
	            //flag to keep track of whether number is prime or not
	            boolean flag = false;
	            for (int j = 2; j < i; j++) {
	                // System.out.println("number "+i+" modulus "+j+" "+i%j);
	                if (i % j == 0) {
	                    //if number gives zero remainder then number is composite and we break out of loop
	                    flag = true;
	                    break;
	                }
	            }
	            //if number flag is false after the loop then the number is prime
	            if (!flag) {
	                //System.out.println(i);
	                Palin.checkpalin(i);
	                String j = Integer.toString(i);
	                List<String> primeList = new ArrayList<>();//declaration
	                primeList.add(j);
	                Palin.primeAnagram(primeList);

	                for (String s : primeList) {
	                    
	                    System.out.println(s);
	                }

	            }
	        }
	  }
}