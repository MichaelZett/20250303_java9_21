package de.zettsystems.java16_17.solution16_17;

public class AnimalPark {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Bob");

        // TODO use new Java api
        if (dog1 instanceof Dog d1) {
            play(d1);
        }

        Animal dog2 = new Dog("Bob");
        // TODO use new Java api
        System.out.println("\nAre both equal? %s".formatted(dog1.equals(dog2)));
//        System.out.printf("\nAre both equal? %s%n", dog1.equals(dog2));
    }

    static void play(Dog d) {
        System.out.println("Playing with Dog...");
        d.makeSound();
    }

    static void play(Cat c) {
        System.out.println("Playing with Cat...");
        c.makeSound();
    }
}

class Animal {
    void makeSound() {
        System.out.println("Generic sound");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Miau");
    }
}

class Dog extends Animal {
    private String name;

    Dog(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Au au");
    }

    // TODO use new Java api
    public boolean equals(Object o) {
        return o instanceof Dog d1 && d1.name.equals(name);
    }

}