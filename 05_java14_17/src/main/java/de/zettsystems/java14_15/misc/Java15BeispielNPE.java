package de.zettsystems.java14_15.misc;

/**
 * Ab Java 14 einschaltbar, ab Java 15 default
 */
public class Java15BeispielNPE {

    static class Person {
        Address address;
    }

    static class Address {
        String street;
    }

    /**
     * Fehlermeldung früher:
     * Exception in thread "main" java.lang.NullPointerException
     *     at BeispielNPE.main(BeispielNPE.java:23)
     */
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.address.street.length());
    }
}
