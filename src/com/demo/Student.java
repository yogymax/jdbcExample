/**
 * 
 */
package com.demo;

/**
 * @author Progvaltion_11
 *
 *
 *https://github.com/yogymax/jdbcExample.git
 *
 */
public class Student {
	
	private String xhasd;
	private String name;
	private String address;
	private int rollNo;
	private int age;
	
	public Student(String name, String address, int rollNo, int age) {
		super();
		this.name = name;
		this.address = address;
		this.rollNo = rollNo;
		this.age = age;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return" Student RollNo : " +rollNo
			+ " Student Name :" +name
			+ " Student Address :" +address
			+ " Student Age :" +age;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
}
