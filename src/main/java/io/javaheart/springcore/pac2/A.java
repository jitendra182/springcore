package io.javaheart.springcore.pac2;

public class A {
	
	private int x;
	private B obB;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getObB() {
		return obB;
	}
	public void setObB(B obB) {
		this.obB = obB;
	}
	public A() {
		
	}
	public A(int x, B obB) {
		super();
		this.x = x;
		this.obB = obB;
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", obB=" + obB + "]";
	}
	

}
