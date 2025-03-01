package de.zettsystems.app;

import de.zettsystems.greeting.GreetingService;

import java.util.ServiceLoader;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Doing lookup....");
        Iterable<GreetingService> services =
                ServiceLoader.load(GreetingService.class);

        services.forEach(GreetingService::sayGreeting);
    }
}
