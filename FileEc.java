package com.demo;

import java.io.*;

public class FileEc 
{
	File file=new File("input.txt");
	
	String str="Raviraj Patil";
	
	FileWriter writer=new FileWriter(file);
	
	writer.write(str);
	
	writer.close();
}
