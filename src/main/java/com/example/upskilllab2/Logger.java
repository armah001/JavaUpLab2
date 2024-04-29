package com.example.upskilllab2;

import lombok.Data;

@Data
public class Logger
{
    private static Logger instance;

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
