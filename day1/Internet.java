package com.example.demo;

import org.springframework.stereotype.Component;

@Component //7 giving access to use this class for spring boot
public class Internet {

	
	//6 pojo class
String isp;
int speed;
public String getIsp() {
	return isp;
}
public void setIsp(String isp) {
	this.isp = isp;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
void provideInternet(){
	System.out.println("kkkk connected with internet");
}
}
