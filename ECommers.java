package com.demo;

interface Product 
{
	void showProduct();
	void addProduct(String productName, double price);
	void deleteProduct(String productName);
	double calculateTotalPrice();
}

class OnlineProduct implements Product 
{
	private String[] products;
	private double[] prices;
	private int count;

	public OnlineProduct(int capacity) 
	{
		products = new String[capacity];
		prices = new double[capacity];
		count = 0;
	}

	@Override
	public void showProduct() 
	{
		System.out.println("Products available online:");
		for (int i = 0; i < count; i++) 
		{
			System.out.println(products[i] + " - " + prices[i]);
		}	
	}

	@Override
	public void addProduct(String productName, double price) 
	{
		products[count] = productName;
		prices[count] = price;
		count++;
		System.out.println(productName + " added to online products.");
	}

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

class PhysicalProduct implements Product 
{
	private String[] products;
	private double[] prices;
	private int count;

	public PhysicalProduct(int capacity) 
	{
		products = new String[capacity];
		prices = new double[capacity];
		count = 0;
	}

	@Override
	public void showProduct() 
	{
		System.out.println("Products available physically:");
		for (int i = 0; i < count; i++) 
		{
			System.out.println(products[i] + " - " + prices[i]);
		}
	}

	@Override
	public void addProduct(String productName, double price) 
	{
		products[count] = productName;
		prices[count] = price;
		count++;
		System.out.println(productName + " added to physical products.");
	}

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

class Customer 
{
	private String name;

	public Customer(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
}

class Order 
{
	private Customer customer;
	private Product product;

	public Order(Customer customer, Product product) 
	{
		this.customer = customer;
		this.product = product;
	}

	public void placeOrder(String productName, double price) 
	{
		product.addProduct(productName, price);
	}

	public void removeOrder(String productName) 
	{
		product.deleteProduct(productName);
	}

	public void displayOrder() 
	{
		System.out.println("Order details for customer: " + customer.getName());
		product.showProduct();
	}

	public double getTotalPrice() 
	{
		return product.calculateTotalPrice();
	}
}

public class ECommers 
{
	public static void main(String[] args) 
	{
		Product onlineProduct = new OnlineProduct(10); 
		Product physicalProduct = new PhysicalProduct(10); 

		Customer customer1 = new Customer("Ravi");
		Customer customer2 = new Customer("Raj");

		Order order1 = new Order(customer1, onlineProduct);
		Order order2 = new Order(customer2, physicalProduct);

		order1.placeOrder("Laptop", 1000);
		order1.placeOrder("Phone", 500);
		order2.placeOrder("Chair", 50);
		order2.placeOrder("Table", 150);

		order1.displayOrder();
		System.out.println("Total price for customer " + customer1.getName() + ": " + order1.getTotalPrice());

		order2.displayOrder();
		System.out.println("Total price for customer " + customer2.getName() + ": " + order2.getTotalPrice());
	}
}
