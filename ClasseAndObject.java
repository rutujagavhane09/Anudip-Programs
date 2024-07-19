package com.corejava.demo;

class Sample
{
	int x=5;
}
public class ClasseAndObject 
{
	final int x=10;	//instance variabel
	
	public static void main(String args[])
	{
		ClasseAndObject sf1=new ClasseAndObject();
		sf1.x=40;
		System.out.println(sf1.x);
		
		ClasseAndObject sf2=new ClasseAndObject();
		System.out.println(sf2.x);
		
		//Sample sm=new Sample();
		//System.out.println(sm.x);
	}
}
