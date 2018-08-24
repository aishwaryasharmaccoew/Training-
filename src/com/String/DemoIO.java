package com.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader rd =new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter a no. :");
			int no1=Integer.parseInt(rd.readLine());
			System.out.println("Enter another no. :");
			int no2=Integer.parseInt(rd.readLine());
			if(no1>=no2)
				System.out.println("Max no is :"+no1);
			else
				System.out.println("Max no is :"+no2);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
 
}
