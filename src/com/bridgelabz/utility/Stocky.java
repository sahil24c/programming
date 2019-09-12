package com.bridgelabz.utility;
import java.io.File;
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

import com.bridgelabz.utility.OopsUtil;

class Stocks{
	private String symbol;
	private int number_of_shares;
	private int value_of_share;
	private String date;

	public Stocks() {}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public int getNumber_of_shares() {
		return number_of_shares;
	}

	public void setNumber_of_shares(int number_of_shares) {
		this.number_of_shares = number_of_shares;
	}

	public int getValue_of_share() {
		return value_of_share;
	}

	public void setValue_of_share(int value_of_share) {
		this.value_of_share = value_of_share;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}

public class Stocky {

	final List <Stocks> myStocks = new ArrayList<Stocks>(); 
	static Map<String, List<Stocks>> myMan;
	static Stocks myStocky = new Stocks();

	static public void newAccount() throws FileNotFoundException
	{
		System.out.println("create company account");
		System.out.println("enter number of company shares");
		JSONObject rapido = new JSONObject();
//		JSONArray uber = new JSONArray();
		int numberOfShares = OopsUtil.readInteger();
		for(int i = 0;i<numberOfShares;i++)
		{
			JSONArray uber = new JSONArray();
			LinkedListInsertion link = new LinkedListInsertion();
			System.out.println("enter company share name");
			String nameC = OopsUtil.readString();
			LinkedListInsertion.insert(link,nameC);
			Map<String,Object> ola = new LinkedHashMap<String, Object>();
		//	Map<String,Object> rapidomap = new LinkedHashMap<String, Object>();

			System.out.println("enter symbol");
			String str = OopsUtil.readString();
			ola.put("symbol", str);
			System.out.println("enter number of shares");
			int num = OopsUtil.readInteger();
			ola.put("number_of_shares", num);
			System.out.println("enter value of share");
			int value = OopsUtil.readInteger();
			ola.put("value_of_share", value);
			String date = OopsUtil.currentDate();
			ola.put("date", date);
			
			uber.add(ola);
		    rapido.put(nameC,uber);
		}
			try(FileWriter f= new FileWriter("stocky.json"))
			{
				f.write(rapido.toJSONString());
				f.flush();
			}
			catch (Exception e) {
				e.printStackTrace();

					}
	}

	static public void buy() throws JsonParseException, JsonMappingException, IOException
	{
		System.out.println("enter the stock you want to buy");
		String company_name = OopsUtil.readString();
		ObjectMapper obj = new ObjectMapper();
		//String s = OopsUtil.readFile("stocky.json");
		File file = new File ("stocky.json");
		myMan = obj.readValue (file,new TypeReference<Map<String, List<Stocks>>>() {	});
		System.out.println("enter number of stocks");
		int buy= OopsUtil.readInteger();


		int numberOfShares = myMan.get(company_name).get(0).getNumber_of_shares();
		numberOfShares -=buy;
		System.out.println("now "+ numberOfShares);
		myMan.get (company_name).get(0).setNumber_of_shares(numberOfShares);
		obj.writeValue(file, myMan);

	}

	static public void sell() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("enter the stocks you want to sell");
		String company_name = OopsUtil.readString();
		ObjectMapper obj = new ObjectMapper();
		File file = new File ("stocky.json");
		myMan = obj.readValue (file,new TypeReference<Map<String, List<Stocks>>>() {	});
		System.out.println("enter number of stocks you want to sell");
		int sell = OopsUtil.readInteger();
		
		int numberOfShares = myMan.get(company_name).get(0).getNumber_of_shares();
		numberOfShares += sell;
		System.out.println("now "+ numberOfShares);
		myMan.get (company_name).get(0).setNumber_of_shares(numberOfShares);
		obj.writeValue(file, myMan);
		
	}

	static public void totalAccount()
	{
		for(Stokes myMan : myStokes)
		{
		int total = myMan.getNumber_of_shares();
		}
	}

	static public void save()
	{

	}

	static public void print()
	{

	}
}
