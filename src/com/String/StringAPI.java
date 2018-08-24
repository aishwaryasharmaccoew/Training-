package com.String;

import java.util.Scanner;

public class StringAPI {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a String :");
		String str=sc.next();
		System.out.println("Length of the string is :"+str.length());
		System.out.println("Upper case is :"+str.toUpperCase());
		
		System.out.println("String to char array  :");
		for(char c:str.toCharArray())
			System.out.println(c);

		System.out.println("Enter a string to check if it is a substring :");
		String sub=sc.next();
		if(str.contains(sub))
			System.out.println(sub+" is a substring of "+str);
		else
			System.out.println("It is not");
		
		sub=str.concat(sub);
		System.out.println("Concatination is :"+sub);
		sc.close();

		
		
		
	}

}
