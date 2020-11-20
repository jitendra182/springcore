package io.javaheart.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.javaheart.springcore.pac1.Employee;
import io.javaheart.springcore.pac1.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

//		practice1();
		practice2();
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
	
	public static void practice2()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("io/javaheart/springcore/pac1/collection-config.xml");
		Employee emp1 = (Employee) context.getBean("employee1");
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getPhoneNumbers());
		System.out.println(emp1.getAddresses());
		System.out.println(emp1.getCourses());
		System.out.println(emp1.getProps());
	}
}
