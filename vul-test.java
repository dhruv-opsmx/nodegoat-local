package com.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class VulnerableUserSearch {

    public ResultSet findUser(Connection connection, String username) throws Exception {

        // INTENTIONALLY VULNERABLE - DO NOT USE IN PRODUCTION
        String query = "SELECT * FROM users WHERE username = '" + username + "'";

        Statement statement = connection.createStatement();

        return statement.executeQuery(query);
    }
}
