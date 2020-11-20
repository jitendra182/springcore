package io.javaheart.springcore.pac2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("io/javaheart/springcore/pac2/referenced-config.xml");
		
		A a = (A) context.getBean("aref2");
		System.out.println(a);
		System.out.println(a.getX());
		System.out.println(a.getObB());
		System.out.println(a.getObB().getY());
	}
}
