package com.greetingapp.controller;

import com.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
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
    @GetMapping(value = "/message")
    public ResponseEntity<String> getMessage() {
        return new ResponseEntity<>(greetingService.getMessage(), HttpStatus.OK);
    }

    /**
     * Purpose: Ability to return the Greeting message using service layer with
     *          1. User First Name and Last Name or
     * 			2. With just First Name or Last Name based on User attributes provides or
     * 			3. Just Hello World.
     * @param firstName;
     * @param lastName;
     * @return Hello firstName lastName! or firstName lastName or Hello World! etc.
     */
    @GetMapping(value = {"greeting"})
    public ResponseEntity<String> getGreetingMessage(@RequestParam (value = "firstName", defaultValue = "World") String firstName,
                                                     @RequestParam (value = "lastName", defaultValue = "") String lastName) {
        return new ResponseEntity<>(greetingService.getGreetingMessage(firstName, lastName), HttpStatus.OK);
    }
}
