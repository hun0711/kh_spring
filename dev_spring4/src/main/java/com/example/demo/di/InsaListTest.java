package com.example.demo.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InsaListTest {
	 public static void main(String args[]) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("com\\example\\demo\\di\\insaBean.xml");
		 InsaList il = (InsaList)context.getBean("insa");  //객체주입 완료, 객체 선언은 xml에서
		 System.out.println(il.insaBean);
         for(int i = 0; i < il.insaBean.size(); i++) {
        	 System.out.println(il.insaBean.get(i));
         }
		 
	 }
}
