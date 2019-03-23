package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	//create object mapper
	ObjectMapper mapper=new ObjectMapper();
	
	//read JSON file and map/convert it to Java POJO:
	//data/sample-lite.json name
	Student theStudent=mapper.readValue(new File("data/sample-lite.json"), Student.class);
	
	//prinr firstname and last name
	System.out.println("Last name= " + theStudent.getLastName());
	System.out.println("First name= " + theStudent.getFirstName());
} catch(Exception exc) {
	exc.printStackTrace();
}
	}

}
