package com.bridgelabz.utility;

public class LinkedListInsertion {
    Node head;
    static class Node
    {
        String data;
        Node next;
        Node(String d)
        {data=d;}
    }
    public static LinkedListInsertion insert(LinkedListInsertion list , String data)
    {
         Node new_node = new Node(data);
         new_node.next = null;
         
            if (list.head == null) {
                list.head = new_node;
            }
            else {
                Node last = list.head;
                while (last.next != null) {
                    last = last.next;
                }
                last.next = new_node;
            }
            return list;

    }
     public static void printList(LinkedListInsertion list)
        {
            Node currNode = list.head;
       
            System.out.print("LinkedList: ");
            while (currNode != null) {
               
                System.out.print(currNode.data + " ");
       
                currNode = currNode.next;
            }
        }
     public static int searchList(LinkedListInsertion list , String s)
     {
         Node currNode = list.head;
         while (currNode != null)
         {
             if(currNode.data.equals(s))
             {
                 System.out.println("Word Found");
                 return 1;
             }
             currNode = currNode.next;
         }
        return -1;    
     }
     public static void deleteList(LinkedListInsertion list , String s)
     {
         Node currNode = list.head;
         Node prev = null;
         if(currNode!=null && currNode.data.equals(s))
         {
             list.head = currNode.next;
         }
         while(currNode!=null && !currNode.data.equals(s))
         {
            prev = currNode;
            currNode = currNode.next;        
         }
         if(currNode!=null)
         {
             prev.next=currNode.next;
         }
     }
}