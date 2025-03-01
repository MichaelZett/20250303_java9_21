package de.zettsystems.java25_xx.structured;

import java.util.concurrent.StructuredTaskScope;

public class StructuredConcurPlanetApp {
    void sc() throws Exception {
        int[] planetIds = {1,2,3,4,5};
        try (var scope = new StructuredTaskScope<>()) {
            for (int planetId : planetIds) {
                scope.fork(() -> new PlanetService().getPlanet(planetId));
            }
            scope.join();
        }catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
    public static void main(String[] args) {
        var myApp = new StructuredConcurPlanetApp();
        // ...
        System.out.println("\n\r-- BEGIN Structured Concurrency");
        try {
            myApp.sc();
        } catch (Exception e){
            System.err.println("Error: " + e);
        }
    }
}
