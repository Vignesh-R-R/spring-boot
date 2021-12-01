package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication	//1 informing to java this is our spring boot application
public class Day1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Day1Application.class, args);
	
		//2 i am runing from this class for that(internet) requirement
		Home home=context.getBean(Home.class);	//4 take this class to use
		home.useInternet();  //11 
	}
	/*EASY VIEW:
	 *home class and internet class added in this project and using with it with loosly couple help of @autowire
	*total 11 process added*/

}
