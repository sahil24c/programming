package com.bridgelabz.designpatterns;
import java.io.IOException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.utility.OopsUtil;

public class AddrAddressMain {
	public static void main (String[] args) throws JsonParseException, JsonMappingException, IOException
	{
		String file = "/home/user/eclipse-workspace/bridgelabz_sahil/Adday.json";
		AddrAddressBook app= new AddrAddressBook();
		AddrAddressBook.createAddressBook(file);
		app.addPerson(file);
		app.print(file);
		System.out.println("enter person you want to delete");
		String deletePerson = OopsUtil.readString();
		app.delete(deletePerson, file);
}
}
