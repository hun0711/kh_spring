package com.example.demo.di;

import java.util.Enumeration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InsaMapTest {
	 public static void main(String args[]) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("com\\example\\demo\\di\\insaMap.xml");
		 InsaMap im = (InsaMap)context.getBean("insaMap33");  //객체주입 완료, 객체 선언은 xml에서
		 System.out.println(im.insaMap);
		 
		 
	 }
}
