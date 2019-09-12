package com.bridgelabz.algorithm;
import java.util.Scanner;
import java.util.Arrays;
class Ana
{
    static void check(char[] s1, char[] s2)
    {
        if(s1.length!= s2.length)
        {
            System.out.println("not anagram because length varies");
        }
        Arrays.sort(s1);
        Arrays.sort(s2);
        for (int i=0;i<s1.length;i++)
        {
            if (s1[i]!=s2[i])
            {
                System.out.println("not anagram");
                return;
            }
        }
        System.out.println("Anagram");


    }
}
public class Anagram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1st string");
        String s1 = in.nextLine();
        System.out.println("enter second string");
        String s2 = in.nextLine();
        char[] t1=s1.toCharArray();
        char[] t2=s2.toCharArray();
        Ana.check(t1,t2);

    }

}