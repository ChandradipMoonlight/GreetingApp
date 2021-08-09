package com.greetingapp.model;

import lombok.Data;

/**
 * When we use this @Data Annotation then we need to create getter and setter method.
 */
@Data
public class GreetingModel {
    private final long id;
    private final String message;

}
