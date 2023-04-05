package com.example.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingDemo {

	public static void main(String[] args) throws Exception {

		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("MyBeans.xml");
		Greeting gre = (Greeting) beanFactory.getBean("hello");
		System.out.println(gre.greet());
		Greeting gre2 = (Greeting) beanFactory.getBean("hello");
		// System.out.println(gre2.greet());
		System.out.println("object2  " + gre.hashCode());
		System.out.println("object1 " + gre2.hashCode());

		Greeting gre1 = (Greeting) beanFactory.getBean("hello2");
		
		System.out.println(gre1.hashCode());

		Greeting gre3 = (Greeting) beanFactory.getBean("hello1");
		
		System.out.println(gre3.hashCode());

	}
}
