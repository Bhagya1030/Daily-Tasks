package com.aits.Spring_IOC;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringIocApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringIocApplication.class, args);
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringIocApplication.class);
		//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IncomeTax t=(IncomeTax) context.getBean(IncomeTax.class);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Mode of Payment");
		String Paymode=sc.next();
		
		t.setTaxableAmount(2000);
		t.calculateTaxAmount();
		t.PayTax(Paymode);
	}

}
