package com.String;
//POJO
public class Person {
	
	
	private int age;
	private String name;

	public Person()
	{
		age=10;
		name="aeiou";
	}
	
	public void display()
	{
		System.out.println("Name ="+name+"\tAge ="+age);
	}    
	
	
	public Person(int age,String name)
	{
		this.name=name;
		this.age=age;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		Person p=(Person)obj;
		return (p.age==this.age && p.name.equals(name));
	}
	

}
