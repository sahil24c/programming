package com.bridgelabz.oops;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.utility.Inventory;
import com.bridgelabz.utility.InventoryList;
import com.bridgelabz.utility.OopsUtil;

public class InventoryManagement {

	static String str = "/home/user/eclipse-workspace/bridgelabz_sahil/inventory.json";
	static ObjectMapper objectMapper = new ObjectMapper();
	static List<InventoryList> originfile = new ArrayList<InventoryList>();
	static InventoryList inventoryList = new InventoryList();
	static List<Inventory> listOFInventories = new ArrayList<Inventory>();
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String reference = "";
		int z= 0;
		do {
			System.out.println("1.Display file\n2.Add to file\n3.Check for price\n4.exit");
			int choice = OopsUtil.readInteger();
			switch (choice)
			{
			case 1:
				reference = OopsUtil.readFile(str);
				try {
					originfile = objectMapper.readValue(reference, new TypeReference<List<InventoryList>>() {});
					OopsUtil.display(originfile);
				} catch (Exception e) {
					System.out.println("oops nothing is present in the file !! first add inputs on to file or select second choice");
				}
				break;
			case 2:
				String [] arr= {"","rice","wheat","pulses"};
				int ref = 1, flag = 0;
				while (ref == 1) {
				System.out.println("Select the inventory name \n 1.rice 2.wheat 3.pulses");
				int inventoryname=OopsUtil.readInteger();
				
				 
					for (InventoryList nameList : originfile) {
						if (arr[inventoryname].equals(InventoryList.getInventoryName())) {                              
							listOFInventories = nameList.getListOfInventories();
							Inventory inventory = OopsUtil.getInventories();
							listOFInventories.add(inventory);
							flag = 1;
						}
					}
					if (flag == 0) {
						Inventory inventory = OopsUtil.getInventories();
						listOFInventories.add(inventory);
						inventoryList = OopsUtil.insertNewInventory(arr[inventoryname], listOFInventories);
						originfile.add(inventoryList);
					}
					System.out.println("wish to add some more inventorry(1 or 0)");
					ref = OopsUtil.readInteger();
					
					
				}
				System.out.println("Entered elements has been added to list");
				String json = objectMapper.writeValueAsString(originfile);
				OopsUtil.writelist(json);
				System.out.println("Inventory list has been written on to file");
				break;
			case 3:
				reference = OopsUtil.readFile(str);
				originfile = objectMapper.readValue(reference, new TypeReference<List<InventoryList>>() {});
				OopsUtil.priceOFInventory(originfile);
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("please select valid input");
				break;
			}
			System.out.println("Press 1 to continue");
			z=OopsUtil.readInteger();
			z++;
		}  while (z<100);
	}


}