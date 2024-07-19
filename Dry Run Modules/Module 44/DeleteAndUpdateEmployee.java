// Question: Delete and Update the record from Employee

package anudip.module44;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteAndUpdateEmployee 
{
    // Update Employee method
    public static void updateEmployee(Connection con, int id, String update, String sql) 
    {
        try (PreparedStatement pstmt = con.prepareStatement(sql)) 
        {
            pstmt.setString(1, update);
            pstmt.setInt(2, id);
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing employee was updated successfully!");
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }

    // Delete Employee method
    public static void deleteEmployee(Connection con, int id) 
    {
        String sql = "DELETE FROM Employee WHERE id = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) 
        {
            pstmt.setInt(1, id);
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) 
            {
                System.out.println("An employee was deleted successfully!");
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String name, department;
        int id, age;

        // Load the JDBC driver
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); // For MySQL, loads the JDBC driver class
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace(); // Print the stack trace if the driver class is not found
        }

        // Declare the Connection object
        Connection connection = null;
        try 
        {
            // Define the URL of the database, including the database name
            String url = "jdbc:mysql://localhost:3306/module44"; 
            // Define the database username
            String username = "root"; // Database username
            // Define the database password
            String password = "Mysql@Server11"; // Database password

            // Establish the connection to the database using the URL, username, and password
            connection = DriverManager.getConnection(url, username, password);

            // Create a Statement object for sending SQL statements to the database
            Statement statement = connection.createStatement();

            System.out.println("1. Update Employee");
            System.out.println("2. Delete Employee");
            System.out.print("\nEnter Your Choice: ");
            int ch = sc.nextInt();

            switch (ch) 
            {
                case 1: 
                {
                    System.out.println("\nUpdate Employee\n");
                    System.out.print("Employee Id: ");
                    id = sc.nextInt();
                    System.out.println("What Do You Want To Update");
                    System.out.println("1. Name");
                    System.out.println("2. Age");
                    System.out.println("3. Department");
                    System.out.print("\nEnter Your Choice: ");
                    int no = sc.nextInt();
                    String update = "";
                    String sql = "";

                    switch (no) 
                    {
                        case 1: 
                        {
                            System.out.print("Enter Name: ");
                            update = sc.next();
                            sql = "UPDATE Employee SET name = ? WHERE id = ?";
                            break;
                        }
                        case 2: 
                        {
                            System.out.print("Enter Age: ");
                            update = sc.next();
                            sql = "UPDATE Employee SET age = ? WHERE id = ?";
                            break;
                        }
                        case 3: 
                        {
                            System.out.print("Enter Department: ");
                            update = sc.next();
                            sql = "UPDATE Employee SET department = ? WHERE id = ?";
                            break;
                        }
                        default:
                            System.out.println("Invalid Choice");
                    }

                    updateEmployee(connection, id, update, sql);
                    break;
                }

                case 2: 
                {
                    System.out.println("\nDelete Employee\n");
                    System.out.print("Enter Employee Id: ");
                    id = sc.nextInt();
                    deleteEmployee(connection, id); // Delete the employee by id
                    break;
                }

                default:
                    System.out.println("Invalid Choice");
            }

            // Close the Statement object to release resources
            statement.close();
            // Close the Connection object to release the database connection
            connection.close();

        } 
        catch (SQLException e) 
        {        	
            e.printStackTrace(); // Print the stack trace if an SQL exception occurs
        }

        // Close the scanner
        sc.close();
    }
}

/*
OUTPUT 1: 
1. Update Employee
2. Delete Employee

Enter Your Choice: 1

Update Employee

Employee Id: 5
What Do You Want To Update
1. Name
2. Age
3. Department

Enter Your Choice: 2
Enter Age: 55
An existing employee was updated successfully!

OUTPUT 2:
1. Update Employee
2. Delete Employee

Enter Your Choice: 2

Delete Employee

Enter Employee Id: 4
An employee was deleted successfully!
*/