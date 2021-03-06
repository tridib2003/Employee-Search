/*
 * author: @tridib2003
 */

package com.tridib.app.model;

public class Employee 
{
	
	private int emp_id;
	private String emp_firstname;
	private String emp_surname;
	private int emp_age;
	private String emp_address;
	private String contact_no;
	
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_firstname() {
		return emp_firstname;
	}
	public void setEmp_firstname(String emp_firstname) {
		this.emp_firstname = emp_firstname;
	}
	public String getEmp_surname() {
		return emp_surname;
	}
	public void setEmp_surname(String emp_surname) {
		this.emp_surname = emp_surname;
	}
	public int getEmp_age() {
		return emp_age;
	}
	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}
	public String getEmp_address() {
		return emp_address;
	}
	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	
	
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_firstname=" + emp_firstname + ", emp_surname=" + emp_surname
				+ ", emp_age=" + emp_age + ", emp_address=" + emp_address + ", contact_no=" + contact_no + "]";
	}
	
}
