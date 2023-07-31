package org.paging;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
    public static Connection connection;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_ij", "root", "root");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
