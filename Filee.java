package com.training.cg.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInput;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Filee {
	public static void main(String args[]) throws IOException {
		//char[]arr = new char[100];
		File file =new File("Notepad.txt");
		FileReader input = null;
		FileReader input1=null;
		BufferedWriter output = null;
		BufferedReader br = null;
		try {
			input1 = new FileReader("C:\\Users\\SWATHI\\eclipse-workspace\\javabasics\\Notepad.txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		boolean val= false;
		//creating a file
		try {
			val=file.createNewFile()
;
			}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		if(val) {
			System.out.println("File created succesful..");
		}
		else {
			System.out.println("File created unsuccessfull..");
		}
		//creating a file
		
		//reading a file
	/*	BufferedReader br1 = new BufferedReader(new FileReader(file));
		br1.lines().forEach(System.out::println);
		
		input1.read(arr);
		System.out.println("Reading the file:::");
		System.out.println("arr");//reading a file*/
		
		//writing a file
	/*	try {
			FileWriter fw = new FileWriter(file);
			output = new BufferedWriter(fw);
			output.write("hi........swathi");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		output.close();
	}
	//writinng a file using outputbuffer*/
	String str;
	Scanner sc=new Scanner(System.in);
	System.out.println("write something for the file");
	str=sc.nextLine();
	byte []arr=str.getBytes();
       
	
	
	
	OutputStream out = new FileOutputStream("C:\\Users\\SWATHI\\eclipse-workspace\\javabasics\\Notepad.txt");	
	out.write(arr);
	System.out.println("Successfully written into the file of notepad");
	
	out.close();

}
}
