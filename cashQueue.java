package com.bridegelabz.datastructures;
import java.util.Scanner;
import com.bridgelabz.utility.queueop;
public class cashQueue {
	public static void main(String[] args) {
		queueop obj = new queueop();
		obj.Queue(10);
		int cash=10000;
		Scanner in = new Scanner(System.in);		
		int j=1;
		while(j==1)
		{
			System.out.println("press 1 to add money, 2 to withdraw");
			int i = in.nextInt();
		switch(i){
			case 1:
			{
				int money  = in.nextInt();
				cash +=money;
				obj.enqueue(money);
				obj.peek();
				break;
			}
			case 2:
			{
				int withdraw=0;
				withdraw = obj.dequeue();
				cash -=withdraw;
				System.out.println(cash);
				obj.peek();
				break;
			}
		}
			

			System.out.println("to enter or continue press 1, 2 to exit");
			j = in.nextInt();

		}
		System.out.println("cash is "+cash);
	}
}