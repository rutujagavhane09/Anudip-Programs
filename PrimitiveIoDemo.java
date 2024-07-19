package com.interfaceExamples;

import java.io.*;

public class PrimitiveIoDemo 
{
	public static void main(String[] args) throws IOException
	{
		FileOutputStream fos=new FileOutputStream("primitive.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeInt(20);
		dos.writeDouble(2.4);
		dos.close();
		fos.close();
		
		System.out.println("File Creat Zhali");
		System.out.println("================");
		System.out.println("File Reading...");
		
		FileInputStream fis=new FileInputStream("primitive.txt");
		DataInputStream dis=new DataInputStream(fis);

		System.out.println(dis.readBoolean());
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		
		dis.close();
		dis.close();
	}
}
