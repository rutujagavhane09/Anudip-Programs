/*Question: Write a Java programming to create a e-commerce system with three classes product customer and order, online product and physical product are implementation of Product interface. 
procuct intrface has list of product as method for adding them. Product should be the iterface with methods show product, addproduct, delete product, and claculate product prize*/

package com.demo;

// Define an interface Product with common methods for all product types
interface Product 
{
	// Method to show all products
	void showProduct();

	// Method to add a product
	void addProduct(String productName, double price);

	// Method to delete a product
	void deleteProduct(String productName);

	// Method to calculate the total price of all products
	double calculateTotalPrice();
}

// Class OnlineProduct implements the Product interface
class OnlineProduct implements Product 
{
	// Array to store product names
	private String[] products;

	// Array to store product prices
	private double[] prices;

	// Variable to keep track of the number of products
	private int count;

	// Constructor to initialize arrays with a specified capacity
	public OnlineProduct(int capacity) 
	{
		products = new String[capacity];
		prices = new double[capacity];
		count = 0;
	}

	// Override method to show all online products
	@Override
	public void showProduct() 
	{
		System.out.println("Products available online:");
		for (int i = 0; i < count; i++) 
		{
			System.out.println(products[i] + " - " + prices[i]);
		}	
	}

	// Override method to add an online product
	@Override
	public void addProduct(String productName, double price) 
	{
		products[count] = productName;
		prices[count] = price;
		count++;
		System.out.println(productName + " added to online products.");
	}

	// Override method to delete an online product
	@Override
	public void deleteProduct(String productName) 
	{
		int index = -1;
		for (int i = 0; i < count; i++) 
		{
			if (products[i].equals(productName)) 
			{
				index = i;
				break;
			}
		}
		if (index != -1)
		{
			for (int i = index; i < count - 1; i++) 
			{
				products[i] = products[i + 1];
				prices[i] = prices[i + 1];
			}
			count--;
			System.out.println(productName + " removed from online products.");
		} 
		else
		{
			System.out.println("Product not found.");
		}
	}

	// Override method to calculate the total price of online products
	@Override
	public double calculateTotalPrice() 
	{
		double totalPrice = 0;
		for (int i = 0; i < count; i++) 
	    {
			totalPrice += prices[i];
	    }
		return totalPrice;
	}
}

// Class PhysicalProduct implements the Product interface
class PhysicalProduct implements Product 
{
	// Array to store product names
	private String[] products;

	// Array to store product prices
	private double[] prices;

	// Variable to keep track of the number of products
	private int count;

	// Constructor to initialize arrays with a specified capacity
	public PhysicalProduct(int capacity) 
	{
		products = new String[capacity];
		prices = new double[capacity];
		count = 0;
	}

	// Override method to show all physical products
	@Override
	public void showProduct() 
	{
		System.out.println("Products available physically:");
		for (int i = 0; i < count; i++) 
		{
			System.out.println(products[i] + " - " + prices[i]);
		}
	}

	// Override method to add a physical product
	@Override
	public void addProduct(String productName, double price) 
	{
		products[count] = productName;
		prices[count] = price;
		count++;
		System.out.println(productName + " added to physical products.");
	}

	// Override method to delete a physical product
	@Override
	public void deleteProduct(String productName) 
	{
		int index = -1;
		for (int i = 0; i < count; i++) 
		{
			if (products[i].equals(productName))
			{
				index = i;
				break;
			}
		}
    	if (index != -1) 
    	{	
    		for (int i = index; i < count - 1; i++) 
    		{
    			products[i] = products[i + 1];
    			prices[i] = prices[i + 1];
    		}
    		count--;
    		System.out.println(productName + " removed from physical products.");
    	} 
    	else 
    	{
    		System.out.println("Product not found.");
    	}
	}

	// Override method to calculate the total price of physical products
	@Override
	public double calculateTotalPrice()
	{
		double totalPrice = 0;
		for (int i = 0; i < count; i++) 
		{
			totalPrice += prices[i];
    	}
		return totalPrice;
	}
}

// Class Customer to represent a customer
class Customer 
{
	// Variable to store customer's name
	private String name;

	// Constructor to initialize customer's name
	public Customer(String name) 
	{
		this.name = name;
	}

	// Method to get the customer's name
	public String getName() 
	{
		return name;
	}
}

// Class Order to represent an order
class Order 
{
	// Variable to store the customer
	private Customer customer;

	// Variable to store the product
	private Product product;

	// Constructor to initialize customer and product
	public Order(Customer customer, Product product) 
	{
		this.customer = customer;
		this.product = product;
	}

	// Method to place an order by adding a product
	public void placeOrder(String productName, double price) 
	{
		product.addProduct(productName, price);
	}

	// Method to remove an order by deleting a product
	public void removeOrder(String productName) 
	{
		product.deleteProduct(productName);
	}

	// Method to display order details
	public void displayOrder() 
	{
		System.out.println("Order details for customer: " + customer.getName());
		product.showProduct();
	}

	// Method to get the total price of the order
	public double getTotalPrice() 
	{
		return product.calculateTotalPrice();
	}
}

// Main class to run the e-commerce application
public class ECommers 
{
	public static void main(String[] args) 
	{
		// Create instances of OnlineProduct and PhysicalProduct with a capacity of 10
		Product onlineProduct = new OnlineProduct(10); 
		Product physicalProduct = new PhysicalProduct(10); 

		// Create instances of Customer
		Customer customer1 = new Customer("Ravi");
		Customer customer2 = new Customer("Raj");

		// Create instances of Order for each customer
		Order order1 = new Order(customer1, onlineProduct);
		Order order2 = new Order(customer2, physicalProduct);

		// Place orders for different products
		order1.placeOrder("Laptop", 1000);
		order1.placeOrder("Phone", 500);
		order2.placeOrder("Chair", 50);
		order2.placeOrder("Table", 150);

		// Display orders and their total prices
		order1.displayOrder();
		System.out.println("Total price for customer " + customer1.getName() + ": " + order1.getTotalPrice());

		order2.displayOrder();
		System.out.println("Total price for customer " + customer2.getName() + ": " + order2.getTotalPrice());
	}
}
/*
OUTPUT:
Laptop added to online products.
Phone added to online products.
Chair added to physical products.
Table added to physical products.
Order details for customer: Ravi
Products available online:
Laptop - 1000.0
Phone - 500.0
Total price for customer Ravi: 1500.0
Order details for customer: Raj
Products available physically:
Chair - 50.0
Table - 150.0
Total price for customer Raj: 200.0
*/