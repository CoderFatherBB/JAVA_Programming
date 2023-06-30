import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
// import java.sql.*;

// CREATE TABLE employees (
//     id INT PRIMARY KEY,
//     name VARCHAR(50),
//     email VARCHAR(50)
// );

// INSERT INTO employees (id, name, email)
// VALUES
//     (1, 'John Doe', 'john@example.com'),
//     (2, 'Jane Smith', 'jane@example.com'),
//     (3, 'Michael Johnson', 'michael@example.com');

public class Database_Connectivity_16 {

    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/practice";
        String username = "root";
        String password = "Bhavin#1";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Establish connection
            connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            statement = connection.createStatement();

            // Execute a query
            String query = "SELECT * FROM table_2;";
            resultSet = statement.executeQuery(query);

            // Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int roll_no = resultSet.getInt("roll_no");
                int srn_id = resultSet.getInt("srn_id");

                System.out.println("ID: " + id + ", Roll no: " + roll_no + ", Srn id: " + srn_id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the resources
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
