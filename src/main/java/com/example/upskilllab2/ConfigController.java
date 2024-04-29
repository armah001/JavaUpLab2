package com.example.upskilllab2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    private ConfigurationManager configManager;

    public ConfigController(ConfigurationManager configManager) {
        this.configManager = configManager;
    }

    @GetMapping("/config")
    public String getConfigValue(@RequestParam String key) {
        String value = configManager.getProperty(key);
        return "Value for key '" + key + "': " + value;
    }
}

