package com.greetingapp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private final String template = "Hello, %s %s!";

    /**
     * this method is used to return string message to the controller.
     * @return String;
     */
    public String getMessage() {
        return "Hello World";
    }

    public String getGreetingMessage(String firstName, String lastName) {
        return String.format(template, firstName, lastName);
    }
}
