package com.tn.ham.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class My_Test {

	public static void main(String[] args) {
	       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	       MySimpleBean x=context.getBean(MySimpleBean.class);
	       x.faire_leSalut();
	       
	       ((ClassPathXmlApplicationContext)context).close();
		
	}

}

