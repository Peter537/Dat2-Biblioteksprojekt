package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionConfiguration {

    private static Connection connection;

    public static Connection getConnection() {
        if (connection != null) {
            return connection;
        }

        String url = "jdbc:mysql://localhost:3306/bibliotek?serverTimezone=CET&useSSL=false";
        String user = "root";
        String password = "123";
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }
}