package com.twg.setterinjection.bankapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Rbi {

	public static void main(String[] args) {
	
		//ApplicationContext con =new ClassPathXmlApplicationContext("config.xml");
		ApplicationContext con=new FileSystemXmlApplicationContext("C:\\Users\\DILEEP KUMAR\\Desktop\\WebTech\\config.xml");
		Sbi s=(Sbi) con.getBean("sbi");
		System.out.println("Acc holder : "+s.getName());
		System.out.println("Acc number : "+s.getAccno());
		s.grantAccess();
		
		
		ApplicationContext jon=new ClassPathXmlApplicationContext("metadeta.xml");
		UnionBank u=(UnionBank) jon.getBean("union");
		
	}

}
