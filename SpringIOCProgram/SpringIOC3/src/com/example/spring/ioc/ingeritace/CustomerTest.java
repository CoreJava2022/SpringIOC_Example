package com.example.spring.ioc.ingeritace;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {

	// Main driver method
	public static void main(String[] args) {

		// Inheriting Bean by customer
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("customer.xml");

		Customer customer = (Customer) applicationContext.getBean("customer");

		// Printing the customer info
		System.out.println(customer.toString());
	}
}