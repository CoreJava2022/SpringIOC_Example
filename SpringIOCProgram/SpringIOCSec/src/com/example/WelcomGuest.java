package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WelcomGuest {
	
	Greeting greeting;
	Welcome welcome;
	
	public WelcomGuest() {
		// TODO Auto-generated constructor stub
	}
	
public Greeting getGreeting() {
		return greeting;
	}

	public void setGreeting(Greeting greeting) {
		System.out.println("instantiated via SetterMethod");
		System.out.println("Greeting setMethod");
		this.greeting = greeting;
	}

	public Welcome getWelcome() {
		return welcome;
	}

	public void setWelcome(Welcome welcome) {
		System.out.println("instantiated via SetterMethod");
		System.out.println("Welcome setMethod");
		this.welcome = welcome;
	}



public WelcomGuest(Greeting greeting, Welcome welcome) {
	System.out.println("instantiated via constructor");
		this.greeting = greeting;
		this.welcome = welcome;
	}

@Override
public String toString() {
	return "WelcomGuest [greeting=" + greeting + ", welcome=" + welcome + "]";
}


public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("mybeans.xml");
	
	WelcomGuest wel12 = (WelcomGuest) context.getBean("InjectwithConstructor");
	System.out.println("welcome obj through Constructor :"+wel12);
	//
	WelcomGuest wel123 = (WelcomGuest) context.getBean("InjectwithSetter");
	System.out.println("welcome obj through SetterMethod:"+wel123);
	}
}
