package com.bridgelabz.designpatterns;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AddrFileSystem {
	
public static String readFile (String message) throws FileNotFoundException
{
	//String path = "/home/user/eclipse-workspace/bridgelabz_sahil/AddressBook.json";
	FileReader file = new FileReader(message);
	BufferedReader buff = new BufferedReader(file);
	String line = "";
	String word = "";
	try {
		while(buff.readLine()!= null)
		{
			line = word;
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return line;
}
	
	public static void saveFile(String json, String fileName) throws IOException
	{
		FileWriter file1 = new FileWriter(fileName);
		@SuppressWarnings("resource")
		BufferedWriter buff1 = new BufferedWriter(file1);
		buff1.write(json);
		buff1.flush();
	}

}

