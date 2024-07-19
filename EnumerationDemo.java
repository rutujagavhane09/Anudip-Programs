package com.demo;

enum Diraction
{
	North,
	South,
	East,
	West
}
public class EnumerationDemo 
{
	public static void main(String args[])
	{
		Diraction dir=Diraction.North;
//		Diraction di2=Diraction.South;
////		System.out.println("First Direction: "+di1);
////		System.out.println("First Direction: "+di2);
//		for(Diraction dir: Diraction.values())
//		{
//			System.out.println(dir);
//		}
		if(dir==Diraction.East)
		{
			System.out.println("Direction: East");
		}
		else if(dir==Diraction.South)
		{
			System.out.println("Direction: South");
		}
		else if(dir==Diraction.North)
		{
			System.out.println("Direction: North");
		}
		else
		{
			System.out.println("Direction: West");
		}
	}
}
