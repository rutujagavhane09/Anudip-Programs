package com.corejava.demo;

public class Book 
{
	String title;
	String author;
	String ISBN;

	public Book(String title, String author, String ISBN) 
	{
		this.title = title;
	    this.author = author;
	    this.ISBN = ISBN;
	}

	class BookCollection {
	    private ArrayList<Book> books;

	    // Constructor
	    public BookCollection() {
	        this.books = new ArrayList<>();
	    }

	    // Method to add a book to the collection
	    public void addBook(Book book) {
	        books.add(book);
	    }

	    // Method to remove a book from the collection based on ISBN
	    public void removeBook(String ISBN) {
	        Iterator<Book> iterator = books.iterator();
	        while (iterator.hasNext()) {
	            Book book = iterator.next();
	            if (book.getISBN().equals(ISBN)) {
	                iterator.remove();
	                System.out.println("Book with ISBN " + ISBN + " has been removed.");
	                return;
	            }
	        }
	        System.out.println("Book with ISBN " + ISBN + " not found in the collection.");
	    }

	    // Method to display all books in the collection
	    public void displayBooks() {
	        if (books.isEmpty()) {
	            System.out.println("No books in the collection.");
	            return;
	        }
	        System.out.println("Books in the collection:");
	        for (Book book : books) {
	            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getISBN());
	        }
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        // Create a BookCollection object
	        BookCollection collection = new BookCollection();

	        // Add some books to the collection
	        collection.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"));
	        collection.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084"));
	        collection.addBook(new Book("1984", "George Orwell", "9780451524935"));

	        // Display all books in the collection
	        collection.displayBooks();

	        // Remove a book from the collection
	        collection.removeBook("9780061120084");

	        // Display all books in the collection after removal
	        collection.displayBooks();
	    }
	}

}
