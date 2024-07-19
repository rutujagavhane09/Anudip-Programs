package com.corejava.demo;

class Sports 
{
	void play() 
	{
		System.out.println("Playing a sport");
	}
}

class Football extends Sports 
{
	@Override
	void play() 
	{
		System.out.println("Playing football");
	}
}

class Basketball extends Sports 
{
	@Override
	void play() 
	{
		System.out.println("Playing basketball");
	}
}

class Rugby extends Sports 
{
	@Override
	void play() 
	{
		System.out.println("Playing rugby");
	}
}

public class SportsMain 
{
	public static void main(String[] args) 
	{
		Football football = new Football();
		Basketball basketball = new Basketball();
		Rugby rugby = new Rugby();

		football.play();
		basketball.play();
		rugby.play();
	}
}
