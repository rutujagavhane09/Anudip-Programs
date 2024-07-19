//Question: Write a Java program to create a producer-consumer scenario using the wait() and notify() methods for thread synchronization.

package lab.com;

// Application class that acts as a shared resource for producer and consumer
class Application
{
    private int data;
    private boolean produced;

    // Synchronized method to produce data
    public synchronized void produce(int value)
    {
        while (produced) // Wait if data has already been produced and not yet consumed
        {
            try 
            {
                wait(); // Release the lock and wait until notified
            } 
            catch (InterruptedException e) 
            {
                Thread.currentThread().interrupt(); // Preserve interrupt status
            }
        }
        data = value; // Produce data
        System.out.println("Produced: " + value);
        produced = true; // Mark data as produced
        notify(); // Notify the consumer that data is available
    }

    // Synchronized method to consume data
    public synchronized int consume() 
    {
        while (!produced) // Wait if data has not yet been produced
        {
            try 
            {
                wait(); // Release the lock and wait until notified
            }
            catch (InterruptedException e) 
            {
                Thread.currentThread().interrupt(); // Preserve interrupt status
            }
        }
        System.out.println("Consumed: " + data);
        produced = false; // Mark data as consumed
        notify(); // Notify the producer that data has been consumed
        return data; // Return consumed data
    }
}

// Producer class that implements Runnable to produce data
class Producer implements Runnable
{
    private Application a;

    // Constructor to initialize the shared resource
    public Producer(Application a) 
    {
        this.a = a;
    }

    @Override
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            a.produce(i); // Produce data
            try
            {
                Thread.sleep(1000); // Sleep for 1 second to simulate production time
            }
            catch (InterruptedException e)
            {
                Thread.currentThread().interrupt(); // Preserve interrupt status
            }
        }
    }
}

// Consumer class that implements Runnable to consume data
class Consumer implements Runnable 
{
    private Application aa;

    // Constructor to initialize the shared resource
    public Consumer(Application aa) 
    {
        this.aa = aa;
    }

    @Override
    public void run() 
    {
        for (int i = 1; i <= 5; i++)
        {
            aa.consume(); // Consume data
            try 
            {
                Thread.sleep(1000); // Sleep for 1 second to simulate consumption time
            }
            catch (InterruptedException e) 
            {
                Thread.currentThread().interrupt(); // Preserve interrupt status
            }
        }
    }
}

// Main class to run the Producer-Consumer application
public class ProducerConsumerApp
{
    public static void main(String[] args) 
    {
        // Create a shared Application object
        Application app = new Application();
        
        // Create and start producer and consumer threads
        Thread producerThread = new Thread(new Producer(app));
        Thread consumerThread = new Thread(new Consumer(app));
        producerThread.start();
        consumerThread.start();
    }
}
/*
OUTPUT:
Produced: 1
Consumed: 1
Produced: 2
Consumed: 2
Produced: 3
Consumed: 3
Produced: 4
Consumed: 4
Produced: 5
Consumed: 5
*/