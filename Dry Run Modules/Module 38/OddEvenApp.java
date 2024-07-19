//Question: Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.

package lab.com;

// Class that implements Runnable to print even numbers
class EvenRunnable implements Runnable 
{
    @Override
    public void run() 
    {
        // Loop to print even numbers from 2 to 20
        for (int i = 2; i <= 20; i += 2) 
        {
            System.out.println("Even: " + i); // Print the even number
            try 
            {
                Thread.sleep(500); // Pause execution for 500 milliseconds
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace(); // Print the stack trace if an interruption occurs
            }
        }
    }
}

// Class that implements Runnable to print odd numbers
class OddRunnable implements Runnable 
{
    @Override
    public void run() 
    {
        // Loop to print odd numbers from 1 to 20
        for (int i = 1; i <= 20; i += 2) 
        {
            System.out.println("Odd: " + i); // Print the odd number
            try 
            {
                Thread.sleep(500); // Pause execution for 500 milliseconds
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace(); // Print the stack trace if an interruption occurs
            }
        }
    }
}

// Main class to run the Odd and Even number printing application
public class OddEvenApp
{
    public static void main(String[] args) 
    {
        // Create a thread to execute the EvenRunnable
        Thread evenThread = new Thread(new EvenRunnable());
        // Create a thread to execute the OddRunnable
        Thread oddThread = new Thread(new OddRunnable());
        
        // Start the even number printing thread
        evenThread.start();
        // Start the odd number printing thread
        oddThread.start();
    }
}
/*
OUTPUT:
Even: 2
Odd: 1
Even: 4
Odd: 3
Even: 6
Odd: 5
Even: 8
Odd: 7
Even: 10
Odd: 9
Even: 12
Odd: 11
Even: 14
Odd: 13
Even: 16
Odd: 15
Even: 18
Odd: 17
Even: 20
Odd: 19
*/