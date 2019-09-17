package com.bridgelabz.designpatterns;

public class ComputerModel {
	public static Computers getInstance(String str)
	{
		if(str.equals("small"))
			return new FactoryLaptop();
		else if (str.equals("powerful"))
			return new FactoryServer();
		else if(str.equals("normal"))
			return new FactoryPc();
		return null;
	}


}
