package com.bridgelabz.designpatterns;

import java.io.IOException;

import org.codehaus.jackson.map.JsonMappingException;

public interface AddrManager {
	void save1(AddrPerson person, String addressBook) throws JsonMappingException, IOException;
	void addPerson(String path) throws JsonMappingException, IOException;
	void delete(String name, String addressBook) throws JsonMappingException, IOException;
	void print(String bookName) throws JsonMappingException, IOException;
	
}
