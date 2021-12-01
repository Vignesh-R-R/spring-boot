package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //5 telling use this class for spring boot application (class path scan)   
public class Home {
	@Autowired	//10 this will connect the home class and internet class to use the data by modem reference
	private Internet modem;	/*8 if we use new keyword then it will be tight coupling then we depending on jio or 
	that object only(creating obj in that class to access) . to avoid and instead of that use like this to access
	 the internet class method(loss coupling then we depend on internet not jio). 
	 in this we refering object not a memory*/
	public void useInternet() {//9 kept method to access that class method
		modem.provideInternet();
	}
//3 POJO class
	private String streetName;
	private int doorNo;
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
}
