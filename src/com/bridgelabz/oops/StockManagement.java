package com.bridgelabz.oops;

import com.bridgelabz.utility.Stocky;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.utility.InventoryList;
import com.bridgelabz.utility.OopsUtil;
import com.bridgelabz.utility.StockClass;
import com.bridgelabz.utility.StockPortfolio;

import com.bridgelabz.utility.LinkedListInsertion;

public class StockManagement {
	static ObjectMapper objectmapper = new ObjectMapper();
	static List <StockClass> stocks = new ArrayList<StockClass>();
	static List <StockPortfolio> stocking = new ArrayList<StockPortfolio>();
	static StockPortfolio stockk = new StockPortfolio();
	public static void main(String[] args) throws Exception

	{
		int z= 0;
		do {	
			int k = 0;
			System.out.println("enter\n 1.Create a new account\n 2.Total value of account\n 3.Buy shares \n"
					+ " 4.Sell shares \n 5.Save account \n 6.Print detailed report. ");
			switch(OopsUtil.readInteger())
			{
			case(1):Stocky.newAccount();
			break;
			case(2):Stocky.totalAccount();
			break;
			case(3):Stocky.buy();
			break;
			case(4):Stocky.sell();
			break;
			case(5):Stocky.save();
			break;
			case(6):Stocky.print();
			break;
			default : System.out.println("please enter valid input");
			}
			System.out.println("Press 1 to continue");
			z=OopsUtil.readInteger();
		}  while (z==1);
	}	
}

