package io.javaheart.springcore.constinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("io/javaheart/springcore/constinjection/const-inject-config.xml");
		
		Person p = (Person) context.getBean("person");
		System.out.println(p.toString());
	}
}
