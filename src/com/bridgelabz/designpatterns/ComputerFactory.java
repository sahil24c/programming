package com.bridgelabz.designpatterns;
import com.bridgelabz.designpatterns.Computers;

public class ComputerFactory {
public static void main  (String[] args)
{
	ComputerModel obj = new ComputerModel();
	Computers obj2 = obj.getInstance("powerful");
	obj2.spec();
}
}