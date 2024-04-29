package com.example.upskilllab2;

public class MySQLCon implements DbConnection{
    @Override
    public void connect(String dbUrl) {
        System.out.println("Connecting to MySQL database at " + dbUrl);
    }

}
