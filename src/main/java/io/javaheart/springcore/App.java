package io.javaheart.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.javaheart.springcore.pac1.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		practice1();
	}

	public static void practice1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Student st1 = (Student) context.getBean("student1");
		System.out.println(st1);

		Student s2 = (Student) context.getBean("student2");

		System.out.println(s2);

		Student s3 = (Student) context.getBean("student3");

		System.out.println(s3);

	}
}
