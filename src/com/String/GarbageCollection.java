package com.String;


public class GarbageCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1=new Person();
		Person p2=new Person();
		Person p3=new Person();
		Person p4=new Person();
		System.gc();
		
		//-XX:+PrintGCDetails

	}

}
