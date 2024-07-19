// Question: Create table in database using JDBC For Employee table

package anudip.module44;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateEmployee 
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

            // Define the SQL query for creating the Employee table
            String createTableSQL = "CREATE TABLE Employee ("
                    + "ID INT(11) NOT NULL AUTO_INCREMENT, " // Column for employee ID, primary key, auto-increment
                    + "NAME VARCHAR(30) NOT NULL, " // Column for employee name, not null
                    + "AGE INT(3) NOT NULL, " // Column for employee age, not null
                    + "DEPARTMENT VARCHAR(20) NOT NULL, " // Column for employee department, not null
                    + "PRIMARY KEY (ID))"; // Define the primary key as the ID column

            // Execute the SQL query to create the table
            statement.executeUpdate(createTableSQL);
            System.out.println("Table \"Employee\" is created!"); // Print success message

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

// OUTPUT: Table "Employee" is created!