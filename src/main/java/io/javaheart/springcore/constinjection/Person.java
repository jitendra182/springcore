package io.javaheart.springcore.constinjection;

public class Person {

	private int id;
	private String name;
	private Certificate certificate;
	public Person(int id, String name, Certificate certificate) {
		this.id = id;
		this.name = name;
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return name+" : "+id+" : "+certificate.toString();
	}
	
}
