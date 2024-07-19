// Performing CRUD Operations using JDBC on Employee Table.

package anudip.module44;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CRUDonEmployee 
{
    // Declare static variables for database connection and user input
    static Connection connection = null; // Database connection object
    static Scanner scanner = new Scanner(System.in); // Scanner object for user input

    public static void main(String[] args) 
    {
        try 
        {
            // Load the JDBC driver for MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection to the MySQL database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/module44", "root", "Mysql@Server11");

            // Menu loop for employee management system
            while (true) 
            {
                System.out.println("\nEmployee Management System");
                System.out.println("1. Create Employee Table"); // Option to create the Employee table
                System.out.println("2. Insert Employee Record"); // Option to insert a new employee record
                System.out.println("3. Retrieve Employees"); // Option to retrieve all employees
                System.out.println("4. Update Employee Record"); // Option to update an existing employee record
                System.out.println("5. Delete Employee Record"); // Option to delete an existing employee record
                System.out.println("6. Exit"); // Option to exit the program
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt(); // Read user choice from input
                scanner.nextLine(); // Consume newline left-over from nextInt()

                switch (choice) 
                {
                    case 1:
                        createEmployeeTable(); // Call method to create Employee table
                        break;
                    case 2:
                        insertEmployeeRecord(); // Call method to insert an employee record
                        break;
                    case 3:
                        retrieveEmployees(); // Call method to retrieve all employees
                        break;
                    case 4:
                        updateEmployeeRecord(); // Call method to update an employee record
                        break;
                    case 5:
                        deleteEmployeeRecord(); // Call method to delete an employee record
                        break;
                    case 6:
                        System.out.println("Exiting program..."); // Exit the program
                        closeResources(); // Call method to close resources (database connection and scanner)
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 6."); // Display message for invalid choice
                }
            }

        } 
        catch (ClassNotFoundException | SQLException e) // Catch block for handling exceptions
        {
            e.printStackTrace(); // Print stack trace for any exceptions
        } 
        finally 
        {
            closeResources(); // Call method to close resources in finally block
        }
    }

    // Method to create Employee table
    public static void createEmployeeTable() throws SQLException
    {
        // SQL query to create Employee table if not exists
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Employee ("
                + "ID INT(11) NOT NULL AUTO_INCREMENT, "
                + "NAME VARCHAR(30) NOT NULL, "
                + "AGE INT(3) NOT NULL, "
                + "DEPARTMENT VARCHAR(20) NOT NULL, "
                + "PRIMARY KEY (ID))";

        Statement statement = connection.createStatement(); // Create statement object
        statement.executeUpdate(createTableSQL); // Execute update to create table
        System.out.println("Employee table created successfully"); // Print success message
        statement.close(); // Close statement to release resources
    }

    // Method to insert an employee record
    public static void insertEmployeeRecord() throws SQLException 
    {
        System.out.print("Enter Employee Name: "); // Prompt user for employee name
        String name = scanner.nextLine(); // Read employee name from input
        System.out.print("Enter Employee Age: "); // Prompt user for employee age
        int age = scanner.nextInt(); // Read employee age from input
        scanner.nextLine(); // Consume newline left-over from nextInt()
        System.out.print("Enter Employee Department: "); // Prompt user for employee department
        String department = scanner.nextLine(); // Read employee department from input

        // SQL query to insert employee record into Employee table
        String insertRecordSQL = "INSERT INTO Employee (NAME, AGE, DEPARTMENT) VALUES (?, ?, ?)";

        PreparedStatement pstmt = connection.prepareStatement(insertRecordSQL); // Create prepared statement
        pstmt.setString(1, name); // Set parameter for employee name
        pstmt.setInt(2, age); // Set parameter for employee age
        pstmt.setString(3, department); // Set parameter for employee department

        int rowsInserted = pstmt.executeUpdate(); // Execute update to insert record
        if (rowsInserted > 0) // Check if insertion was successful
        {
            System.out.println("Employee record inserted successfully"); // Print success message
        }

        pstmt.close(); // Close prepared statement to release resources
    }

    // Method to retrieve all employees
    public static void retrieveEmployees() throws SQLException 
    {
        // SQL query to select all records from Employee table
        String selectSQL = "SELECT * FROM Employee";
        Statement statement = connection.createStatement(); // Create statement object
        ResultSet resultSet = statement.executeQuery(selectSQL); // Execute query to retrieve records

        // Loop through result set and print each employee's details
        while (resultSet.next()) 
        {
            int id = resultSet.getInt("ID"); // Get employee ID from result set
            String name = resultSet.getString("NAME"); // Get employee name from result set
            int age = resultSet.getInt("AGE"); // Get employee age from result set
            String department = resultSet.getString("DEPARTMENT"); // Get employee department from result set

            // Print employee details
            System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Department: " + department);
        }

        resultSet.close(); // Close result set to release resources
        statement.close(); // Close statement to release resources
    }

    // Method to update an employee record
    public static void updateEmployeeRecord() throws SQLException 
    {
        System.out.print("Enter Employee ID to update: "); // Prompt user for employee ID to update
        int id = scanner.nextInt(); // Read employee ID from input
        scanner.nextLine(); // Consume newline left-over from nextInt()

        System.out.println("Select field to update:"); // Prompt user to select field to update
        System.out.println("1. Name"); // Option to update employee name
        System.out.println("2. Age"); // Option to update employee age
        System.out.println("3. Department"); // Option to update employee department
        System.out.print("Enter your choice: "); // Prompt user for choice
        int choice = scanner.nextInt(); // Read choice from input
        scanner.nextLine(); // Consume newline left-over from nextInt()

        String updateField = ""; // Variable to store field to update
        String newValue = ""; // Variable to store new value for field

        switch (choice) // Switch statement based on user choice
        {
            case 1:
                updateField = "NAME"; // Set field to update as NAME
                System.out.print("Enter new Name: "); // Prompt user for new name
                newValue = scanner.nextLine(); // Read new name from input
                break;
            case 2:
                updateField = "AGE"; // Set field to update as AGE
                System.out.print("Enter new Age: "); // Prompt user for new age
                newValue = scanner.nextLine(); // Read new age from input
                break;
            case 3:
                updateField = "DEPARTMENT"; // Set field to update as DEPARTMENT
                System.out.print("Enter new Department: "); // Prompt user for new department
                newValue = scanner.nextLine(); // Read new department from input
                break;
            default:
                System.out.println("Invalid choice"); // Display message for invalid choice
                return; // Return from method
        }

        // SQL query to update employee record based on ID and chosen field
        String updateSQL = "UPDATE Employee SET " + updateField + " = ? WHERE ID = ?";
        PreparedStatement pstmt = connection.prepareStatement(updateSQL); // Create prepared statement
        pstmt.setString(1, newValue); // Set parameter for new value
        pstmt.setInt(2, id); // Set parameter for employee ID

        int rowsUpdated = pstmt.executeUpdate(); // Execute update to update record
        if (rowsUpdated > 0) // Check if update was successful
        {
            System.out.println("Employee record updated successfully"); // Print success message
        } 
        else 
        {
            System.out.println("Employee record with ID " + id + " not found"); // Print message if employee record not found
        }

        pstmt.close(); // Close prepared statement to release resources
    }

    // Method to delete an employee record
    public static void deleteEmployeeRecord() throws SQLException 
    {
        System.out.print("Enter Employee ID to delete: "); // Prompt user for employee ID to delete
        int id = scanner.nextInt(); // Read employee ID from input
        scanner.nextLine(); // Consume newline left-over from nextInt()

        // SQL query to delete employee record based on ID
        String deleteSQL = "DELETE FROM Employee WHERE ID = ?";
        PreparedStatement pstmt = connection.prepareStatement(deleteSQL); // Create prepared statement
        pstmt.setInt(1, id); // Set parameter for employee ID

        int rowsDeleted = pstmt.executeUpdate(); // Execute update to delete record
        if (rowsDeleted > 0) // Check if deletion was successful
        {
            System.out.println("Employee record deleted successfully"); // Print success message
        } 
        else 
        {
            System.out.println("Employee record with ID " + id + " not found"); // Print message if employee record not found
        }

        pstmt.close(); // Close prepared statement to release resources
    }

    // Method to close connection and scanner
    public static void closeResources() 
    {
        try 
        {
            if (connection != null && !connection.isClosed()) // Check if connection is not null and not closed
            {
                connection.close(); // Close database connection
            }
            if (scanner != null) // Check if scanner is not null
            {
                scanner.close(); // Close scanner
            }
        } 
        catch (SQLException e) // Catch block for handling SQLException
        {
            e.printStackTrace(); // Print stack trace for SQLException
        }
    }
}


/*
OUTPUT:

Employee Management System
1. Create Employee Table
2. Insert Employee Record
3. Retrieve Employees
4. Update Employee Record
5. Delete Employee Record
6. Exit
Enter your choice: 2
Enter Employee Name: Rohit Sharma
Enter Employee Age: 50
Enter Employee Department: Cricket
Employee record inserted successfully

Employee Management System
1. Create Employee Table
2. Insert Employee Record
3. Retrieve Employees
4. Update Employee Record
5. Delete Employee Record
6. Exit
Enter your choice: 3
ID: 1, Name: Raviraj Patil, Age: 23, Department: IT
ID: 2, Name: Kalpesh Kumbhar, Age: 24, Department: CS
ID: 3, Name: Gaurav Patil, Age: 25, Department: MCA
ID: 5, Name: Ajit Patil, Age: 55, Department: Electronics
ID: 6, Name: Rohit Sharma, Age: 50, Department: Cricket

Employee Management System
1. Create Employee Table
2. Insert Employee Record
3. Retrieve Employees
4. Update Employee Record
5. Delete Employee Record
6. Exit
Enter your choice: 4
Enter Employee ID to update: 6
Select field to update:
1. Name
2. Age
3. Department
Enter your choice: 2
Enter new Age: 45
Employee record updated successfully

Employee Management System
1. Create Employee Table
2. Insert Employee Record
3. Retrieve Employees
4. Update Employee Record
5. Delete Employee Record
6. Exit
Enter your choice: 3
ID: 1, Name: Raviraj Patil, Age: 23, Department: IT
ID: 2, Name: Kalpesh Kumbhar, Age: 24, Department: CS
ID: 3, Name: Gaurav Patil, Age: 25, Department: MCA
ID: 5, Name: Ajit Patil, Age: 55, Department: Electronics
ID: 6, Name: Rohit Sharma, Age: 45, Department: Cricket

Employee Management System
1. Create Employee Table
2. Insert Employee Record
3. Retrieve Employees
4. Update Employee Record
5. Delete Employee Record
6. Exit
Enter your choice: 6
Exiting program...
*/