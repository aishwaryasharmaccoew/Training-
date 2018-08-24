package com.String;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myfile=new File("java/first.txt");
		System.out.println(myfile.getName());
		/*try {
			//myfile.createNewFile();
			FileWriter fw=new FileWriter(myfile,true);
			//fw.write("Hi this is me");
			fw.close();
			byte value = 0;
			FileReader fr=new FileReader(myfile);
			
			do
			{
				int data=fr.read();
				if((char)data!=' '|| data!=-1)
					System.out.print((char)data);
				else
					System.out.println("\n");
				value=(byte)data;
			}while(value!=-1);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("File created successfully");*/
	}

}
