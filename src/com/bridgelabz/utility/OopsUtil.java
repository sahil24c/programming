package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.FileWriter;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import org.json.*;

public class OopsUtil {
	static Scanner scanner1 = new Scanner (System.in);
	public static int readInteger()
	{
		return scanner1.nextInt();
	}
	public static String readString() {
		return scanner1.next();
		}
	public static boolean userBoolean(){
		return scanner1.nextBoolean();
		}
	
	public static String readFile(String message) throws FileNotFoundException
	{
		FileReader f = new FileReader(message);
		BufferedReader read = new BufferedReader(f);
		String line = "";
			String word = "";
			try {
				while ((word = read.readLine())!= null)
				{
					line = word;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	return line;
	}
	
	@SuppressWarnings("unchecked")
	public static void createInventory()
	{
		JSONObject inv1 = new JSONObject();
		inv1.put("name","red");
		inv1.put("weight", "1000");
		inv1.put("price", 100);
		
		JSONObject item1 = new JSONObject();
		item1.put("pulses",inv1);
		
		JSONObject inv2 = new JSONObject();
		inv2.put("name","white");
		inv2.put("weight", "1000");
		inv2.put("price", 50);
		
		JSONObject item2 = new JSONObject();
		item2.put("rice",inv2);
		
		JSONObject inv3 = new JSONObject();
		inv3.put("name","brown");
		inv3.put("weight", "1000");
		inv3.put("price", 20);
		
		JSONObject item = new JSONObject();
		item.put("wheat",inv3);
		
		JSONArray inventory = new JSONArray();
		inventory.add(inv1);
		inventory.add(inv2);
		inventory.add(inv3);
		try(FileWriter file = new FileWriter("inventory.json"))
		{
			file.write(inventory.toJSONString());
			file.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static InventoryList display(List<InventoryList> list2)
	{
		for (int i = 0; i < list2.size(); i++) {
			InventoryList it = list2.get(i);
			System.out.println("Inventory name :" + InventoryList.getInventoryName());
			for (int j = 0; j < it.getListOfInventories().size(); j++) {
				System.out.println("name :" + it.getListOfInventories().get(j).getName());
				System.out.println("price :" + it.getListOfInventories().get(j).getPrice());
				System.out.println("weight :" + it.getListOfInventories().get(j).getWeight());
				System.out.println();
			}}
		System.out.println("---------------------------------------------");
		return null;
	}
	public static void writelist(String json) throws IOException
	{
		FileWriter file = new FileWriter("inventory.json");
		@SuppressWarnings("resource")
		BufferedWriter buffer = new BufferedWriter(file);
		buffer.write(json);
		buffer.flush();
	}
	public static void priceOFInventory(List<InventoryList> originfile)
	{

		for (int i = 0; i < originfile.size(); i++) {
			InventoryList it = originfile.get(i);
			System.out.println("Inventory name :" + it.getInventoryName());
			for (int j = 0; j < it.getListOfInventories().size(); j++) {
				System.out.println("name :" + it.getListOfInventories().get(j).getName());
				double sum=it.getListOfInventories().get(j).getPrice()*it.getListOfInventories().get(j).getWeight();
				System.out.println("total price to be given is :"+sum);
			}
			System.out.println("---------------------------------------------");
		}
	}
	public static InventoryList insertNewInventory(String inventoryName, List<Inventory> listOfInventories)
	{
		InventoryList inventoryList = new InventoryList();
		inventoryList.setInventoryName(inventoryName);
		inventoryList.setListOfInventories(listOfInventories);
		return inventoryList;
	}
	public static Inventory getInventories()
	{
		Inventory inventory = new Inventory();
		System.out.println("Enter name of inventory");
		inventory.setName(OopsUtil.readString());
		System.out.println("Enter weight of inventory in kilograms");
		inventory.setWeight(OopsUtil.readInteger());
		System.out.println("Enter price of inventory in rupees");
		inventory.setPrice(OopsUtil.readInteger());
		return inventory;
	}
	
	public static String currentDate()
	{
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String strDate= formatter.format(date);
		return strDate;
	}
	
		
	
	
}

