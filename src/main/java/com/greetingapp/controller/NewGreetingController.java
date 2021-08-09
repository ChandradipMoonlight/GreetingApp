package com.greetingapp.controller;

import com.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class NewGreetingController {

    /**
     * this @Autowired Annotation used to create the Object of the GreetingService Class.
     */
    @Autowired
    private GreetingService greetingService;

    /**
     * Purpose: Ability to return message using GET method form the service class.
     * @return message.
     */
    @GetMapping(value = "/getMessage")
    public ResponseEntity<String> getMessage() {
        return new ResponseEntity<>(greetingService.getMessage(), HttpStatus.OK);
    }
}
