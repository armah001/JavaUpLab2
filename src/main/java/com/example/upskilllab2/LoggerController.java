package com.example.upskilllab2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggerController {
    private final Logger logger;
    public LoggerController() {
        logger = Logger.getInstance();
    }



    @GetMapping("/logInstance")
    public String logMessage(@RequestParam String message) {
        logger.log(message);
        return "Logged: " + message;
    }
}
