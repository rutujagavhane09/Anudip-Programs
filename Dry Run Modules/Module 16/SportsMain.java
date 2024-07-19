/*Question: Write a Java program to create a base class Sports with a method called play(). Create three subclasses: Football, Basketball, 
and Rugby. Override the play() method in each subclass to play a specific statement for each sport.*/

package com.corejava.demo;

// Base class representing a generic sport
class Sports 
{
    // Method to play the sport
    void play() 
    {
        System.out.println("Playing a sport");
    }
}

// Class representing football, inheriting from Sports
class Football extends Sports 
{
    // Override the play method to print specific message for Football
    @Override
    void play() 
    {
        System.out.println("Playing football");
    }
}

// Class representing basketball, inheriting from Sports
class Basketball extends Sports 
{
    // Override the play method to print specific message for Basketball
    @Override
    void play() 
    {
        System.out.println("Playing basketball");
    }
}

// Class representing rugby, inheriting from Sports
class Rugby extends Sports 
{
    // Override the play method to print specific message for Rugby
    @Override
    void play() 
    {
        System.out.println("Playing rugby");
    }
}

// Main class to test the sports
public class SportsMain 
{
    public static void main(String[] args) 
    {
        // Create a Football instance
        Football football = new Football();
        // Create a Basketball instance
        Basketball basketball = new Basketball();
        // Create a Rugby instance
        Rugby rugby = new Rugby();

        // Call the play method on Football instance
        football.play();
        // Call the play method on Basketball instance
        basketball.play();
        // Call the play method on Rugby instance
        rugby.play();
    }
}
/*
OUTPUT:
Playing football
Playing basketball
Playing rugby
*/