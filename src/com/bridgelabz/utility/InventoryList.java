package com.bridgelabz.utility;
import java.util.ArrayList;
import java.util.List;

public class InventoryList {
		 private static String inventoryName;
		  
		    List<Inventory> listOfInventories = new ArrayList<Inventory>();

		    public static String getInventoryName() {
		        return inventoryName;
		    }

		    public void setInventoryName(String inventoryName) {
		        InventoryList.inventoryName = inventoryName;
		    }

		    public List<Inventory> getListOfInventories() {
		        return listOfInventories;
		    }

		    public void setListOfInventories(List<Inventory> listOfInventories) {
		        this.listOfInventories = listOfInventories;
		    }
	}
