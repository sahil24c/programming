package com.bridgelabz.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class Prototype {

	private List<String>emplist;
	
	public Prototype()
	{
		emplist = new ArrayList<String>();
	}
	public Prototype(List<String> list)
	{
		this.emplist = list;
	}
	public void loadData()
	{
		emplist.add("sahil");
		emplist.add("shah");
		emplist.add("bridge");
		emplist.add("labz");
	}
	public List<String> getEmplist()
	{
		return emplist;
	}
	public Prototype clone()
	{
		List <String> temp = new ArrayList<String>();
		for (String s :this.getEmplist())
		{
			temp.add(s);
		}
		return new Prototype(temp);
	}
	
	public static void main(String[] args)
	{
		Prototype emp1 = new Prototype();
		emp1.loadData();
		
		Prototype emp2 = (Prototype) emp1.clone();
		Prototype emp3 = (Prototype) emp1.clone();
		List <String> list = emp2.getEmplist();
		list.add("book");
		List <String> list2 = emp3.getEmplist();
		list2.remove("bridge");
		System.out.println(list);
		System.out.println(list2);
	}
}
