//Question: Write a Java program that calculates the sum of all prime numbers up to a given limit using multiple threads.

package lab.com;
import java.util.*;

// Class that calculates the sum of prime numbers in a given range
class PrimeCalculator implements Runnable 
{
    private long start;
    private long end;
    private long sum;

    // Constructor to initialize the range
    public PrimeCalculator(long start, long end) 
    {
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    @Override
    public void run() 
    {
        // Loop through the range and add prime numbers to the sum
        for (long no = start; no <= end; no++) 
        {
            if (isPrime(no)) 
            {
                sum = sum + no;
            }
        }
    }

    // Method to check if a number is prime
    private boolean isPrime(long number)
    {
        if (number <= 1) 
        {
            return false;
        }
        for (long i = 2; i * i <= number; i++) 
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    // Method to get the sum of prime numbers calculated
    public long getSum() 
    {
        return sum;
    }
}

// Main class to run the Prime Sum Application
public class PrimeSumApplication
{
    public static void main(String[] args) throws InterruptedException 
    {
        // Create a Scanner object to read input from the user
        Scanner xyz = new Scanner(System.in);

        // Prompt the user to enter the limit for prime number calculation
        System.out.print("Enter the limit for prime number calculation: ");
        long limit = xyz.nextLong();

        // Prompt the user to enter the number of threads
        System.out.print("Enter the number of threads: ");
        int numThreads = xyz.nextInt();

        // Calculate the range each thread will process
        long step = limit / numThreads;
        long start = 1;
        long end = step;

        // Arrays to hold PrimeCalculator objects and Threads
        PrimeCalculator[] p = new PrimeCalculator[numThreads];
        Thread[] threads = new Thread[numThreads];

        // Create and start each thread
        for (int i = 0; i < numThreads; i++) 
        {
            p[i] = new PrimeCalculator(start, end);
            threads[i] = new Thread(p[i]);
            threads[i].start();

            // Update the range for the next thread
            start = end + 1;
            end += step;
        }

        long sum = 0;

        // Wait for all threads to finish and accumulate the sum of primes
        for (int i = 0; i < numThreads; i++)
        {
            threads[i].join(); // Wait for the thread to finish
            sum = sum + p[i].getSum(); // Add the sum from the thread
        }

        // Print the total sum of prime numbers up to the limit
        System.out.println("Sum of prime numbers up to " + limit + " is: " + sum);

        // Close the scanner
        xyz.close();
    }
}
/*
OUTPUT:
Enter the limit for prime number calculation: 100
Enter the number of threads: 4
Sum of prime numbers up to 100 is: 1060
*/