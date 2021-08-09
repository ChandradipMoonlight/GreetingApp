package com.greetingapp.controller;

import com.greetingapp.model.GreetingModel;
import com.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/hello")
public class GreetingController {
    private static final String template = "Hello, %s!";
    // AtomicLong is class and it is used to Automatically increment the sequence number.
    private final AtomicLong counter = new AtomicLong();

    /**
     * @param name;
     * @return Hello, World!
     * @GetMapping is the annotation used to handle the HTTP GET Request method.
     */
    @GetMapping(value = {"/", "", "home"})
    public GreetingModel greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new GreetingModel(counter.incrementAndGet(),
                String.format(template, name));
    }
}