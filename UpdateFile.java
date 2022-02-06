package com.simplilearn.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateFile {
	
	public static void modifyFile(String file,String olddata,String newdata)
	{
		File fileToBeModified= new File(file);
		String fileData="";
		BufferedReader reader=null;
		FileWriter writer=null;
		
		try {
			reader=new BufferedReader(new FileReader(fileToBeModified));
			String line=reader.readLine();
			while(line!=null)
			{
				fileData=fileData+System.lineSeparator();
				line=reader.readLine();
			}
			String newFileData=fileData.replaceAll(olddata, newdata);
			writer=new FileWriter(fileToBeModified);
	        writer.write(newFileData);
	        System.out.println("Data Update Successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
			reader.close();
			writer.close();
		}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}		
	
	public static void main(String[] args) {
		
		modifyFile("C:\\Data\\testFile4.txt","welcome","Good Morning");
	}
}
