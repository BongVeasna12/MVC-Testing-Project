package istad;

import java.sql.*;

public class DbMain {
    public static void main(String[] args){
        String url = "jdbc:postgresql://192.168.1.5:5432/mydatabase";
        String username = "testdb";
        String password = "123456";
        try {
            // 1.Register driver
            Class.forName("org.postgresql.Driver");
            // 2.Establish connection
           try (Connection connection = DriverManager.getConnection(url, username, password);){
               // 3. Create statement


               PreparedStatement statement = connection
                       .prepareStatement("SELECT * FROM students WHERE id=?");
               statement.setInt(1, 38);
               //statement.setString(2, "nheoumveansa@gmail.com");
               // 4. Execute statement
               ResultSet rs = statement.executeQuery();
               // 5.Handle result
               while (rs.next()) {
                   System.out.println("ID: " + rs.getInt("id"));
                   System.out.println("NAME: " + rs.getString("name"));
                   System.out.println("Gender: " + rs.getString("gender"));
                   System.out.println("Address:" + rs.getString("address"));
                   System.out.println("-------------------------------------------");
               }
           }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }
