package com.greetingapp.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    // AtomicLong is class and it is used to Automatically increment the sequence number.
    private final AtomicLong counter = new AtomicLong();
}
