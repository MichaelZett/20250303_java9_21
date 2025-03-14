package de.zettsystems.java9_10.misc;

public interface WithPrivateMethod {

    default String helloWorld() {
        return createHelloMessage("World");
    }

    default String helloUniverse() {
        return createHelloMessage("Universe");
    }

    //Neu!
    private String createHelloMessage(String world) {
        return "Hello " + world;
    }
}
