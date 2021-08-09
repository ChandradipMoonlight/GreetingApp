package com.greetingapp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    /**
     * this method is used to return string message to the controller.
     * @return String;
     */
    public String getMessage() {
        return "Hello World";
    }
}
