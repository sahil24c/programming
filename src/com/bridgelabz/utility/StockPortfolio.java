package com.bridgelabz.utility;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.utility.StockClass;
public class StockPortfolio {

	StockClass obj = new StockClass();
	public int airtel(int value)
	{
		int yourval = obj.getAirtel()*value;
		return yourval;
	}
	public int jio(int value)
	{
		int yourval = obj.getJio()*value;
		return yourval;
	}
	public int idea(int value)
	{
		int yourval = obj.getIdea()*value;
		return yourval;
	}
	public static String getStockName() {
		return stockName;
	}
	public static void setStockName(String stockName) {
		StockPortfolio.stockName = stockName;
	}
	public List<StockClass> getStocking() {
		return stocking;
	}
	public void setStocking(List<StockClass> stocking) {
		this.stocking = stocking;
	}
	private static String stockName;
	
	List <StockClass> stocking = new ArrayList<StockClass>();
}
