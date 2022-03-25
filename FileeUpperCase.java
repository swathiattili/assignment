package com.training.cg.dp;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class FileeUpperCase {
	public static void main(String args[])throws IOException
	{
	try
	{
		//to write in file
	FileWriter w = new FileWriter("C:\\Users\\SWATHI\\eclipse-workspace\\javabasics\\Notepad.txt");  
    String notes ; 
    Scanner sc=new Scanner(System.in);
	System.out.println("Write something to change to uppercase");
	 notes=sc.nextLine();
	 notes= notes.toUpperCase();
    w.write( notes);  
    w.close();  
    System.out.println("The uppercase of notes is: "); 
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	//to read the file
	try {  
        Reader reader = new FileReader("C:\\Users\\SWATHI\\eclipse-workspace\\javabasics\\Notepad.txt");  
        int data = reader.read();  
        while (data != -1) {  
            System.out.print((char) data);  
            data = reader.read();  
        }  
        reader.close();  
    } catch (IOException e) {  
    	e.printStackTrace();
    }  
	
	}

}

