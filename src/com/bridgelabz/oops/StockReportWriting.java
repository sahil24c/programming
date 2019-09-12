package com.bridgelabz.oops;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class StockReportWriting {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of stocks: ");
        long num_stock = in.nextLong();
        
        //creating new JSONObject
        JSONObject jo = new JSONObject();
        
        //getting input
        for(int i=0; i<num_stock; i++)
        {
            System.out.print("Enter the name of the stock: ");
            String stock_name = in.next();
            
            System.out.print("Enter the number of shares of the stock "+stock_name+": ");
            long num_share = in.nextLong();
            
            System.out.print("Enter the price of 1 share of the stock "+stock_name+": ");
            long price_per_share = in.nextLong();
            
            JSONArray ja = new JSONArray();
            
            //adding values to the map
            Map<String, Object> m = new LinkedHashMap<>(2);
            m.put("NumberOfShares", num_share);
            m.put("PricePerShare", price_per_share);
            
            //adding values to the array
            ja.add(m);
            //linking properties with the inventory object
            jo.put(stock_name, ja);
        }
        in.close();
        
        //writing file
        PrintWriter pw = new PrintWriter("StockReport.json");
        pw.write(jo.toJSONString());
        pw.flush();
        pw.close();
    }
}