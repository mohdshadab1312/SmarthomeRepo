package com.tcs.Smarthome.Utilities;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Report {
	
	public static void main(String arg[]){
		writeMessage("Pass","script01");
	}
	
	public static void writeMessage(String msg, String scriptName){
	String TestFile= System.getProperty("user.dir")+"\\reports\\"+scriptName+".txt";
	try{
	File fc= new File(TestFile);
	if (!fc.exists()) {
		
			fc.createNewFile();
		
	   }
	//Creating FileWriter object
    //using file object we got the filePath
    FileWriter fw = new FileWriter(fc.getAbsoluteFile());
    //Creating BufferedWriter object
    BufferedWriter bw = new BufferedWriter(fw);
    //Writing content into file
    bw.write(msg);
    //Adding new line 
    bw.newLine();
    bw.close();
    System.out.println("Data is Successfully written");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
