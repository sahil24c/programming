package com.bridegelabz.datastructures;
import java.util.Scanner;
import com.bridgelabz.utility.dequeOp;
public class palindromeDeque {
	public static void main(String args[]) {
		System.out.println("enter word");
		dequeOp deque  = new dequeOp();
		Scanner in = new Scanner(System.in);
		String s = in.next();
		System.out.println("length "+ s.length());
		deque.Queue(s.length());
		char[] arr = s.toCharArray();
		for(int  i =0;i<arr.length;i++)
		{
			deque.insertRear(arr[i]);
		}

		for(int  i = 0; i<arr.length/2;i++)
		{
		if(deque.delFront()!=deque.delRear()) {
			deque.peek();
				System.out.println("not palindrome");
			}

		
		else
		System.out.println("palindrome");
		}
	}
}
