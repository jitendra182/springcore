package io.javaheart.springcore.constinjection;

public class Certificate {

	private String cname;
	
	public Certificate(String cname) {
		this.cname = cname;
	}
	
	@Override
	public String toString() {
		return cname;
	}
}
