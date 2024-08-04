package com.prashant.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prashant.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello World");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloBean helloBean = (HelloBean) applicationContext.getBean("helloBean");
		helloBean.sayHello();
	}
}
