package com.bridgelabz.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
	public static List<String> primeAnagram(List<Integer> inner) {
		List<String> lis  = new ArrayList<String>();
        for (int i = 0; i < inner.size(); i++) {
            for (int j = i + 1; j < inner.size(); j++) {
                Integer s1 = inner.get(i);
                String temp1 = s1.toString();
               // System.out.println(temp1);
                char[] arr1 = temp1.toCharArray();

                Integer s2 = inner.get(j);
                String temp2 = s2.toString();
               // System.out.println(temp2);
                char[] arr2 = temp2.toCharArray();

                Arrays.sort(arr1);
                Arrays.sort(arr2);

                String t1 = Arrays.toString(arr1);
      //          System.out.println(t1);
                String t2 = Arrays.toString(arr2);
       //         System.out.println(t2);
                if (t1.equals(t2)) {
                 //   System.out.println("yaayy, anagram" + temp1 + "&" + temp2);
                	lis.add(temp1);
                }

                //System.out.println(primeList.get(i)+"    "+primeList.get(j) );
            }
        }
        //System.out.println(primeAnagramSet);
		return lis;
    }
}

