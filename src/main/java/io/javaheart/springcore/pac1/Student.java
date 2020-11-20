package io.javaheart.springcore.pac1;

public class Student {

	private int studentId;
	private String studentName;
	private String degreeName;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDegreeName() {
		return degreeName;
	}
	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}
	
	public Student() {
		super();
	}
	public Student(int studentId, String studentName, String degreeName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.degreeName = degreeName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", degreeName=" + degreeName + "]";
	}
	
	
}
