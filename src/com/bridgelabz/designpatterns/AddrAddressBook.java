package com.bridgelabz.designpatterns;
import com.bridgelabz.utility.OopsUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import java.util.Comparator;

public class AddrAddressBook implements AddrManager {
	static String path = "/home/user/eclipse-workspace/bridgelabz_sahil/";
	static ObjectMapper obj = new ObjectMapper();
static List <AddrPerson> personList  = new ArrayList<AddrPerson>();

public static boolean createAddressBook(String path) throws IOException
{
	File file = new File(path);
	boolean fileCreated = file.createNewFile();
	return fileCreated;
}


public void addPerson(String addressBook) throws JsonMappingException, IOException
{
	AddrPerson person = new AddrPerson();
	System.out.println("enter first name");
	String fname = OopsUtil.readString();
	person.setFirstName(fname);
	System.out.println("enter last name");
	String lname = OopsUtil.readString();
	person.setLastName(lname);
	System.out.println("enter address");
	String address = OopsUtil.readString();
	person.setAddress(address);
	System.out.println("enter city name");
	String city = OopsUtil.readString();
	person.setCity(city);
	System.out.println("enter state");
	String state = OopsUtil.readString();
	person.setState(state);
	System.out.println("enter zip");
	String zip = OopsUtil.readString();
	person.setZipCode(zip);
	System.out.println("enter phone number");
	String phone = OopsUtil.readString();
	person.setPhone(phone);
	
	personList.add(person);
	
	AddrAddressBook man = new AddrAddressBook();
	man.save1(person,"/home/user/eclipse-workspace/bridgelabz_sahil/Adday.json" );
}

public static void editPerson(String name, String addressBook) throws JsonParseException, JsonMappingException, IOException
{
	int count = 0;
	int tempCount = 0;
	String temp = "";
	int stop = 0;
//	AddrPerson newP = new AddrPerson();

	//read data from file and store it in linked list
	LinkedList<AddrPerson> details = obj.readValue(new File(path + addressBook),new TypeReference<LinkedList<AddrPerson>>() {});
	for (AddrPerson person : details) {
		if (person.getFirstName().equals(name)) { //check if entered name is present or not
			tempCount = count;
		}
		count++;
	}
	while (stop != 2) {
		System.out.println("1. for edit first name");
		System.out.println("2. for edit last name");
		System.out.println("3. for edit address and phone number");
		count = OopsUtil.readInteger();
		String firstName;
		String lastName;
		switch (count) {
		case 1:
			//change first name
			System.out.println("Enter new first name :");
			firstName = OopsUtil.readString();
			details.get(tempCount).setFirstName(firstName);  //set new name
			break;
		case 2:
			//change last name
			System.out.println("Enter new last name :");
			lastName = OopsUtil.readString();
			details.get(tempCount).setLastName(lastName); //set new last name
			break;
		case 3:
			//edit address
			System.out.println("1. for edit city");
			System.out.println("2. for edit state");
			System.out.println("3. for edit zip code");
			System.out.println("4. for edit phone number");
			int choice = OopsUtil.readInteger();
			
			if (choice == 1) {
				System.out.println("Enter city:");
				temp = OopsUtil.readString();
				details.get(tempCount).setCity(temp); //change city name

			}
			if (choice == 2) {
				System.out.println("Enter state:");
				temp = OopsUtil.readString();
				details.get(tempCount).setState(temp); //change city name

			}
			if (choice == 3) {
				System.out.println("Enter zip:");
				temp = OopsUtil.readString();
				details.get(tempCount).setZipCode(temp);//change zip
				;

			}
			if (choice == 4) {
				System.out.println("Enter mobile number:");
				temp = OopsUtil.readString();
				details.get(tempCount).setPhone(temp); //change mobile number

			}
		}
		System.out.println("for stop press 2. or for continue press any number");
		stop = OopsUtil.readInteger();
	}
	if (stop == 2) {
		//write data to file
		obj.writeValue(
				new File(path + addressBook),
				details);
	}
}

public int numberOfPersons()
{
	System.out.println("Number of persons in address book are :");
	int count=0;
	for(AddrPerson p :personList)
	{
		count++;
	}
	return count;
}
public static AddrPerson display(List<AddrPerson> list2)
{
	for (int i = 0; i < list2.size(); i++) {
		AddrPerson it = list2.get(i);
		System.out.println("Person name :" + it.getFirstName());
	}
		return null;
}


@Override
public void save1(AddrPerson person, String path) throws JsonMappingException, IOException {
	if (new File(path).length() == 0) {
		LinkedList<AddrPerson> newPerson = new LinkedList<>();
		newPerson.add(person);
		// System.out.println(newPerson);
		obj.writeValue(new File(path),newPerson);
		if (new File(path).length() != 0) {
			System.out.println("data added successfully");
		} else {
			System.out.println("unsuccessful");
		}
	} else {
		long preFileLength = new File(path).length();
		LinkedList<AddrPerson> multiple = obj.readValue(new File(path),new TypeReference<LinkedList<AddrPerson>>() {});
		multiple.add(person);
		obj.writeValue(new File(path),multiple);
		long afterWriteLength = new File(path).length();
		if (preFileLength < afterWriteLength) {
			System.out.println("data added successfully");
		} else {
			System.out.println("data not filled in file");
		}
	}

}



@Override
public void delete(String name, String path) throws JsonMappingException, IOException {
	LinkedList <AddrPerson> list = new LinkedList<AddrPerson>();
	list = obj.readValue(new File(path), new TypeReference<LinkedList<AddrPerson>>(){});
	int count=0;
	boolean result = false;
	for (AddrPerson personal : list)
	{
		if(name.equals(personal.getFirstName()))
				{
			list.remove(count);
			result = true;
			obj.writeValue(new File (path), list);
				}
		count++;
	}
	if(result== false)
	{
		System.out.println("person not found");
	}
	else
		System.out.println("person removed");
}


public void print(String path) throws JsonMappingException, IOException {
	// TODO Auto-generated method stub
	LinkedList <AddrPerson> list = new LinkedList<AddrPerson>();
	list = obj.readValue(new File (path), new TypeReference<LinkedList<AddrPerson>>(){});
	for (AddrPerson personal : list)
	{
		System.out.println(personal.getFirstName());
	}
	
}



public static Comparator <AddrPerson> personCompare = new Comparator<AddrPerson>() {
	
	@Override
	public int compare(AddrPerson o1, AddrPerson o2) {
String personName1 = o1.getFirstName();
String personName2 = o2.getFirstName();
		return personName1.compareTo(personName2);
	}
};

public static Comparator <AddrPerson> personZipCompare = new Comparator<AddrPerson>() {
	
	@Override
	public int compare(AddrPerson o1, AddrPerson o2) {
String personName1 = o1.getZipCode();
String personName2 = o2.getZipCode();
		return personName1.compareTo(personName2);
	}
};

}
