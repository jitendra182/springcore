package io.javaheart.springcore.pac1;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

	private int empId;
	private String empName;
	private List<Long> phoneNumbers;
	private Set<String> addresses;
	private Map<String, String> courses;
	private Properties props;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<Long> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public Employee(int empId, String empName, List<Long> phoneNumbers, Set<String> addresses,
			Map<String, String> courses, Properties props) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.phoneNumbers = phoneNumbers;
		this.addresses = addresses;
		this.courses = courses;
		this.props = props;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", phoneNumbers=" + phoneNumbers + ", addresses="
				+ addresses + ", courses=" + courses + ", props=" + props + "]";
	}
	
	
	
}
