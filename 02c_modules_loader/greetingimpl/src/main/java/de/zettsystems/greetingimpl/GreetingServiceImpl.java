package de.zettsystems.greetingimpl;

import de.zettsystems.greeting.GreetingService;

public class GreetingServiceImpl implements GreetingService {
    public void sayGreeting() {
        System.out.println("Greetings World!");
    }
}
