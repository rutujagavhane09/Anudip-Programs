// Question: Retrieve the data using JDBC for Employee

package anudip.module44;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveEmployee 
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
        try 
        {
            // Define the URL of the database, including the database name
            String url = "jdbc:mysql://localhost:3306/module44"; // Database name is module44
            // Define the database username
            String username = "root"; // Database username
            // Define the database password
            String password = "Mysql@Server11"; // Database password

            // Establish the connection to the database using the URL, username, and password
            connection = DriverManager.getConnection(url, username, password);

            // Create a Statement object for sending SQL statements to the database
            Statement statement = connection.createStatement();

            // Define the SQL query to retrieve data from the Employee table
            String selectSQL = "SELECT * FROM Employee";

            // Execute the SQL query to retrieve data
            ResultSet resultSet = statement.executeQuery(selectSQL);

            // Process the result set and print the retrieved data
            while (resultSet.next()) 
            {
                int id = resultSet.getInt("ID"); // Retrieve the value of the ID column
                String name = resultSet.getString("NAME"); // Retrieve the value of the NAME column
                int age = resultSet.getInt("AGE"); // Retrieve the value of the AGE column
                String department = resultSet.getString("DEPARTMENT"); // Retrieve the value of the DEPARTMENT column
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Department: " + department); // Print the retrieved data
            }

            // Close the ResultSet object to release resources
            resultSet.close();
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


/*
OUTPUT:
ID: 1, Name: Raviraj Patil, Age: 23, Department: IT
ID: 2, Name: Kalpesh Kumbhar, Age: 24, Department: CS
ID: 3, Name: Gaurav Patil, Age: 25, Department: MCA
 */  
