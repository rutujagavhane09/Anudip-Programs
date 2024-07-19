package com.corejava.demo;

public class Operator 
{
	public static void main(String agrs[])
	{
		int a=10,b=20;
		System.out.println("a + b = "+(a+b));
		System.out.println("a - b = "+(a-b));
		System.out.println("a * b = "+(a*b));
		System.out.println("a / b = "+(a/b));
		System.out.println("a % b = "+(a%b));
		
		int c=15,d=30;
		System.out.println("c < d = "+(c<d));
		System.out.println("c > d = "+(c>d));
		System.out.println("c <= d = "+(c<=d));
		System.out.println("c >= d = "+(c>=d));
		System.out.println("c == d = "+(c==d));
		System.out.println("c != d = "+(c!=d));
		
		int e=3,f=5;
		System.out.println("e & f = "+(e&f));  //0011 & 0101 = 0001
		System.out.println("e | f = "+(e|f));  //0011 & 0101 = 0111
		System.out.println("e ^ f = "+(e^f));  //0011 & 0101 = 0110
		
		int res=(e>f) ? e : f;
		System.out.println("e > f = "+res);
		
		a=10;
		b=20;
		System.out.println(" ==> "+(a>>2));
		
		
	}
}
