package com.bridegelabz.datastructures;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import com.bridgelabz.utility.LinkedListInsertion;

public class UnorderedList {
    public static void main(String args[]) throws FileNotFoundException
    {
        FileInputStream fin = new FileInputStream("/home/user/hello");
        Scanner sc = new Scanner(fin);
        LinkedListInsertion list = new LinkedListInsertion();
        while(sc.hasNext())
        {
            String next = sc.next();
            LinkedListInsertion.insert(list, next);
        }
        System.out.println("Enter the word to be searched : ");
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        s.close();
        sc.close();
        int x= LinkedListInsertion.searchList(list, word);
        if(x==-1)
        {
            LinkedListInsertion.insert(list, word);
            LinkedListInsertion.printList(list);
        }
        if(x==1)
        {
            LinkedListInsertion.deleteList(list, word);
            LinkedListInsertion.insert(list, word);
            LinkedListInsertion.printList(list);
          
        }
    }
}