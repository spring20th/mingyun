package com.example.demo.connection;
import lombok.extern.slf4j.Slf4j;
import java.sql.*;
import java.sql.SQLException;

import static com.example.demo.connection.ConnectionConst.*;

@Slf4j
public class DBConnectionUtil {
    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(URL,USERNAME, PASSWORD);
            log.info("GET CONNECTION={}, CLASS={}", connection, connection.getClass());
            return connection;
        }catch (SQLException e) {
            throw new IllegalStateException();
        }
    }
}
