package com.String;

import java.lang.reflect.Constructor;


public class DemoReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class cl;
		
		try {
			 Class c2 =Class.forName("java.lang.String");
			//System.out.println(cl);
			Constructor[] cons=c2.getConstructors();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
