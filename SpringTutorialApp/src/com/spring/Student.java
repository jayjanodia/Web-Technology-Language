/*pavanjaiswal.com*/


package com.spring;

import org.springframework.stereotype.Component;

 @Component("mybean")
public class Student {
	private int rollNo;
	private String name;
	private Address address;
	public Student(int rollNo, String name,Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void showAddress()
	{
		System.out.println(address.getCity() + " " + address.getState());
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
}
