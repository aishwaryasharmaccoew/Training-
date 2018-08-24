package com.String;

import java.io.Serializable;

public class Student implements Serializable {
	private int rollNo,total;
	private String name;
	/**
	 * @param rollNo
	 * @param total
	 * @param name
	 */
	public Student(int rollNo, int total, String name) {
		super();
		this.rollNo = rollNo;
		this.total = total;
		this.name = name;
	}
	/**
	 * 
	 */
	public Student() {
		super();
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", total=" + total + ", name=" + name + "]";
	}
	
	
	
}
