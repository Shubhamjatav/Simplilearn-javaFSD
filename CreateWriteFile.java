package com.simplilearn.filehandling;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CreateWriteFile {
	
	public static void createFileUsingFileClass() throws IOException
	{
		File file=new File("C:\\Data\\testFile1.txt");

		if(file.createNewFile())
		{
			System.out.println("File is created");
		}
		else
		{
			System.out.println("File is already Exist");
		}
		//write data to that file
		FileWriter writer= new FileWriter(file, false);
		writer.write(" Welcome.....");
		writer.close();
	}
	public static void createFileUsingFileoutputStream() throws IOException
	{
		FileOutputStream out=new FileOutputStream("C:\\Data\\testFile2.txt",true);
		String input="Welcome to File Handling";
		byte array[]=input.getBytes();
		out.write(array);
		System.out.println("Data Written");
		out.close();
	}
	public static void createFileUsingNIO() throws IOException
	{
		Path path= Paths.get("C:\\Data\\testFile3.txt");
		//write data using Files class
		String input="Welcome to File Handling";
		byte array[]=input.getBytes();
		Files.write(path, array,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("Data Written");

		//write data of List to files directly

		Path path1= Paths.get("C:\\Data\\testFile4.txt");
		//write data using Files class
		List<String> list= Arrays.asList("this is my first line","this is my second line");
		Files.write(path1, list,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("Data Written");
	}

	public static void main(String[] args) {
		try {
			//createFileUsingFileClass();
			//createFileUsingFileoutputStream();
			createFileUsingNIO();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
