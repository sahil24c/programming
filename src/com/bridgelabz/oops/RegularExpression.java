package com.bridgelabz.oops;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.utility.Inventory;
import com.bridgelabz.utility.InventoryList;
import com.bridgelabz.utility.OopsUtil;
public class RegularExpression {
	public static void main( String[] args ) throws FileNotFoundException {
		String path = "/home/user/eclipse-workspace/bridgelabz_sahil/regex.json";
	
				String message = OopsUtil.readFile(path);

			System.out.println("enter first name");
			String fname = OopsUtil.readString();
			System.out.println("enter last name");
			String lname = OopsUtil.readString();
			System.out.println("enter phone no");
			String ph = OopsUtil.readString();
			String date = OopsUtil.currentDate();
			String fullname = fname+ " "+ lname;
			
			Pattern p1 = Pattern.compile("<<name>>");
			Pattern p2 = Pattern.compile("<<full name>>");
			Pattern p3 = Pattern.compile("xxxxxxxxxx");
			Pattern p4 = Pattern.compile("01/01/2016");
			
			Matcher m1 = p1.matcher(message);
			message = m1.replaceAll(fname);
			
			Matcher m2 = p2.matcher(message);
			message = m2.replaceAll(fullname);
			
			Matcher m3 = p3.matcher(message);
			message = m3.replaceAll(ph);
			
			Matcher m4 = p4.matcher(message);
			message = m4.replaceAll(date);
			System.out.println(message);
	}
			
}


