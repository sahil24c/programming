package com.bridegelabz.datastructures;
import com.bridgelabz.utility.stack_operations;
public class stack_parenthesis {
	public static void main(String args[]) {
		System.out.println("hi");
	//stack_operations obj = new stack_operations();
	char exp[] = {'{','(',')','}','[',']'};
	if(stack_operations.parenthesis(exp))
      System.out.println("Balanced"); 
    else
      System.out.println("Not Balanced ");   
}
}
