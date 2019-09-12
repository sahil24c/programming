package com.bridgelabz.oops;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.util.*;
public class StockReportReading {
    public static void main(String[] args) throws Exception
    {
        //parsing JSON file : Stock.json
        JSONObject obj =  (JSONObject) new JSONParser().parse(new FileReader("/home/user/eclipse-workspace/bridgelabz_sahil/stock.json"));
        
  

        int number_of_stocks = obj.size();
        //Storing keys in an array
        Set<String> keys = (Set<String>) obj.keySet();
        Iterator<String> i = keys.iterator();
        int j=0;
        String stock_name[] = new String[number_of_stocks];
        
        while(i.hasNext())
        {
            String k = i.next().toString();
            stock_name[j] = k;
            j++;
        }
        long total_value=0;
        for(int x=0; x<stock_name.length; x++)
        {
            JSONArray temp = (JSONArray) obj.get(stock_name[x]);
            JSONObject temporary = (JSONObject)temp.get(0);        
            
            long num_share =(long) temporary.get("NumberOfShares");
            long price =(long) temporary.get("PricePerShare");
            long value = price*num_share;
            total_value = total_value + value;
            System.out.println("Total value of stock of "+stock_name[x]+" is "+value);
        }
        System.out.println("\nTotal value of all the stocks is: "+total_value);
    }
}