package com.simplilearn.filehandling;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ReadFile {
	
	public static void readFileReaderClass() throws IOException
		{	
		FileReader reader= new FileReader("C:\\Data\\testFile1.txt");
		int data;
		while((data=reader.read())!=-1)
				{
		         System.out.println((char)data);
				}
	}
	public static void readFilefileInputstream() throws IOException{
		
		FileInputStream stream= new FileInputStream("C:\\Data\\testFile2.txt");
		int data;
		while((data=stream.read())!=-1) 
		{
			System.out.println((char)data);
		}
	}
	public static void readDataUsingNIO() throws IOException {
		{
			List<String> list= Collection.emptyList();
			Path path= Paths.get("C:\\Data\\testFile4.txt");
			list= Files.readAllLines(path,StandardCharsets.UTF_8);
			
		    Iterator<String> it=list.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
		public static void main(String[] args) {
			try {
				//readFileFileReaderClass();
				//readFilefileInputStream();
				readDataUsingNIO();
			}catch (Exception e) {
				// 1000: handle exception
			}
		}
	}
