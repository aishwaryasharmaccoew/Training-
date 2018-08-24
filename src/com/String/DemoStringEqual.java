package com.String;

public class DemoStringEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=new String("Citi");
		String name1="Citi";
		String name2="Citi";
		
		if(name1.equals(name))
			System.out.println("Equal");
		else
			System.out.println("Not equal");
		
		StringBuilder builder=new StringBuilder("Citi");
		System.out.println(builder);
		builder.append("bank");
		System.out.println(builder);

	}

}
