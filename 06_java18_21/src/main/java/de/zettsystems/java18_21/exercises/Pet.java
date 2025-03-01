package de.zettsystems.java18_21.exercises;

interface Pet {
    String getName();
}

class Dog implements Pet {
    String name;

    Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Cat implements Pet {
    String name;

    Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Fish implements Pet {
    String name;

    Fish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}