package com.example.upskilllab2;
//Singleton
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    private ConfigurationManager configManager;

    public ConfigController() {
        this.configManager = ConfigurationManager.getInstance();
    }

    @GetMapping("/config")
    public String getConfigValue() {
        String value = configManager.getDatabaseUrl();
        return "Value for key : " + value;
    }
}

