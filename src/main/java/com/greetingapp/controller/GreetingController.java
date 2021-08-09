package com.greetingapp.controller;

import com.greetingapp.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    private static final String template = "Hello, %s!";
    // AtomicLong is class and it is used to Automatically increment the sequence number.
    private final AtomicLong counter = new AtomicLong();

    /**
     * @GetMapping is the annotation used to handle the HTTP GET Request method.
     * @param name;
     * @return Hello, World!
     */
    @GetMapping(value = {"/", "", "home"})
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),
                           String.format(template, name));
    }
}
