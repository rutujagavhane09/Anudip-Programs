// Question: Insert the record into Employee table using JDBC

package anudip.module44;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertEmployee 
{
    public static void main(String[] args) 
    {
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
        try {
            // Define the URL of the database, including the database name
            String url = "jdbc:mysql://localhost:3306/module44";
            // Define the database username
            String username = "root";
            // Define the database password
            String password = "Mysql@Server11";

            // Establish the connection to the database using the URL, username, and password
            connection = DriverManager.getConnection(url, username, password);

            // Create a Statement object for sending SQL statements to the database
            Statement statement = connection.createStatement();

            // Define the SQL query to insert a record into the Employee table
            String insertRecordSQL = "INSERT INTO Employee (NAME, AGE, DEPARTMENT) "
                    + "VALUES ('Raviraj Patil', 23, 'IT')"; // Inserting values

            // Execute the SQL query to insert the record
            statement.executeUpdate(insertRecordSQL);
            System.out.println("Record inserted into \"Employee\" table!"); // Print success message

            // Close the Statement object to release resources
            statement.close();
            // Close the Connection object to release the database connection
            connection.close();

        } 
        catch (SQLException e) 
        {
            e.printStackTrace(); // Print the stack trace if an SQL exception occurs
        }
    }
}

// OUTPUT: Record inserted into "Employee" table!