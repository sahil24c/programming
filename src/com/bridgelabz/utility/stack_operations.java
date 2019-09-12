package com.bridgelabz.utility;

public class stack_operations {
	static int max=100;
	static char[] arr = new char[max];
	static int top = -1;

	public static void push(char x) {
		if (top >= max - 1) {
			System.out.println("stack overflow");
		} else {
			arr[++top] = x;
			System.out.println("push "+x);
		}
	}

	public static char pop() {
		if (top < 0) {
			System.out.println("underflow");
			return 0;
		} else {
			System.out.println("pop "+arr[top]);
			return arr[top--];
		}
	}

	public static int peak() {
		char x = arr[top];
		System.out.println("peek "+x);
		return x;
	}
	public static boolean matching(char character1 ,char character2)
	{
		System.out.println("ch1 "+character1 + "ch2 "+ character2);
		if (character1 == '(' && character2 == ')') 
			return true; 
		else if (character1 == '{' && character2 == '}') 
			return true; 
		else if (character1 == '[' && character2 == ']') 
			return true; 
		else
			return false; 

	}
	public static boolean parenthesis(char[] ip)
	{
		for(int i=0;i<ip.length;i++) {
			if (ip[i]=='(' || ip[i]=='{' || ip[i]=='[') {
				push(ip[i]);
			}
			if(ip[i]==')' || ip[i]=='}' || ip[i]==']') {
				if(ip[i]<0)
				{
					System.out.println("empty");
				}
				else if(!matching(pop(),ip[i])){
					peak();
					//	i--;
					return false;
				}
			}
		}
		return true;
	}
}
