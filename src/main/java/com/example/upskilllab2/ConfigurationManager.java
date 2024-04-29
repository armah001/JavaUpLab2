package com.example.upskilllab2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//@Service... no using service since spring auto configures the singleton in the app context

//Singleton
@Slf4j
public class ConfigurationManager {
    private static ConfigurationManager instance;

    @Value("${database.url}")
    private String databaseUrl;

    private ConfigurationManager() {
    }

    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }
}
