package com.example.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingServiceTest {

    private GreetingService greetingService = new GreetingService();

    @Test
    public void testGetGreeting() {
        String result = greetingService.getGreeting("John");
        assertEquals("Hello, John!", result);
    }

    @Test
    public void testGetGreetingWithDefault() {
        String result = greetingService.getGreeting("");
        assertEquals("Hello, !", result);
    }
}
