package de.zettsystems.java25_xx.structured;

public class SyncPlanetApp {
    void sync() throws Exception {
        int[] planetIds = {1,2,3,4,5};
        for (int planetId : planetIds) {
            new PlanetService().getPlanet(planetId);
        }
    }
    public static void main(String[] args) {
        var myApp = new SyncPlanetApp();
        System.out.println("\n\r-- BEGIN Sync");
        try {
            myApp.sync();
        } catch (Exception e){
            System.err.println("Error: " + e);
        }
    }
}
